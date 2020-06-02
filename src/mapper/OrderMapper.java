package mapper;

import entity.Order;

public interface OrderMapper {
    int insertOrderInfo(Order order);
    int updateOrderInfo(int orderId);
}
