package com.simple.rest.simplerest.Data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Objects;


@Getter
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "SCREENING_ROOM")
public class ScreeningRoom {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private final Long id;

//    @OneToMany(mappedBy = "screeningRoom", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private Set<Seat> seats;

    @OneToOne(mappedBy = "screeningRoom")
    private Screening screening;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScreeningRoom that = (ScreeningRoom) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



