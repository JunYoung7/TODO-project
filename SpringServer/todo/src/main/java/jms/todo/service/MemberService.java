package jms.todo.service;

import jms.todo.domain.Member;
import jms.todo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /*
     * 회원가입, 보안이슈와 password hash는 추후
     */
    @Transactional
    public Long join(Member member){
        //중복검사
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByNickName(member.getNickname());
        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 닉네임입니다.");
        }
    }

    /*
     * 전체 회원 조회 (안쓰일 듯)
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    /*
     * id로 멤버 조회
     */
    public Member findOne(Long memberId){
        return memberRepository.findOne(memberId);
    }
}
