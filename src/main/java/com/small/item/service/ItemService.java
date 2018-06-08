package com.small.item.service;

import com.small.item.domain.Item;

import java.util.List;

public interface ItemService {
    public List<Item> getItems();
    public Item getItem(Long id);
    public Item addItem(Item item);
}
