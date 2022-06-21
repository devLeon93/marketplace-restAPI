package com.marketplace.marketplace.service;


import com.marketplace.marketplace.model.Product;
import com.marketplace.marketplace.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {


    private final ProductsRepository productsRepo;

    @Autowired
    public ProductService(ProductsRepository productsRepo) {
        this.productsRepo = productsRepo;
    }

    @Override
    public List<Product> findPaginated(int pageNumber, int pageSize) {
        Pageable paginate = PageRequest.of(pageNumber, pageSize);
        Page<Product> pageResult = productsRepo.findAll(paginate);
        return pageResult.toList();
    }

    public List<Product> findProductByName(String username) {
        return productsRepo.findAll();
    }
}
