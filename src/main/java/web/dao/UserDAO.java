package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User findUserById(long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}
