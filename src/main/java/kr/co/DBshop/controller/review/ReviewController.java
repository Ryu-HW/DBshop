package kr.co.DBshop.controller.review;

import kr.co.DBshop.dto.review.ReviewDto;
import kr.co.DBshop.service.review.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    //크리에잇 홈페이지
    @GetMapping("/create")
    public String createPage(){
        return  "/review/create-review";
    }

    //    삽입 기능 구현
    @PostMapping
    @ResponseBody
    public void createReview(@RequestBody ReviewDto reviewDto){

        reviewService.createReview(reviewDto);
    }

//    //    한개 조회 상세페이지
//    @GetMapping("/{id}")
//    public String selectFruit(@PathVariable("id")int id, Model model){
//        try{
//            FruitDto fruitDto= mainService.selectItemById(id);
//            model.addAttribute("fruit",fruitDto);
//        }catch (IllegalStateException e){
//            model.addAttribute("message",e.getMessage());
//            return "errorId";
//        }
//        return "detail";
//    }
//    // 상품 목록
//    요청url형식 : /fruits?page=1&limit=10
//    @GetMapping
//    public String selectItems(@RequestParam(name = "page",defaultValue = "1")int page,
//                              @RequestParam(name = "limit",defaultValue = "3")int limit,
//                              Model model){
//        PageDto pageDto= mainService.selectItems(page,limit);
//        model.addAttribute("pageDto",pageDto);
//        return "itemsList";
//    }
//    // 삭제 기능
//    @GetMapping("/{id}/delete")
//    public String deleteItem(@PathVariable("id") int id){
//        mainService.deleteItem(id);
//        System.out.println("삭제완료");
//
//        return  "redirect:/fruits";
//    }
//    //    수정 기능
//    @GetMapping("/{id}/update")
//
//    public String updateItem(@PathVariable("id") int id,Model model){
//        try {
//            FruitDto fruitDto = mainService.selectItemById(id);
//            model.addAttribute("fruit", fruitDto);
//        }catch (IllegalStateException e){
//            model.addAttribute("message",e.getMessage());
//            return "errorId";
//        }
//        return "update";
//    }
//    @PostMapping("/{id}/update")
//    @ResponseBody
//    public  void updateItem(@RequestBody FruitDto fruitDto){
//        System.out.println(fruitDto.getName());
//        mainService.updateItem(fruitDto);
//    }
}
