package kr.ac.kopo.wodyd._026exam.domain;

import lombok.Data;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Member {
    private String name;
    private MultipartFile fileImage;
}
