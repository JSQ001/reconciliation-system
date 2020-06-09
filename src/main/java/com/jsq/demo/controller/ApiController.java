package com.jsq.demo.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/api")
@Slf4j
public class ApiController {
    @GetMapping("")
    public ResponseEntity<String> hello(){
        System.out.println("hello world!");
        log.trace("hello world!");
        log.info("hello world!");
        log.warn("hello world!");
        log.error("hello world!");
        log.debug("hello world!");
        return  new ResponseEntity<String>("hello world!", HttpStatus.OK);
    }
}
