/**
 * @author ws
 * @date 2019-02-26
 */
package com.lahand.dao.model;

/**
 * 
 * 
 * @author ws
 * @date 2019-02-26
 */
public class Student {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}