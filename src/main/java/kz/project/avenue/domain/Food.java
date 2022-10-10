package kz.project.avenue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String category;
    private String subCategory;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Currency currency;
    private BigDecimal price;
}
