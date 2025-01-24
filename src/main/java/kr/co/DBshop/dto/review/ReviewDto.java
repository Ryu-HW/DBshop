package kr.co.DBshop.dto.review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder
@AllArgsConstructor
public class ReviewDto {
    private Integer review_id;
    private Integer product_id;
    private Integer user_id;
    private Integer order_id;
    private Integer rating;
    private String  content;
    private String created_at;
}
