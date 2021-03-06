package com.udacity.vehicles.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Price not found for this vehicleId")
public class PriceNotFoundException extends RuntimeException{

    public PriceNotFoundException() {

    }

    public PriceNotFoundException(Long vehicleId) {
        super(String.format("Price not found with vehicleId %d", vehicleId));
    }

}
