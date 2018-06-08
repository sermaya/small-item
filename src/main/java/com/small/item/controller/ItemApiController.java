package com.small.item.controller;

import com.small.item.domain.Item;
import com.small.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemApiController {
    @Autowired
    ItemService itemService;

    @GetMapping(path = "/getItems")
    public List<Item> getItems(){
        return itemService.getItems();
    }

    @GetMapping(path = "/{id}")
    public Item getItem(@PathVariable(name="id") Long id){
        return itemService.getItem(id);
    }
}
