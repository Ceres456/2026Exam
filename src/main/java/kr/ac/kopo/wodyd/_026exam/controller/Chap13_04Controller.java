package kr.ac.kopo.wodyd._026exam.controller;

import kr.ac.kopo.wodyd._026exam.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam13_04")
public class Chap13_04Controller {

    @GetMapping
    public Person showJsonTypeData(){
        Person person = new Person();
        person.setName("PolyPark");
        person.setAge("20");
        person.setEmail("polypark@kopo.ac.kr");
        System.out.println(person);
        return person;
    }
}
