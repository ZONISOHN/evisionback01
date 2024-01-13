package evision.evisiondemo.repository;

import evision.evisiondemo.domain.Member;
import evision.evisiondemo.domain.OBMember;
import evision.evisiondemo.domain.YBMember;

import javax.print.attribute.HashPrintJobAttributeSet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member, boolean obyorn);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Optional<Member> findByEmail(String email);
    List<Member> findAll();

}
