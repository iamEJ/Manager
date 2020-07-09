package lt.management.oms.crude;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/")
public class AdminRestControllerV1 {

    @GetMapping("test")
    public String testAdmin(){
        return "Admim OK";
    }
}
