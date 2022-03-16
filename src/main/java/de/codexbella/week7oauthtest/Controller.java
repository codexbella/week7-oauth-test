package de.codexbella.week7oauthtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
   @GetMapping("/calculate/{number1}+{number2}")
   public String calculate(@PathVariable int number1, @PathVariable int number2) {
      return "The result is: " + (number1 + number2);
   }
}
