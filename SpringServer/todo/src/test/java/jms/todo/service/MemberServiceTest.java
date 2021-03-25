package jms.todo.service;

import jms.todo.domain.Member;
import jms.todo.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    public void 회원가입() throws  Exception{

        //Given
        Member member = new Member("kms","123456789");
        //When
        Long memberId = memberService.join(member);
        //Then

        assertEquals(member,memberRepository.findOne(memberId));
    }

    //중복회원 예외 테스트
    @Test(expected = IllegalStateException.class)
    public void 중복예외() throws Exception{
        //Given
        Member member1 = new Member("kms","123456");

        Member member2 = new Member("kms","1111");
        //When
        memberService.join(member1);
        memberService.join(member2);

        //Then
        fail("중복예외가 안 터졌음.");

    }


}