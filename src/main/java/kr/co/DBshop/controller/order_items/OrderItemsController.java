package kr.co.DBshop.controller.order_items;


import kr.co.DBshop.dto.order_items.OrderItemsDto;
import kr.co.DBshop.service.order_items.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order_items")
public class OrderItemsController {

    @Autowired
    OrderItemsService orderItemsService;


    //오더아이디를 갖고 order_items의 정보를 가져와야함
    @GetMapping("/show/{orderId}")
    public String getOrderItems(@PathVariable("orderId") int orderId, Model model){
        List<OrderItemsDto> orderItems = orderItemsService.getOrderItems(orderId);

        model.addAttribute("orderItems", orderItems);
        return "/order_items/show";
    }

//    @PostMapping("/create")
//    public String createOrderItems(@ModelAttribute OrderItemsDto orderItemsDto,Model model){
//
//    }

}
