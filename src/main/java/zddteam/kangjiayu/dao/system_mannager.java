package zddteam.kangjiayu.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class system_mannager {
    @Id
    @GeneratedValue
    private Integer idsystem_mannager;
    private String suername;
    private String spassword;
    private Integer sage;
    private Integer ssex;
    private String sinttroduce;
    private Integer sstatus;

    public Integer getIdsystem_mannager() {
        return idsystem_mannager;
    }

    public void setIdsystem_mannager(Integer idsystem_mannager) {
        this.idsystem_mannager = idsystem_mannager;
    }

    public String getSuername() {
        return suername;
    }

    public void setSuername(String suername) {
        this.suername = suername;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getSinttroduce() {
        return sinttroduce;
    }

    public void setSinttroduce(String sinttroduce) {
        this.sinttroduce = sinttroduce;
    }

    public Integer getSstatus() {
        return sstatus;
    }

    public void setSstatus(Integer sstatus) {
        this.sstatus = sstatus;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
