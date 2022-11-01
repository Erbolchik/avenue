package kz.project.avenue.json;

import kz.project.avenue.domain.Food;
import lombok.Data;

import java.util.List;

@Data
public class MenuJson {
    private Long id;
    private String name;
    private String note;
    private Long cafeId;
    private List<Food> foodList;
}
