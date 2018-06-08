package com.small.item.service.impl;

import com.small.item.domain.Item;
import com.small.item.repository.ItemRepository;
import com.small.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServieImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> getItems() {
        return itemRepository.getItems();
    }

    @Override
    public Item getItem(Long id) {
        return itemRepository.getOne(id);
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
}
