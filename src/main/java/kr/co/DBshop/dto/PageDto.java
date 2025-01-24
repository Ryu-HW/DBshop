package kr.co.DBshop.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageDto<T> {
    private int page;
    private int limit;
    private int totalPages;
    private int totalElements;
    private List<T> content;

    public PageDto(int page, int limit, int totalElements, List<T> content) {
        this.page = page;
        this.limit = limit;
        this.totalElements = totalElements;
        this.totalPages = (int) Math.ceil((double) totalElements / limit);
        this.content = content;
    }
}
