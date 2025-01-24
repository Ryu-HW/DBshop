package kr.co.DBshop.productDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class ProductDto {

    @Id
    private int product_id;

    private String product_name;
    private Double price;
    private int stock_quantity;
    private String description;


    // ManyToOne 은 관계설정 => productdto는 categorydto를 참조
    @ManyToOne
    @JoinColumn(name = "category_id") // category_id 를 외래키로 설정
    private CategoryDto categoryDto;


    public ProductDto(int product_id, String product_name, Double price, int stock_quantity, String description, CategoryDto categoryDto) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.stock_quantity = stock_quantity;
        this.description = description;
        this.categoryDto = categoryDto;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }
}