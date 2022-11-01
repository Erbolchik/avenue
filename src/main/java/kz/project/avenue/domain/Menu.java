package kz.project.avenue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String note;
    private Long cafeId;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "menu_foods",
            joinColumns = {@JoinColumn(name = "menu_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "food_id", referencedColumnName = "id")})
    private List<Food> foodList;
}
