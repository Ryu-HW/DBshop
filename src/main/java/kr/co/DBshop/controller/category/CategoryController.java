package kr.co.DBshop.controller.category;

import kr.co.DBshop.dto.category.CategoryDto;
import kr.co.DBshop.mapper.category.CategoryMapper;
import kr.co.DBshop.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


//    @GetMapping("/hello")
//    public String categoryHello(){
//        return "hello";
//    }

    @GetMapping("/create")
    public String create() {
        return "category/create-category";
    }

    @PostMapping
    @ResponseBody
    public void createCategory(@RequestBody CategoryDto categoryDto) {
        System.out.println(categoryDto.getCategory_name());
        categoryService.createCategory(categoryDto);  // 직접 Mapper를 호출하지 않고 Service를 통해 처리
    }
}


