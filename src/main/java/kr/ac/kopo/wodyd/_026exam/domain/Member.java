package kr.ac.kopo.wodyd._026exam.domain;

import lombok.Data;
import lombok.Setter;

@Data
public class Member {
    private String id;
    private String passwd;
    private String city;
    private String sex;
    private String[] hobby;
    private String greeting;



}
