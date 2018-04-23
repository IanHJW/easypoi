/**
 * Author: hjw
 * Data: 2018/4/18 16:42
 * Description: 实现接口UserService
 */
package easypoi.demo.service.impl;

import easypoi.demo.dao.UserDao;
import easypoi.demo.entity.User;
import easypoi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao){
        Assert.notNull(userDao,"userDao不能为null");
        this.userDao = userDao;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public ArrayList<User> findUsername(String name) {
        return userDao.findUsername(name);
    }

    @Override
    public ArrayList<User> findAll(User record) {
        return userDao.findAll(record);
    }
}
