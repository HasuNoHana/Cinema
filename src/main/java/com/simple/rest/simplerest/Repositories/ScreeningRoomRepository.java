package com.simple.rest.simplerest.Repositories;

import com.simple.rest.simplerest.Data.ScreeningRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningRoomRepository extends CrudRepository<ScreeningRoom, Long> {

    ScreeningRoom getScreeningRoomById(Long id);
}
