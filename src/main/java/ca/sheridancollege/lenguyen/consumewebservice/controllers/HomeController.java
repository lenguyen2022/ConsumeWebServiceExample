package ca.sheridancollege.lenguyen.consumewebservice.controllers;

import ca.sheridancollege.lenguyen.consumewebservice.beans.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    @Value("${REST_URL}")
    private String REST_URL;

    @GetMapping("/")
    public String index(Model model, RestTemplate restTemplate) {
        ResponseEntity<Student[]> responseEntity = restTemplate.getForEntity(REST_URL, Student[].class);
        model.addAttribute("students", responseEntity.getBody());
        return "viewstudents";
    }
}
