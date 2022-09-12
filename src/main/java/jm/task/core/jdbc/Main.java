package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Nina", "Likova", (byte) 20);
        userService.saveUser("Andrey", "Rechkin", (byte) 55);
        userService.saveUser("Boris", "Elcin", (byte) 100);
        userService.saveUser("Utka", "Popekinski", (byte) 38);

        List<User> allUsers = userService.getAllUsers();
        for (User users : allUsers) {
            System.out.println(users);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
