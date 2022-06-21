package archiver.archiver;

import org.springframework.web.bind.annotation.*;
import java.util.Random;

@RestController
@RequestMapping("api")
public class RandomNumberController {

    @GetMapping()
    public int randomNumber(){
        Random num = new Random();
        return num.nextInt(100);

    }

}
