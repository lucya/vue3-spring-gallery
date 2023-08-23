package com.adele.gallery.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adele.gallery.backend.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
  Member findByEmailAndPassword(String email, String password);
}
