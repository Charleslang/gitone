package entity;

import java.util.Date;

public class Goods {
    private int id;
    private String name;
    private String price;
    private String number;
    private String type;
    private String photo;
    private Date addTime;

    public Goods() {

    }

    public Goods(String name, String price, String number, String type, String photo, Date addTime) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.type = type;
        this.photo = photo;
        this.addTime = addTime;
    }

    public Goods(int id, String name, String price, String number, String type, String photo, Date addTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.type = type;
        this.photo = photo;
        this.addTime = addTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
