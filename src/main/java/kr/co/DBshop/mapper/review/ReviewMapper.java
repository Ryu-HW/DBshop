package kr.co.DBshop.mapper.review;

import kr.co.DBshop.dto.review.ReviewDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ReviewMapper {
    void insertReview(ReviewDto reviewDto);
    Optional<ReviewDto> selectReviewById(int id);
    List<ReviewDto> selectReviews(@Param("limit") int limit, @Param("offset") int offset);
    void deleteReview(int id);
    void updateReview(ReviewDto reviewDto);
    int countReview();
}
