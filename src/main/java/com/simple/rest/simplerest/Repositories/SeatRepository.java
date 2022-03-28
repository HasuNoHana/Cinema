package com.simple.rest.simplerest.Repositories;

import com.simple.rest.simplerest.Data.Seat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Long> {
}
