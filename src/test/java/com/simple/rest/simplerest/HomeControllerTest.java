package com.simple.rest.simplerest;

import com.simple.rest.simplerest.Repositories.MovieRepository;
import com.simple.rest.simplerest.Repositories.ScreeningRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MovieRepository movieRepository;

    @MockBean
    private ScreeningRepository screeningRepository;

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }

    @Test
    public void testGetMoveisInTimeFrame() throws Exception {
        mockMvc.perform(get("/screenings?startDate=2020-03-30 10:30&endDate=2020-03-30 11:30"))
                .andExpect(status().isOk());
//                .andExpect(view().name("home"));
    }

}