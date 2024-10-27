package com.crud.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class EmployeeNotFoundException extends RuntimeException {

    private String message;
    private HttpStatus httpCode;

}
