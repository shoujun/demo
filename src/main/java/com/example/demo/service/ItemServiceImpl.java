/*
 * COPYRIGHT:     Copyright (c) 2020 by Medinetwork, Inc.
 * Warning:       This product is protected by United States copyright law.
 *                Unauthorized use or duplication of this software, in whole 
 *                or in part, is prohibited.
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.model.Item;
import com.example.demo.data.service.ItemDataService;

/**
 * @author shoujun
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDataService itemDataService;

    @Override
    public List<Item> findAll() {
        return itemDataService.findAll();
    }

    @Override
    public List<Item> findByCategoryId(String categoryId) {
        return itemDataService.findByCategoryId(categoryId);
    }

}
