package org.ashik.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ArgumentNotValidException extends RuntimeException{

    private String messageCode;

    private String message;

    public ArgumentNotValidException(String message){
        super(message);
        this.messageCode = "0";
        this.message = message;
    }
}
