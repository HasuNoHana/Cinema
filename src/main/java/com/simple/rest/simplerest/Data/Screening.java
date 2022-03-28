package com.simple.rest.simplerest.Data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
//@Table(name = "screenings")
public class Screening {

    @Id
    @Column(name = "id")
    private final Long id;

    @ManyToOne
    private Movie movie;
//    @JoinColumn(name = "movie_id", nullable = false)


//    private final LocalDateTime startDate;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "screening_room_id", referencedColumnName = "id")
//    private final ScreeningRoom screeningRoom;
}
