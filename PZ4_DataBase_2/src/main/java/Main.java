import models.Auto;
import models.User;
import services.UserServiceImpl;

import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User("Leksus Leks",20);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
//        userService.saveUser(user);
        userService.updateUser(user);
    }
}
