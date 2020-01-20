/*
 * COPYRIGHT:     Copyright (c) 2020 by Medinetwork, Inc.
 * Warning:       This product is protected by United States copyright law.
 *                Unauthorized use or duplication of this software, in whole 
 *                or in part, is prohibited.
 */
package com.example.demo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.model.Item;
import com.example.demo.service.ItemService;

/**
 * @author shoujun
 *
 */
@RestController
@RequestMapping(value = "/api/v1")
public class ItemController {

    // The logger
    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    //    @RequestMapping(method = RequestMethod.GET, value = "/items")
    //    public ResponseEntity<List<Item>> findAll() {
    //        logger.info("Retrieving items ...");
    //        return ResponseEntity.ok(itemService.findAll());
    //    }

    @RequestMapping(method = RequestMethod.GET, value = "/items")
    public ResponseEntity<List<Item>> findByCategoryId(
            @RequestParam(value = "category", defaultValue = "") String categoryId) {
        logger.info("Retrieving items by category - {}", categoryId.isEmpty() ? "empty" : categoryId);
        if (categoryId.isEmpty()) {
            return ResponseEntity.ok(itemService.findAll());
        }
        return ResponseEntity.ok(itemService.findByCategoryId(categoryId));
    }

}
