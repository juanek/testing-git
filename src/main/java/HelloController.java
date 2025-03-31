import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    public String sayHello() {
        return "Hello World";
    }
}
