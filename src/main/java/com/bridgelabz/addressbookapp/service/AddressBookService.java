package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        AddressBookData addressBookData = new AddressBookData(1,new AddressBookDTO("Nikitha",
                "Reddy", "8498021579", "nikithachimmula97@gmail.com", "Hyderbad",
                "Gachibowli", "Telangana", 500070));
        addressBookDataList.add(addressBookData);
        return addressBookDataList;

    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        AddressBookData addressBookData = new AddressBookData(personId, new AddressBookDTO("Nikitha",
                "Reddy", "8498021579", "nikithachimmula97@gmail.com", "Hyderbad",
                "Gachibowli", "Telangana", 500070));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData= null;
        addressBookData = new AddressBookData(personId, addressBookDTO);
        return  addressBookData;
    }

    @Override
    public void deleteAddressBookData(int personId) {

    }

}