package com.wendellyv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendellyv.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
