package kr.ac.kopo.wodyd._026exam.domain;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Member2 {
    @MemberId
    private String memberId;

    @Size(min = 4, max = 10, message = "비밀번호는 최소 4에서 최대 10개의 문자열로 작성해야합니다.")
    private String passwd;
}
