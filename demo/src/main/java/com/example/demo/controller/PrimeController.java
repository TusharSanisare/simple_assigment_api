package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.PrimeService;

@RestController
@RequestMapping("/api")
public class PrimeController {

  private final PrimeService primeService;

  public PrimeController(PrimeService primeService) {
    this.primeService = primeService;
  }

  @GetMapping("/is-prime")
  public ResponseEntity<?> isPrime(@RequestParam(required = false) String number) {
    try {
      if (number == null) {
        return ResponseEntity.badRequest().body("Missing 'number' query parameter.");
      }
      int num = Integer.parseInt(number);
      boolean isPrime = primeService.isPrime(num);
      return ResponseEntity.ok().body(
          String.format("Number %d is %s.", num, isPrime ? "a prime number" : "not a prime number"));
    } catch (NumberFormatException e) {
      return ResponseEntity.badRequest().body("Invalid number format.");
    }
  }
}
