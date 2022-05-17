package po;

import java.util.Date;

public class Good {
    private int gid;  //商品编号
    private String goodname; //商品名称
    private String goodbrand;//商品品牌
    private Date intime; //进货时间
    private Date saletime;//销售时间
    private double inprice;//进价
    private double saleprice;//售价
    private int stock;//剩余量
    private String agent;//代理商

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getGoodbrand() {
        return goodbrand;
    }

    public void setGoodbrand(String goodbrand) {
        this.goodbrand = goodbrand;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public double getInprice() {
        return inprice;
    }

    public void setInprice(double inprice) {
        this.inprice = inprice;
    }

    public double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
}
