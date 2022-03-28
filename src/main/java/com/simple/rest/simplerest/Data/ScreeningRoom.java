package com.simple.rest.simplerest.Data;

import lombok.AccessLevel;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class ScreeningRoom {
    @Id
    private final Long id;

//    @OneToMany(mappedBy = "screeningRoom")
//    private final List<Seat> seats;
//
//    @OneToOne(mappedBy = "movie")
//    private Screening screening;

}



