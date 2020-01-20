/*
 * COPYRIGHT:     Copyright (c) 2020 by Medinetwork, Inc.
 * Warning:       This product is protected by United States copyright law.
 *                Unauthorized use or duplication of this software, in whole 
 *                or in part, is prohibited.
 */
package com.example.demo.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.model.Item;
import com.example.demo.data.repository.ItemRepository;

/**
 * @author shoujun
 *
 */
@Service
public class ItemDataServiceImpl implements ItemDataService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> findByCategoryId(String categoryId) {
        return itemRepository.findByCategoryId(categoryId);
    }

}
