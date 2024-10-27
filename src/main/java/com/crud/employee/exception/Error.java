package com.crud.employee.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public class Error {

    private String url;
    private HttpStatus httpStatus;
    private String message;
}
