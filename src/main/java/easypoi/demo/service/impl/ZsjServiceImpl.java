/**
 * Author: hjw
 * Data: 2018/4/19 15:17
 * Description: ZsjService层的实现类
 */
package easypoi.demo.service.impl;

import easypoi.demo.dao.ZsjDao;
import easypoi.demo.entity.Zsj;
import easypoi.demo.service.ZsjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("zsjService")
public class ZsjServiceImpl implements ZsjService{

    @Autowired
    private ZsjDao zsjDao;

    @Override
    public Zsj selectByPrimaryKey(Integer id) {
        return zsjDao.selectByPrimaryKey(id);
    }
}
