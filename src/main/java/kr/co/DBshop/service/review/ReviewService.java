package kr.co.DBshop.service.review;

import kr.co.DBshop.dto.review.ReviewDto;
import kr.co.DBshop.mapper.review.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewMapper reviewMapper;
    //삽입 기능
    public void createReview(ReviewDto reviewDto){
        reviewMapper.insertReview(reviewDto);
    }
//    //    id로 한개 조회 상세페이지
//    public ReviewDto selectItemById(int id){
//        return mainMapper.selectItemById(id).orElseThrow(()->new IllegalStateException(String.format("id %d번은 없습니다.",id)));
//    }
//    //    전체 조회 목록
//    public PageDto selectItems(int page,int limit) {
//        int offset=(page-1)*limit;
//        List<ReviewDto> fruits=mainMapper.selectItems(limit,offset);
//        int totalElements = mainMapper.countTotal();
//        int totalPages= (int) Math.ceil((double) totalElements/limit);
//        PageDto pageDto = new PageDto(page,limit,totalPages,totalElements,fruits);
//        return pageDto;
//    }
//    //    삭제 기능
//    public void deleteItem(int id){
//        mainMapper.deleteItem(id);
//    }
//    //    수정 기능
//    public void updateItem(ReviewDto reviewDto){
//        mainMapper.updateItem(reviewDto);
//    }

}
