package demoTaxiDroneV2K.demoTaxiDroneV2Kapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String test() {
        return "index"; //view html page
    }
}
