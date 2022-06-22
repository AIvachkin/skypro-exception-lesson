package pro.sky.skyproexceptionlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkyproExceptionLessonApplication {

	public static void main(String[] args) {

		SpringApplication.run(SkyproExceptionLessonApplication.class, args);

		identify("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");

	}

	public static String identify  (String login, String password, String confirmPassword) {
		if (login.length() < 20) {
			System.out.println("true");
		}
		return "true" ;
	}

}
