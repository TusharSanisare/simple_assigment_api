package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {

  public boolean isPrime(int number) {
    if (number <= 1)
      return false;
    if (number == 2)
      return true;
    if (number % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(number); i += 2) {
      if (number % i == 0)
        return false;
    }
    return true;
  }
}
