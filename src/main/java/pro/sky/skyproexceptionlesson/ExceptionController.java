package pro.sky.skyproexceptionlesson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    private final ExceptionService exceptionService ;

    public ExceptionController(ExceptionService exceptionService) {
        this.exceptionService = exceptionService;
    }

    @GetMapping("/hello")
    public String hello () {
return "<h1>Добро пожаловать в исключения!</h1>" ;
    }

    @GetMapping("/identify")
    public boolean identify (String login, String password, String confirmPassword) {
//        return exceptionService.check(login, password, confirmPassword) ;
        return exceptionService.match (login, password) ;

    }

}
