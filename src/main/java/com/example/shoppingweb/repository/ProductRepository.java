package com.example.shoppingweb.repository;

import com.example.shoppingweb.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategoryId(int id);
    List<Product> findAllByNameContains(String name);
    Page<Product> findAllByNameContains(String name, Pageable pageable);
}
