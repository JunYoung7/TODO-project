package jms.todo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String nickname;

    //시큐어 추후 추가
    private String password;

    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL)
    private List<Log> logs = new ArrayList<>();

    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL)
    private List<ColumnT> columnTS=new ArrayList<>();

}
