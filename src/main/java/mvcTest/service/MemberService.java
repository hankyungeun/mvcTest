package mvcTest.service;

import mvcTest.dao.MemberRepository;
import mvcTest.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
    public void addMember(Member member) {
        memberRepository.save(member);
    }

}
