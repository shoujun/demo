/*
 * COPYRIGHT:     Copyright (c) 2020 by Medinetwork, Inc.
 * Warning:       This product is protected by United States copyright law.
 *                Unauthorized use or duplication of this software, in whole 
 *                or in part, is prohibited.
 */
package com.example.demo.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.model.Item;

/**
 * @author shoujun
 *
 */
public interface ItemRepository extends JpaRepository<Item, String> {

    List<Item> findByCategoryId(String categoryId);

}
