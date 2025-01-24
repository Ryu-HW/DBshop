package kr.co.DBshop.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {


    @GetMapping("/create")
    public String createproducts(){
        return "/products/productscreate";
    }




}
