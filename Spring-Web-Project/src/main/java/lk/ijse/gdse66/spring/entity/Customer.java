package lk.ijse.gdse66.spring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity  //entity represented
@AllArgsConstructor
public class Customer {
    @Id //primary key
    private String id;
    private String name;
    private String address;



}
