import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SpringBootApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/test")
	String test1() {
		return "Hello There!";
	}
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(SpringBootApplication.class, args);
	}
	
	
}
