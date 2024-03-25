package lk.ijse.gdse66.spring.services;

import lk.ijse.gdse66.spring.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAllCustomer();

    CustomerDto getCustomerDetails(String id);

    void saveCustomer(CustomerDto customerDto);

    void  updateCustomer(CustomerDto customerDto);

    void deleteCustomer(String id);

}
