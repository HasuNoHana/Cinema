package com.simple.rest.simplerest.Data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "SCREENING")
public class Screening {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private final Long id;

    @Column(name = "startDate")
    private final LocalDateTime startDate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    private final Movie movie;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "screening_room_id")
    private final ScreeningRoom screeningRoom;

    @Override
    public String toString() {
        return "Screening{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", movie=" + movie.getName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Screening screening = (Screening) o;
        return Objects.equals(id, screening.id) && Objects.equals(startDate, screening.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate);
    }
}
