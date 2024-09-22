package PROTOTYPE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class PrototypeController {

    private Tapucom tapucom;

    private Tapucom tapucom2;

    public PrototypeController(Tapucom tapucom, Tapucom tapucom2) {
        this.tapucom = tapucom;
        this.tapucom2 = tapucom2;
    }

    @GetMapping("/get-data")
    public String getBroker() {

        tapucom.setName("Kutluhan Palalıoğlu");
        tapucom2.setName("Kutluhan Palalıoğlu 2");

        return String.format("first broker = %s\nsecond broker = %s", tapucom.getName(), tapucom2.getName());
    }



}
