package controller;

import entity.Cart;
import entity.Goods;
import service.CartService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartController {

    private CartService cartService;

    public Cart getCartInfo(int userId) {
        Cart cartList= cartService.getCartInfo(userId);
        return cartList;
    }

    public Map<String, Boolean> updateCartInfo(String userId, Goods goods){
        Map<String, Boolean> map = new HashMap<>();
        return map;
    }

    public Map<String, Boolean> clearCart(String userId) {
        Map<String, Boolean> map = new HashMap<>();
        return map;
    }
}
