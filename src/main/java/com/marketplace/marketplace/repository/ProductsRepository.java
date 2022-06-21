package com.marketplace.marketplace.repository;

import com.marketplace.marketplace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Long> {

   public Product findByProductId(Long id);




}