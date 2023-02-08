package rest.api.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rest.api.models.UserRest;

/**
 * Created by Afonseca on 14/01/2023.
 **/
@Controller
@RequestMapping("/availability")
@Slf4j
public class AvailabilityManagerController  {


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String>  add(@RequestBody @Validated UserRest user){
        return   ResponseEntity.status(HttpStatus.OK).build();
    }


}
