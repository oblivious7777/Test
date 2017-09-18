package com.task.service;

import com.task.dao.Category;
import com.task.dao.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.beans.PropertyVetoException;
import java.util.List;

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:applicationContext.xml")
    public class MybatisTest {

        @Autowired
        private CategoryMapper categoryMapper;

        @Test
        public void testList() {
            try{
            System.out.println(categoryMapper);
            List<Category> cs=categoryMapper.list();
            for (Category c : cs) {
                System.out.println(c.getName());
            }
            }catch (Exception e) {
                System.out.print("出错了");
            }
        }
        @Test
        public void add(){
            Category category = new Category();
    for(long i=1;i<(long)200000000;i++){
            int a= (int)(10*Math.random());
            category.setName("new Category");
            category.setAge(a);
            categoryMapper.add(category);

            }

        }
        @Test
        public void ListOfId(){
            Category category = new Category();
            category.setId(2);
            List<Category> cs=categoryMapper.ListOfId(category);
            for (Category c : cs) {
                System.out.println(c.getName());
            }
        }
    }
