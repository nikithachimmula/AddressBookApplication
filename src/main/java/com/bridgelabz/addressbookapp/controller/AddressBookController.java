package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddressBook")
public class AddressBookController {

    @GetMapping(value = {"/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Nikitha",
                "Reddy", "8498021579", "nikithachimmula97@gmail.com", "Hyderbad",
                "Gachibowli", "Telangana", 500070));
        ResponseDTO responseDTO = new ResponseDTO("Success Call!!!", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = {"/get/{personId}"})
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable int personId) {
        AddressBookData addressBookData = new AddressBookData(101, new AddressBookDTO("Nikitha",
                "Reddy", "8498021579", "nikithachimmula97@gmail.com", "Hyderbad",
                "Gachibowli", "Telangana", 500070));
        ResponseDTO responseDTO = new ResponseDTO("Success Call for Person Id!!!", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping(value = {"/create"})
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(2, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data ADDED Successfully!!!", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping(value = {"/update/{personId}"})
    public ResponseEntity<ResponseDTO> editAddressBookData(@PathVariable int personId,
                                                           @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(personId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data UPDATED Successfully!!!", addressBookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = {"/delete/{personId}"})
    public ResponseEntity<ResponseDTO> removeAddressBookData(@PathVariable int personId) {
        ResponseDTO responseDTO = new ResponseDTO("Data DELETED Successfully!!!", "ID number: " + personId + " DELETED!!!");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}