package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 @RestController
@RequestMapping("/api/v1/users")

 public class UserController {
     @RequestMapping("/hello")
     public String hello() {
         return "Hello, User!";
     }

     @RequestMapping("/goodbye")
     public String goodbye() {
         return "Goodbye, User!";
     }

}
