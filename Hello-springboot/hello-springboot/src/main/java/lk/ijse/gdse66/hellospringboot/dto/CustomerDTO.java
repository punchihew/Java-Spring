package lk.ijse.gdse66.hellospringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 4/4/2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {
    private String Id;
    private String Name;
    private String Address;
}
