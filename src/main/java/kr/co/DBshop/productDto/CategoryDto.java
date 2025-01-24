package kr.co.DBshop.productDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CategoryDto {

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public CategoryDto(String category_name) {
        this.category_name = category_name;
    }

    @Id
    private int category_id;
    private String category_name;

    public CategoryDto(int category_id) {
        this.category_id = category_id;
    }

    public CategoryDto(int category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }
}