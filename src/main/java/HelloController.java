import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/hello")
public class HelloController {

    public String sayHello() {
        log.info("Hello World");
        return "Hello World";
    }
}
