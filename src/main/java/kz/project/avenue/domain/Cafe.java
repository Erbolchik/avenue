package kz.project.avenue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "cafe")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String street;
}
