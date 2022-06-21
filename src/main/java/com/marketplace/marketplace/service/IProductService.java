package com.marketplace.marketplace.service;

import com.marketplace.marketplace.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {

    List<Product> findPaginated(int pageNumber, int pageSize);

}
