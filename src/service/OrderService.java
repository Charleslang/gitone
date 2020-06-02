package service;

import entity.Order;
import mapper.OrderMapper;

import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private OrderMapper orderMapper;

    public Map<String, Boolean> insertOrderInfo(Order order){
        int insert = orderMapper.insertOrderInfo(order);
        return new HashMap<String, Boolean>();
    }

    public Map<String, Boolean>updateOrderInfo(int orderId){
        int update = orderMapper.updateOrderInfo(orderId);
        return new HashMap<String, Boolean>();
    }
}
