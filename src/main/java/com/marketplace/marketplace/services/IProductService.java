package com.marketplace.marketplace.services;

import com.marketplace.marketplace.dto.requestDto.ProductRequestDto;
import com.marketplace.marketplace.dto.responseDto.ProductResponseDto;
import com.marketplace.marketplace.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {

    List<Product> findPaginated(int pageNumber, int pageSize);

    ProductResponseDto addProduct(ProductRequestDto productRequestDto);
    ProductResponseDto getProductById(Long id);
    Product getProduct(Long id);
    List<ProductResponseDto> getProducts();
    ProductResponseDto deleteProduct(Long id);
   // ProductResponseDto editProduct(Long id, ProductRequestDto productRequestDto);

    Product updateProduct(Product product, Long id);









}
