package com.adele.gallery.backend.repository;

import com.adele.gallery.backend.entity.Order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
  List<Order> findByMemberIdOrderByIdDesc(int memberId);
}
