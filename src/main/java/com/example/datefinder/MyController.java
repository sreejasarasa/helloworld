package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.*;
import java.time.format.DateTimeFormatter;
@RestController;
public class MyController {
    @GetMapping("/")
    public String addingDays(){
        LocalDate date = LocalDate.now();
        LocalDate newDate = date.plusDays(100);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String result = newDate.format(df);
        return result;
    }
}
