package com.udacity.vehicles.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Maps not found")
public class MapsNotFoundException extends RuntimeException  {

    public MapsNotFoundException() {

    }

    public MapsNotFoundException(String message) {
        super(message);
    }
}
