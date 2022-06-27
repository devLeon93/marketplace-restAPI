package com.marketplace.marketplace.repositories;

import com.marketplace.marketplace.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Long> {








}
