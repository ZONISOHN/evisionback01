package evision.evisiondemo.repository;

import evision.evisiondemo.domain.Member;
import evision.evisiondemo.domain.OBMember;
import evision.evisiondemo.domain.YBMember;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;
    OBMember obMember = new OBMember();
    YBMember ybMember = new YBMember();

    @Override
    public Member save(Member member, boolean obyorn) {
        member.setId(++sequence);
        if(obyorn==true){
            store.put(member.getId(), obMember);
        }

        else if(obyorn==false){
            store.put(member.getId(), ybMember);
        }

        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return store.values().stream()
                .filter(member -> member.getEmail().equals(email))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
