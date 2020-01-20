/*
 * COPYRIGHT:     Copyright (c) 2020 by Medinetwork, Inc.
 * Warning:       This product is protected by United States copyright law.
 *                Unauthorized use or duplication of this software, in whole 
 *                or in part, is prohibited.
 */
package com.example.demo.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//

//item
//
//CREATE TABLE `item` (
//        `id` varchar(128) NOT NULL,
//        `description` varchar(2048) NOT NULL,
//        `category_id` varchar(16) NOT NULL,
//        `group_code` varchar(64) DEFAULT NULL,
//        `tax_code` varchar(64) NOT NULL,
//        PRIMARY KEY (`id`)
//      ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
//

/**
 * @author shoujun
 *
 */
@Entity(name = "item")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Serializable {

    /**
     * Generated
     */
    private static final long serialVersionUID = 5987949134507621532L;

    @Id
    @Column(name = "id", nullable = false, length = 128)
    private String id;

    @Column(name = "description", nullable = false, length = 2048)
    private String description;

    @Column(name = "categoryId", nullable = false, length = 16)
    private String categoryId;

    @Column(name = "groupCode", nullable = true, length = 64)
    private String groupCode;

    @Column(name = "taxCode", nullable = false, length = 64)
    private String taxCode;

    public Item() {
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the groupCode
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * @param groupCode the groupCode to set
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * @return the taxCode
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * @param taxCode the taxCode to set
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

}
