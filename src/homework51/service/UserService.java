package homework51.service;

import homework51.dao.UserDao;
import homework51.model.User;

public class UserService {
    UserDao userDao = new UserDao();
    public int userRegistration(User user){
        UserDao userDao = new UserDao();
        return userDao.insertUser(user);
    }

    public void userAuthorize(String username, String password){


    }
}
