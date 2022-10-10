package kz.project.avenue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@javax.persistence.Table(name = "table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long number;
    private Long cafeId;
}
