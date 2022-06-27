package com.marketplace.marketplace.services;


import com.marketplace.marketplace.dto.requestDto.ProductRequestDto;
import com.marketplace.marketplace.dto.responseDto.ProductResponseDto;
import com.marketplace.marketplace.mapper.Mapper;
import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.models.Users;
import com.marketplace.marketplace.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    private final ProductsRepository productsRepo;

    private final UserService userService;


    @Autowired
    public ProductService(ProductsRepository productsRepo, UserService userService) {
        this.productsRepo = productsRepo;
        this.userService = userService;
    }

    @Override
    public List<Product> findPaginated(int pageNumber, int pageSize) {
        Pageable paginate = PageRequest.of(pageNumber, pageSize);
        Page<Product> pageResult = productsRepo.findAll(paginate);
        return pageResult.toList();
    }

    @Transactional
    @Override
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setTitle(productRequestDto.getTitle());
        product.setDescription(productRequestDto.getDescription());
        product.setPrice(productRequestDto.getPrice());
         product = productsRepo.save(product);
        return Mapper.prodToProdResponseDto(product);
    }

    @Override
    public ProductResponseDto getProductById(Long id) {
        Product product = getProduct(id);
        return Mapper.prodToProdResponseDto(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productsRepo.findById(id).orElseThrow(()->
                new IllegalArgumentException("product with id: " + id + " could not be found"));
    }

    @Override
    public List<ProductResponseDto> getProducts() {
        List<Product> product = new ArrayList<>(productsRepo.findAll());
        return Mapper.prodToProdResponseDto(product);
    }

    @Override
    public ProductResponseDto deleteProduct(Long id) {
        Product product = getProduct(id);
        productsRepo.delete(product);
        return Mapper.prodToProdResponseDto(product);
    }

    @Override
    public Product updateProduct( Product product, Long id){
        Product editProduct = productsRepo.findById(id).get();
        editProduct.setTitle(product.getTitle());
        editProduct.setDescription(product.getDescription());
        editProduct.setPrice(product.getPrice());
        productsRepo.save(editProduct);
        return editProduct;
    }


}















/*

    @Autowired
    public ProductService(ProductsRepository productsRepo) {
        this.productsRepo = productsRepo;
    }

    public List<ProductDto> getAllProd(){
        List<Product> prodList = productsRepo.findAll();
        List<ProductDto> pdt = new ArrayList<>();
        for(Product ps : prodList){
            pdt.add(ProductMapper.mapProduct(ps));
        }
        return pdt;
    }



  */
/*  public ProductResponseDto getProductById(Long id){
        Product product = getProduct(id);
        return ProductMapper.mapProduct(product);
    }*//*



  */
/*  public Product getProduct(Long id){
        return productsRepo.findById(id).orElseThrow(()->
                new IllegalArgumentException("product with id: " + id + " could not be found"));

    }*//*






    public List<Product> getAllProducts() {
        return productsRepo.findAll();
    }

    public void createNewProduct(Product product){
        productsRepo.save(product);
    }




    public Product updateProduct( Product product, Long id){
        Product editProduct = productsRepo.findById(id).get();
        editProduct.setTitle(product.getTitle());
        editProduct.setDescription(product.getDescription());
        editProduct.setPrice(product.getPrice());
        productsRepo.save(editProduct);
        return editProduct;
    }

    public boolean deleteProduct( Long id) {
        if (!productsRepo.findById(id).equals(Optional.empty())) {
            productsRepo.deleteById(id);
            return true;
        } else {
            return false;
        }
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
*/
