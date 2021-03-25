package jms.todo.repository;

import jms.todo.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Member member){
        em.persist(member);
    }
    //안쓰일 것 같긴 함.
    public Member findOne(Long id){
        return em.find(Member.class,id);
    }

    public List<Member> findAll(){
        return em.createQuery("select m from Member m",Member.class).getResultList();
    }

    public List<Member> findByNickName(String nickname){
        return em.createQuery("select m from Member m where m.nickname =:nickname",Member.class)
                .setParameter("nickname",nickname)
                .getResultList();
    }
}
