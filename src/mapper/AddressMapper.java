package mapper;

import entity.Address;

public interface AddressMapper {
    int insertAddressInfo(Address address);
    int updateAddressInfo(String id);

}
