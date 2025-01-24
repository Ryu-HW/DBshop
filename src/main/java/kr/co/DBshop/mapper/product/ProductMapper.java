package kr.co.DBshop.mapper.product;

import kr.co.DBshop.productDto.ProductDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    void insertProduct(ProductDto productDto);


}