package teamchallenge.server.dto;

import lombok.Builder;
import lombok.Data;
import teamchallenge.server.entities.Category;

import java.util.List;

@Data
@Builder
public class ResponseBookDto {
    private Long id;
    private String title;
    private String description;
    private int year;
    private double price;
    private int totalQuantity;
    private boolean isExpected;
    private String language;
    private List<String> authors;
    private List<Category> categories;
    private ResponseImageDto image;
}
