package com.simple.rest.simplerest.Data;

import com.simple.rest.simplerest.Data.ScreeningRoom;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class Seat {

    @Id
    private final Long id;
    private final int row;
    private final int number;


//    @ManyToOne
//    @JoinColumn(name = "screening_room_id", nullable = false)
//    private ScreeningRoom screeningRoom;
}
