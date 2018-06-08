package com.small.item.controller;

import com.small.item.domain.Item;
import com.small.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/list")
    public String item(){
        return "/items/list";
    }

    @GetMapping("/detail")
    public String itemDetail(){
        return "/items/detail";
    }
}
