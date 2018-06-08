package com.small.item.repository;

import com.small.item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    public List<Item> getItems();

    public Item getItem(@Param("id") Long id);
}
