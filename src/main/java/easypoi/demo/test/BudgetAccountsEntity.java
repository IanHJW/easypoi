package easypoi.demo.test;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * Author: hjw
 * Data: 2018/4/18 10:02
 * Description: 预算
 */
public class BudgetAccountsEntity {

    @Excel(name = "编码")
    private String code;

    @Excel(name = "名称")
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
