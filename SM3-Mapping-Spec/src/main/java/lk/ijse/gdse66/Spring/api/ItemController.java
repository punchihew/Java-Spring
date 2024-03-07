package lk.ijse.gdse66.Spring.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String SaveItemJson(){
        return "SaveItemJson() i accept only application/json";
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String SaveItemXmll(){
        return "SaveItemMultipal()i accept only application/xml";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String SaveItemMultipalFormDeta(){
        return "SaveItemMultipal() i accept only application/formData";
    }
    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String SaveItemUrl(){
        return "SaveItemMultipal() i accept only application/url";
    }


    /*------------produces-------------*/

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String GetAllItem(){
        return "GetAllItem";
    }
}
