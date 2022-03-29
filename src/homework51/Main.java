package homework51;

import homework51.model.User;
import homework51.service.UserService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(4);
        user.setLogin("login");
        user.setEmail("email");
        user.setPassword("5616");
        user.setDateOfRegistration(LocalDateTime.now());

        UserService userService = new UserService();
        int count = userService.userRegistration(user);
        if (count > 0){
            System.out.println("Success register");
        }else{
            System.out.println("Fail");
        }

    }
}
