package mapper;

import entity.Cart;
import entity.Goods;

import java.util.List;

public interface CartMapper {
    Cart getCartInfo(int userId);
    int updateCartInfo(String userId, Goods goods);
    int clearCart(String userId);
}
