package com.finalproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@RequestMapping(value = "/heroku/")
@RestController
@Slf4j

public class HerokuController {

    @GetMapping(value = "/get")
    @ResponseStatus(HttpStatus.OK)
    public String getOperation() {
        log.info("Calling Get Operation");
        return "Siempre serás para mi la más hermosa del mundo mundial";
    }

    @PostMapping(value = "/post")
    @ResponseStatus(HttpStatus.OK)
    public String postOperation() {
        log.info("Calling Post Operation");
        return "Te amo mucho Angie :3";
    }

}