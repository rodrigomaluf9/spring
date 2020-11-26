package com.estudos.spring.model;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "nome", name = "uniqueNomeConstraint")}
)
public class Produto {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    @SequenceGenerator(name = "produto_seq",sequenceName = "produto_seq",allocationSize = 1)
    private Long id;

    @Column
    private String nome;
}
