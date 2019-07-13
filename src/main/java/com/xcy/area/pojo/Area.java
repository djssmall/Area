package com.xcy.area.pojo;

import java.util.Date;

/**
 * @author: djs
 * @create: 2019-07-08 22:12
 **/
public class Area {

    private Integer id;
    private String code;
    private Integer right;
    private Integer left;
    private String name;
    private Integer parentId;
    private Integer level;
    private Date createdAt;
    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", right=" + right +
                ", left=" + left +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", level=" + level +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
