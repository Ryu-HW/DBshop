package kr.co.DBshop.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrdersMapper ordersMapper;

    public List<Order> getAllOrders() {
        return ordersMapper.getOrders();
    }

    public Order getOrderById(Long orderId) {
        return ordersMapper.getOrderById(orderId);
    }

    public void updateOrder(Order order) {
        ordersMapper.updateOrder(order);
    }

    public void insertOrder(Order order) {
        ordersMapper.insertOrder(order);
    }

    public void deleteOrder(Integer orderId) {
        ordersMapper.deleteOrder(orderId);
    }


}
