package kz.project.avenue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "waiter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Waiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long cafeId;
}
