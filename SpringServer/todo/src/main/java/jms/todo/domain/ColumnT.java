package jms.todo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class ColumnT {
    @Id @GeneratedValue
    @Column(name = "column_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String column_comment;

    @OneToMany(mappedBy = "columnT",cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();

}
