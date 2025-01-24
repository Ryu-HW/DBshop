package kr.co.DBshop.service.category;

import kr.co.DBshop.dto.category.CategoryDto;
import kr.co.DBshop.mapper.category.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public void createCategory(CategoryDto categoryDto){
        categoryMapper.insertCategory(categoryDto);
    }

}
