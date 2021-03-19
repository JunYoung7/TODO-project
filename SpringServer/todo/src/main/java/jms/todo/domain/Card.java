package jms.todo.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Card {
    @Id @GeneratedValue
    @Column(name = "card_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "column_id")
    private ColumnT columnT;

    private String card_comment;


}
