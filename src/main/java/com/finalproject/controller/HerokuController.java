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
        return "Hello World, this is a get operation";
    }

    @PostMapping(value = "/post")
    @ResponseStatus(HttpStatus.OK)
    public String postOperation() {
        log.info("Calling Post Operation");
        return "Hello world, this is a post operation";

    }
}