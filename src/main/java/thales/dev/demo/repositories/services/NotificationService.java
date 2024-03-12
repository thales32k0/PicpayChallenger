package thales.dev.demo.repositories.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import thales.dev.demo.user.User;

@Service
public class NotificationService {


    public void sendNotification(User user, String message){

        String email = user.getEmail();

        System.out.println(email+message);
    }
}
