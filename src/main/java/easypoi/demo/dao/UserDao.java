package easypoi.demo.dao;

import easypoi.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * UserDao
 * @author: hjw
 * user表的dao
 */
@Mapper
public interface UserDao {
    /**
     * 根据id删除信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一条用户信息
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 动态插入信息
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据id查询信息
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 根据id动态更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据id更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

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