package lk.ijse.gdse66.hellospringboot.services.impl;

import lk.ijse.gdse66.hellospringboot.dto.CustomerDTO;
import lk.ijse.gdse66.hellospringboot.entity.Customer;
import lk.ijse.gdse66.hellospringboot.repository.CustomerRepo;
import lk.ijse.gdse66.hellospringboot.services.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 4/4/2024
 */
@Service
public class CustomerServicesImpl implements CustomerService {


    CustomerRepo customerRepo;
    ModelMapper mapper;

    public CustomerServicesImpl(CustomerRepo customerRepo, ModelMapper mapper) {
        this.customerRepo = customerRepo;
        this.mapper = mapper;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
      return customerRepo.findAll().stream().map(customer -> mapper.map(customer,CustomerDTO.class)).toList();
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return null;
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
       return mapper.map(customerRepo.save(mapper.map(customerDTO, Customer.class)),CustomerDTO.class);

    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
