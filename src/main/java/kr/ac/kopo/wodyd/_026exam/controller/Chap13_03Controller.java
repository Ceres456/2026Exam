package kr.ac.kopo.wodyd._026exam.controller;

import kr.ac.kopo.wodyd._026exam.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/exam13_03")
public class Chap13_03Controller {
    @GetMapping
    public Person showJsonTypeData(){
        Person Person = new Person();
        Person person  = new Person();
        person.setName("PolyKim");
        person.setAge("30");
        person.setEmail("polykim@kopo");
        System.out.println(person);
        return person;
    }
}
