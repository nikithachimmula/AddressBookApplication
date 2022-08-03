package com.bridgelabz.addressbookapp.exception;

import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AddressBookException extends RuntimeException{
    public AddressBookException(String message) {
        super(message);
    }
}