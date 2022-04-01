package com.simple.rest.simplerest.Repositories;

import com.simple.rest.simplerest.Data.Screening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ScreeningRepository extends CrudRepository<Screening, Long> {

    List<Screening> getScreeningsByStartDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}
