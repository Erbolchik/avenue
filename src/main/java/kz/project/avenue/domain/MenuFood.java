package kz.project.avenue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "menu_food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long menuId;
    private Long foodId;
}
