package kr.ac.kopo.wodyd._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/home")
public class EX05Controller {
    @GetMapping("/exam05")
//    @RequestMapping
    public String requestMethod() {
        return "view05";
    }

}
