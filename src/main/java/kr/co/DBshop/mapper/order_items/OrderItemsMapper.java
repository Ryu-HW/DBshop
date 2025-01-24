package kr.co.DBshop.mapper.order_items;

import kr.co.DBshop.dto.order_items.OrderItemsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemsMapper {

    public List<OrderItemsDto> selectOrderItems(int orderId);
    public void insertOrderItems(OrderItemsDto orderItemsDto);
    public int selectProdIdByName(String prodName);
    public double selectProdPriceByName(String prodName);
}
