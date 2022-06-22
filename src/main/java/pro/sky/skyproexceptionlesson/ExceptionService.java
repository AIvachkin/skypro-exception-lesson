package pro.sky.skyproexceptionlesson;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ExceptionService {

    public boolean check(String login, String password, String confirmPassword) {
        if (login.length() < 20) {
        }
        return true ;
    }

    public boolean match(String input, String input2) {
        Pattern p = Pattern.compile("^(\\d|[a-zA-Z_]).([\\da-zA-Z_])*");
//        return p.matcher(input, input2).matches();
        return p.matcher(input).matches()&&p.matcher(input2).matches() ;
    }
}
