package kr.co.DBshop.dto.order_items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemsDto {

    private Integer orderItemId;
    private int orderId;
    private int productId;
    private int quantity;
    private double price;


    public OrderItemsDto(int orderId, int productId, int quantity, double price) {
        this.orderItemId = null;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
}
