package kr.ac.kopo.wodyd._026exam.domain;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String age;
    private String email;

    public Person() {
    }

    public Person(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
