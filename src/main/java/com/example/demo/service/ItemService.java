/*
 * COPYRIGHT:     Copyright (c) 2020 by Medinetwork, Inc.
 * Warning:       This product is protected by United States copyright law.
 *                Unauthorized use or duplication of this software, in whole 
 *                or in part, is prohibited.
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.data.model.Item;

/**
 * @author shoujun
 *
 */
public interface ItemService {

    List<Item> findAll();

    List<Item> findByCategoryId(String categoryId);

}
