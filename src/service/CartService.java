package service;

import entity.Cart;
import entity.Goods;
import mapper.CartMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartService {
    private CartMapper cartMapper;

    public Cart getCartInfo(int userId) {
        Cart cartList= cartMapper.getCartInfo(userId);
        return cartList;
    }

    public Map<String, Boolean> updateCartInfo(String userId, Goods goods){
        return new HashMap<String, Boolean>();
    }

    public Map<String, Boolean> clearCart(String userId) {
        int clear = cartMapper.clearCart(userId);
        return new HashMap<String, Boolean>();
    }


}
