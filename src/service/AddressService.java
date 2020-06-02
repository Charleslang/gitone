package service;

import entity.Address;
import mapper.AddressMapper;

import java.util.HashMap;
import java.util.Map;

public class AddressService {
    private AddressMapper addressMapper;

    public Map<String, Boolean> insertAddressInfo(Address address){
        return new HashMap<String, Boolean>();
    }
    public Map<String, Boolean> updateAddressInfo(String id){
        return new HashMap<String, Boolean>();
    }
}
