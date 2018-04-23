/**
 * Author: hjw
 * Data: 2018/4/20 10:29
 * Description: zsj状态报表
 */
package easypoi.demo.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Status {
    /**
     * zsj编号
     */
    @Excel(name = "zsj编号", orderNum = "0")
    private Integer numbering;

    /**
     * zsj型号
     */
    @Excel(name = "zsj型号", orderNum = "1")
    private String model;

    /**
     * 停机
     */
    @Excel(name = "停机", replace = {"停机_1","运行_0"}, orderNum = "2")
    private Boolean is_downtime;
    /**
     * 故障
     */
    @Excel(name = "故障", replace = {"故障_1","运行_0"}, orderNum = "3")
    private Boolean is_malfunction;
    /**
     * 换模调机
     */
    @Excel(name = "换模调机", replace = {"换模调机_1","运行_0"}, orderNum = "4")
    private Boolean is_moldchang;
    /**
     * 手动
     */
    @Excel(name = "手动", replace = {"手动_1","运行_0"}, orderNum = "5")
    private Boolean is_manually;
    /**
     * 半自动
     */
    @Excel(name = "半自动", replace = {"半自动_1","运行_0"}, orderNum = "6")
    private Boolean is_semiautomatic;
    /**
     * 全自动
     */
    @Excel(name = "全自动", replace = {"全自动_1","运行_0"}, orderNum = "7")
    private Boolean is_autpmatic;

    public Status(){

    }

    public Status(Integer numbering, String model, Boolean is_downtime, Boolean is_malfunction, Boolean is_moldchang, Boolean is_manually, Boolean is_semiautomatic, Boolean is_autpmatic) {
        this.numbering = numbering;
        this.model = model;
        this.is_downtime = is_downtime;
        this.is_malfunction = is_malfunction;
        this.is_moldchang = is_moldchang;
        this.is_manually = is_manually;
        this.is_semiautomatic = is_semiautomatic;
        this.is_autpmatic = is_autpmatic;
    }

    public Integer getNumbering() {
        return numbering;
    }

    public void setNumbering(Integer numbering) {
        this.numbering = numbering;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getIs_downtime() {
        return is_downtime;
    }

    public void setIs_downtime(Boolean is_downtime) {
        this.is_downtime = is_downtime;
    }

    public Boolean getIs_malfunction() {
        return is_malfunction;
    }

    public void setIs_malfunction(Boolean is_malfunction) {
        this.is_malfunction = is_malfunction;
    }

    public Boolean getIs_moldchang() {
        return is_moldchang;
    }

    public void setIs_moldchang(Boolean is_moldchang) {
        this.is_moldchang = is_moldchang;
    }

    public Boolean getIs_manually() {
        return is_manually;
    }

    public void setIs_manually(Boolean is_manually) {
        this.is_manually = is_manually;
    }

    public Boolean getIs_semiautomatic() {
        return is_semiautomatic;
    }

    public void setIs_semiautomatic(Boolean is_semiautomatic) {
        this.is_semiautomatic = is_semiautomatic;
    }

    public Boolean getIs_autpmatic() {
        return is_autpmatic;
    }

    public void setIs_autpmatic(Boolean is_autpmatic) {
        this.is_autpmatic = is_autpmatic;
    }

    @Override
    public String toString() {
        return "Status{" +
                "numbering=" + numbering +
                ", model='" + model + '\'' +
                ", is_downtime=" + is_downtime +
                ", is_malfunction=" + is_malfunction +
                ", is_moldchang=" + is_moldchang +
                ", is_manually=" + is_manually +
                ", is_semiautomatic=" + is_semiautomatic +
                ", is_autpmatic=" + is_autpmatic +
                '}';
    }
}
