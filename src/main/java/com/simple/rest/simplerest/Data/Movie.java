package com.simple.rest.simplerest.Data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
//@Table(name = "movies")
public class Movie {

    @Id
//    @Column(name = "id")
    private final Long id;
    private final String name;
    private final LocalDateTime startDate;


//    @OneToMany(targetEntity = Screening.class)
//    @OneToMany(mappedBy = "movie")
//    private List<Screening> screenings = new ArrayList<>();


//    private final Type type;
//
//    private enum Type{
//        HORROR, ACTION, COMEDY
//    }
}
