package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import system.dao.UserDao;
import system.model.User;

import java.util.List;

/**
 * Created by Max on 16.07.2017.
 */

@Service
@RequestMapping("/users")
public class UserService {
    @Autowired
    private UserDao userDao;

    @ResponseBody
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
