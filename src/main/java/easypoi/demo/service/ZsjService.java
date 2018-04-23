/**
 * Author: hjw
 * Data: 2018/4/19 15:16
 * Description: Zsjservice层
 */
package easypoi.demo.service;

import easypoi.demo.entity.Zsj;

public interface ZsjService {
    /**
     * selectByPrimaryKey
     * @param id 根据id查询信息
     * @return
     */
    Zsj selectByPrimaryKey(Integer id);
}
