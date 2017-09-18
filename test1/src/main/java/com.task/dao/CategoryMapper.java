package com.task.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper {

    @Insert("insert into student ( name,age) values (#{name},#{age})")
    public int add(Category category);
    @Select("select * from   student")
    public List<Category> list();
    @Select("  select * from   student where id= #{id}")
    public List<Category>ListOfId(Category category);


}