package com.simple.rest.simplerest;

import com.simple.rest.simplerest.Data.Screening;
import com.simple.rest.simplerest.Repositories.ScreeningRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Log4j2
@Controller
public class HomeController {
    @Autowired
    public HomeController(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    private final ScreeningRepository screeningRepository;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/screenings", method = RequestMethod.GET)
    public ResponseEntity<List<Screening>> getMovies(@RequestParam Map<String, String> params) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime startDate = LocalDateTime.parse(params.get("startDate"), formatter);
        LocalDateTime endDate = LocalDateTime.parse(params.get("endDate"), formatter);

        List<Screening> screeningsBetween = screeningRepository.getScreeningsByStartDateBetween(startDate, endDate);

        return new ResponseEntity<>(screeningsBetween, HttpStatus.OK);
    }

}
