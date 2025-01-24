package kr.co.DBshop.orders;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {

    void insertOrder(Order order);
    List<Order> getOrders();
    Order getOrderById(Long orderId);
    void updateOrder(Order order);
    void deleteOrder(Integer orderId);
}
