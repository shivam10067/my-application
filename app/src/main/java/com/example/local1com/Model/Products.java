package com.example.local1com.Model;



public class Products {
    private String pname,decsription,image,category,pid,date,time,price;
    public Products()
    {

    }

    public Products(String pname, String decsription, String image, String category, String pid, String date, String time,String price) {
        this.pname = pname;
        this.decsription = decsription;
        this.image = image;
        this.category = category;
        this.pid = pid;
        this.date = date;
        this.price = price;

    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

