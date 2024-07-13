package myAssignment.assignment1.repository;

import jakarta.persistence.EntityManager;
import myAssignment.assignment1.domain.Member;

public class JpaMemberRepository implements MemberRepository{

    private final EntityManager em;
    
    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

}
