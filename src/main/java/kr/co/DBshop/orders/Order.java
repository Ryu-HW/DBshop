package kr.co.DBshop.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {

    private Integer order_id;
    private Integer user_id;
    private String order_status;
    private Double total_amount;
    private String shipping_address;

}
