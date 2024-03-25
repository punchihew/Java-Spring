package lk.ijse.gdse66.spring.services.api;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Transformer {

    @Autowired
    ModelMapper mapper;

    public CustomerDto fromCustomerEntity(Customer customer){
        CustomerDto customerDto = mapper.map(customer, CustomerDto.class);
        return customerDto;
    }

    public Customer toCustomerEntity(CustomerDto customerDto){
        Customer customer = mapper.map(customerDto, Customer.class);
        return customer;
    }

}
