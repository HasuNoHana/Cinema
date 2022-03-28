package com.simple.rest.simplerest.Repositories;


import com.simple.rest.simplerest.Data.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {

    Movie getMovieById(Long id);

    List<Movie> getMoviesByStartDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}
