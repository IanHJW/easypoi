package easypoi.demo.dao;

import easypoi.demo.entity.Zsj;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZsjDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Zsj record);

    int insertSelective(Zsj record);

    Zsj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zsj record);

    int updateByPrimaryKey(Zsj record);
}