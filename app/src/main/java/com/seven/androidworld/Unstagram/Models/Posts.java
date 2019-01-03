package com.seven.androidworld.Unstagram.Models;

/**
 * Created by ${M.ROSTAMI} on 03/01/2019.
 */
public class Posts {

    private String na   = "";
    private int    pid      ;
    private String pht  = "";
    private String guid = "";
    private String cat  = "";
    private int    cnt      ;

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPht() {
        return pht;
    }

    public void setPht(String pht) {
        this.pht = pht;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
