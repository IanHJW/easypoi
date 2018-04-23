/**
 * Author: hjw
 * Data: 2018/4/18 16:42
 * Description: user的Service层
 */
package easypoi.demo.service;

import easypoi.demo.entity.User;

import java.util.ArrayList;

/**
 * @author hjw
 */
public interface UserService {
    /**
     * selectByPrimaryKey
     * @param id 根据id查询信息
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * findAllUser
     * @param name 根据姓名查询记录
     * @return
     */
    ArrayList<User> findUsername(String name);

    /**
     * findAll
     * @param record 查询表中所有信息
     * @return
     */
    ArrayList<User> findAll(User record);
}
