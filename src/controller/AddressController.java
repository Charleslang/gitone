package controller;

import entity.Address;
import service.AddressService;

import java.util.HashMap;
import java.util.Map;

public class AddressController {

    private AddressService addressService;

    public Map<String, Boolean> insertAddressInfo(Address address){
        return new HashMap<String, Boolean>();
    }
    public Map<String, Boolean> updateAddressInfo(String id){
        return new HashMap<String, Boolean>();
    }
}
