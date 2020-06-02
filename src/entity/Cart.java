package entity;

public class Cart {

    private int cartId;
    private int goodsNum;
    private float allPrice;
    private int cartStatus;
    private String userId;
    private int goodsId;
    private String goodsName;

    public Cart() {

    }

    public Cart(int goodsNum, float allPrice, int cartStatus, String userId, int goodsId, String goodsName) {
        this.goodsNum = goodsNum;
        this.allPrice = allPrice;
        this.cartStatus = cartStatus;
        this.userId = userId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
    }

    public Cart(int cartId, int goodsNum, float allPrice, int cartStatus, String userId, int goodsId, String goodsName) {
        this.cartId = cartId;
        this.goodsNum = goodsNum;
        this.allPrice = allPrice;
        this.cartStatus = cartStatus;
        this.userId = userId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public float getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(float allPrice) {
        this.allPrice = allPrice;
    }

    public int getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(int cartStatus) {
        this.cartStatus = cartStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
