//package com.simple.rest.simplerest.Data;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@RequiredArgsConstructor
//@NoArgsConstructor(force = true)
//@Getter
//@Entity
//@Table(name = "SEAT")
//public class Seat {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "row")
//    private final int row;
//
//    @Column(name = "number")
//    private final int number;
//
////    @ManyToOne(fetch = FetchType.EAGER, optional = false)
////    @JoinColumn(name = "screeningRoom_id", nullable = false)
////    private final ScreeningRoom screeningRoom;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Seat seat = (Seat) o;
//        return row == seat.row && number == seat.number && Objects.equals(id, seat.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, row, number);
//    }
//}
