package controller;

import entity.Order;
import service.OrderService;

import java.util.HashMap;
import java.util.Map;

public class OrderController {
    private OrderService orderService;

    public Map<String, Boolean> insertOrderInfo(Order order){
        return new HashMap<String, Boolean>();
    }

    public Map<String, Boolean> updateOrderInfo(int orderId){
        return new HashMap<String, Boolean>();
    }
}
