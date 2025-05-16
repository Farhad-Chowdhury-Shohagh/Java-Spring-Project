package SpringProject.Spring.AppointmentManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppointmentManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppointmentManagerApplication.class, args);
    }
}

//Access H2 console: http://localhost:8080/h2-console
//
//API endpoints at: http://localhost:8080/appointments