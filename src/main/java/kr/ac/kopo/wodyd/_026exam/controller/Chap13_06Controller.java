package kr.ac.kopo.wodyd._026exam.controller;

import kr.ac.kopo.wodyd._026exam.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Period;

@Controller
@RequestMapping("/exam13_06")
public class Chap13_06Controller {
    @GetMapping
    public String showForm(@ModelAttribute Person person){
        return "viewPage13_06_form";
    }

    @PutMapping
    public String submit(@ModelAttribute Person person, Model model){
        model.addAttribute("data1", "@PutMapping 적용하기");
        model.addAttribute("data2", person);
        return "viewPage13_06_result";
    }
}
