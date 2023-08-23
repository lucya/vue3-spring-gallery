package com.adele.gallery.backend.repository;

import com.adele.gallery.backend.entity.Cart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
  List<Cart> findByMemberId(int memberId);

  Cart findByMemberIdAndItemId(int memberId, int itemId);

  void deleteByMemberId(int memberId);
}
