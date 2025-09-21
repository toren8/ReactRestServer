package net.nickmeyer.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DataController {
    @GetMapping("/api/data")
    public String getData(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name;
    }
}
