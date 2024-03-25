package lk.ijse.gdse66.spring.services;

import lk.ijse.gdse66.spring.dto.CustomerDto;
import lk.ijse.gdse66.spring.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServicesImpl implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;

    ArrayList<CustomerDto> customerList = new ArrayList<>();

    {
        customerList.add(new CustomerDto("C001","Navishka","Matara"));
        customerList.add(new CustomerDto("C002","lakshan","Galle"));
        customerList.add(new CustomerDto("C003","Savinda","Thangalla"));
    }

    @Override
    public List<CustomerDto> getAllCustomer() {

        return customerList;

    }

    @Override
    public CustomerDto getCustomerDetails(String id) {
        for (CustomerDto customer : customerList){
            if (customer.getId().equals(id))
                return customer;
        }
        return null;
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {

        customerList.add(customerDto);

        }


    @Override
    public boolean updateCustomer(CustomerDto customerDto) {
        for (CustomerDto customer : customerList) {
            if (customer.getId().equals(customerDto.getId())){
                customer.setName(customerDto.getName());
                customer.setAddress(customerDto.getAddress());

                return true;
            }
        }
        return false;
    }


    @Override
    public void deleteCustomer(String id) {
        for (CustomerDto customer : customerList){
            if (customer.getId().equals(id))
                customerList.remove(customer);

        }
    }
}
