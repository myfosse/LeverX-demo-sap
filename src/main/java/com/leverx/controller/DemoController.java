package com.leverx.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** @author Andrei Yahorau */
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

  @GetMapping
  public @ResponseBody ResponseEntity<?> getDemo(
      @RequestParam(value = "name", defaultValue = "world") final String name) {
    return ResponseEntity.ok("Hello, " + name);
  }
}