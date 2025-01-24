package kr.co.DBshop.mapper.category;

import kr.co.DBshop.dto.category.CategoryDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    void insertCategory(CategoryDto categoryDto);

}
