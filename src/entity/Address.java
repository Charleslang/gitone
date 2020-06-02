package entity;

import java.util.Date;

public class Address {
    private int id;
    private int userId;
    private int userType;
    private int isDelete;
    private Date createTime;
    private String university;
    private String details;

    public Address() {

    }

    public Address(int id, int userId, int userType, int isDelete, Date createTime, String university, String details) {
        this.id = id;
        this.userId = userId;
        this.userType = userType;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.university = university;
        this.details = details;
    }

    public Address(int userId, int userType, int isDelete, Date createTime, String university, String details) {
        this.userId = userId;
        this.userType = userType;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.university = university;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
