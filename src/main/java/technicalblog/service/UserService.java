package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.Model.User;

@Service
public class UserService {

    public static boolean login(User user) {
        if(user.getUsername().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }

}
