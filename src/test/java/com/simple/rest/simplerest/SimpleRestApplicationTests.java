package com.simple.rest.simplerest;

import com.simple.rest.simplerest.Data.Movie;
import com.simple.rest.simplerest.Repositories.MovieRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
class SimpleRestApplicationTests {

	@Autowired
	private MovieRepository movieRepository;

//	@Autowired
//	private ScreeningRepository screeningRepository;
//
//	@Autowired
//	private ScreeningRoomRepository screeningRoomRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void testGetMoveisInTimeFrame()  {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		movieRepository.save(new Movie(1L,"Entangled", LocalDateTime.parse("2020-03-30 10:30", formatter)));
//		screeningRoomRepository.save(new ScreeningRoom(1L, new ArrayList<Seat>()));
//

//		screeningRepository.save(new Screening(1L,
//				movieRepository.getMovieById(1L),
//				LocalDateTime.parse("2020-03-30 10:30", formatter),
//				screeningRoomRepository.getScreeningRoomById(1L)));
//
//
//		List<Screening> screenings = screeningRepository.getScreeningsByStartDateBetween(
//				LocalDateTime.parse("2020-03-30 10:30", formatter),
//				LocalDateTime.parse("2020-03-30 11:30", formatter));
//
//		Assertions.assertEquals(screenings.size(), 1L);
//		Assertions.assertEquals(screenings.get(0).getMovie().getName(), "Entangled");
	}

}
