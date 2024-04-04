package lk.ijse.gdse66.hellospringboot.services;

import lk.ijse.gdse66.hellospringboot.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 4/4/2024
 */
@Service
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerDetails(String id);
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(String id , CustomerDTO customerDTO);
    void deleteCustomer(String id);
}
