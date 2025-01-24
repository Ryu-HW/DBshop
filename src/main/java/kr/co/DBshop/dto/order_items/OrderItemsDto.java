package kr.co.DBshop.dto.order_items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemsDto {

    private int orderItemId;
    private int orderId;
    private int productId;
    private int quantity;
    private double price;



}
