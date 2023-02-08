package rest.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Afonseca on 14/01/2023.
 **/
@DisplayName("Manager Controller")
@SpringBootTest
@AutoConfigureMockMvc
class AvailabilityManagerControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @DisplayName("Add availability")
    @Test
    void addAvailability() throws JsonProcessingException {
        String jsonRequest = "{\n" +
                "  \"email\": \"altilianofonseca39@gmail.com\",\n" +
                "  \"role\": \"CANDIDATE\",\n" +
                "  \"availabilities\": [\n" +
                "    {\n" +
                "      \"day\": \"2023-02-07\",\n" +
                "      \"startTime\": \"08:00\",\n" +
                "      \"finishTime\": \"18:00\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        try {
            mockMvc.perform(MockMvcRequestBuilders.post("/availability/add")
                            .content(jsonRequest)
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            fail(e.getMessage());
        }


    }




}


