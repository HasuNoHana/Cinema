package com.simple.rest.simplerest;

import com.simple.rest.simplerest.Data.Movie;
import com.simple.rest.simplerest.Data.Screening;
import com.simple.rest.simplerest.Data.ScreeningRoom;
import com.simple.rest.simplerest.Repositories.MovieRepository;
import com.simple.rest.simplerest.Repositories.ScreeningRepository;
import com.simple.rest.simplerest.Repositories.ScreeningRoomRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class SimpleRestApplicationTests {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ScreeningRepository screeningRepository;

    @Autowired
    private ScreeningRoomRepository screeningRoomRepository;


    @Test
    public void checkIfRelationshipBetweenMovieAndScreening() { //TODO remove me

        Movie entangled = new Movie(1L, "Entangled");
        ScreeningRoom screeningRoom = new ScreeningRoom(1L);
        Screening screening = new Screening(1L, LocalDateTime.parse("2020-03-30 10:30", FORMATTER), entangled, screeningRoom);

        movieRepository.save(entangled);
        screeningRoomRepository.save(screeningRoom);
        screeningRepository.save(screening);

        assertThat(movieRepository.getMovieById(1L).getScreenings().size()).isEqualTo(1);
        assertThat(movieRepository.getMovieById(1L).getScreenings()).contains(screening);
    }

    @Test
    public void shouldGetScreeningsBetweenHours() {

        //given
        Movie entangled = new Movie(1L, "Entangled");
        ScreeningRoom screeningRoom = new ScreeningRoom(1L);
        Screening screening = new Screening(1L, LocalDateTime.parse("2020-03-30 10:30", FORMATTER), entangled, screeningRoom);

        movieRepository.save(entangled);
        screeningRoomRepository.save(screeningRoom);
        screeningRepository.save(screening);

        //when
        List<Screening> screenings = screeningRepository.getScreeningsByStartDateBetween(
                LocalDateTime.parse("2020-03-30 10:30", FORMATTER),
                LocalDateTime.parse("2020-03-30 11:30", FORMATTER));

        //then
        assertThat(screenings.size()).isEqualTo(1);
        assertThat(screenings.get(0).getMovie()).isEqualTo(entangled);
        assertThat(screenings.get(0).getScreeningRoom()).isEqualTo(screeningRoom);
    }
}
