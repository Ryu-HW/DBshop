package kr.co.DBshop.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/detail/{order_id}")
    public String orderDetail(@PathVariable("order_id") Long orderId, Model model) {
        Order order = orderService.getOrderById(orderId);

        model.addAttribute("order", order);

        return "orders/detail";
    }

    @GetMapping("/orders/show")
    public String ordersShow(Model model) {
        List<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "orders/show";
    }

    @GetMapping("/orders/delete/{order_id}")
    public String deleteOrder(@PathVariable("order_id") Integer orderId) {
        orderService.deleteOrder(orderId);
        return "redirect:/orders/show";
    }

    @GetMapping("/orders/create")
    public String createOrderForm() {
        return "orders/create";
    }

    @PostMapping("/orders/create")
    public String createOrder(@ModelAttribute Order order) {
        orderService.insertOrder(order);
        return "redirect:/orders/show";
    }

    @GetMapping("/orders/update/{order_id}")
    public String orderUpdate(@PathVariable("order_id") Long orderId, Model model) {
        Order order = orderService.getOrderById(orderId);
        model.addAttribute("order", order);

        return "orders/update";
    }

    @PostMapping("/orders/update")
    public String processOrderUpdate(@ModelAttribute Order order) {
        orderService.updateOrder(order);
        return "redirect:/orders/show";
    }

}
