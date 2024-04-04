package lk.ijse.gdse66.hellospringboot.repository;

import lk.ijse.gdse66.hellospringboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 4/4/2024
 */
public interface CustomerRepo extends JpaRepository<Customer,String> {

}
