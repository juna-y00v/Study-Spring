package myAssignment.assignment1.repository;

import myAssignment.assignment1.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public Member save(Member member) {
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByUserId(String userId) {
        return store.values().stream().filter(member -> member.getPassword().equals(userId)).findAny();
    }

    @Override
    public Optional<Member> findByPassword(String password) {
        return store.values().stream().filter(member -> member.getPassword().equals(password)).findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }

}