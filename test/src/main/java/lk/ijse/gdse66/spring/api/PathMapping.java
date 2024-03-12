package lk.ijse.gdse66.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/")
public class PathMapping {

    @GetMapping
    public String getMethoad(){
        return "Path Variable Connect";
    }

}
