package entity;

import java.util.Date;

public class Order {
//    order_id	int
//    pay_price	float
//    goods_num	int
//    order_time	datetime
//    pay_time	datetime
//    order_status	int
//    user_id	varchar
//    user_type	tinyint
//    user_nicknae	varchar
//    user_addr	varchar
    private int orderId;
    private float payPrice;
    private int goodsNum;
    private Date orderTime;
    private Date payTime;
    private int orderStatus;
    private String userId;
    private int userType;
    private String userNickname;
    private String userAddr;

    public Order() {

    }

    public Order(float payPrice, int goodsNum, Date orderTime, Date payTime, int orderStatus, String userId, int userType, String userNickname, String userAddr) {
        this.payPrice = payPrice;
        this.goodsNum = goodsNum;
        this.orderTime = orderTime;
        this.payTime = payTime;
        this.orderStatus = orderStatus;
        this.userId = userId;
        this.userType = userType;
        this.userNickname = userNickname;
        this.userAddr = userAddr;
    }

    public Order(int orderId, float payPrice, int goodsNum, Date orderTime, Date payTime, int orderStatus, String userId, int userType, String userNickname, String userAddr) {
        this.orderId = orderId;
        this.payPrice = payPrice;
        this.goodsNum = goodsNum;
        this.orderTime = orderTime;
        this.payTime = payTime;
        this.orderStatus = orderStatus;
        this.userId = userId;
        this.userType = userType;
        this.userNickname = userNickname;
        this.userAddr = userAddr;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(float payPrice) {
        this.payPrice = payPrice;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }
}
