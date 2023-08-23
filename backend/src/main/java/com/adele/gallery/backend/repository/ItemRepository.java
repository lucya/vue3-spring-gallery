package com.adele.gallery.backend.repository;

import com.adele.gallery.backend.entity.Item;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
  List<Item> findByIdIn(List<Integer> ids);
}
