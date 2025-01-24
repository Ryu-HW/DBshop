package kr.co.DBshop.service.order_items;

import kr.co.DBshop.dto.order_items.OrderItemsDto;
import kr.co.DBshop.mapper.order_items.OrderItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemsService {

    @Autowired
    OrderItemsMapper orderItemsMapper;


    public List<OrderItemsDto> getOrderItems(int orderId){
        return orderItemsMapper.selectOrderItems(orderId);
    }

    public void createOrderItems(OrderItemsDto orderItemsDto){
        orderItemsMapper.insertOrderItems(orderItemsDto);
    }

}
