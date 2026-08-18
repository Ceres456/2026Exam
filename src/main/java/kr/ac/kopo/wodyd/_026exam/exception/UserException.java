package kr.ac.kopo.wodyd._026exam.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class UserException extends RuntimeException {
    public UserException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
