package com.marketplace.marketplace.controller;


import com.marketplace.marketplace.model.Product;
import com.marketplace.marketplace.model.Users;
import com.marketplace.marketplace.repository.ProductsRepository;
import com.marketplace.marketplace.repository.UserRepo;
import com.marketplace.marketplace.service.IProductService;
import com.marketplace.marketplace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marketplace")
public class ProductsController {


    private final  ProductsRepository productsRepo;
    private final IProductService productService;



    @Autowired
    public ProductsController(ProductsRepository productsRepo, IProductService productService, ProductService serviceProduct, UserRepo userRepo) {
        this.productsRepo = productsRepo;
        this.productService = productService;
    }


    @PostMapping("/createdProduct")
    public String createProduct(@RequestBody Product product){
        productsRepo.save(product);
        return "Product successfully created...";
    }


    @GetMapping("/product/{pageNo}/{pageSize}")
    public List<Product> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
        return productService.findPaginated(pageNo, pageSize);
    }

    @GetMapping("/listProducts")
    public List<Product> getAllProd() {
        return productsRepo.findAll();
    }

    @GetMapping("/viewProduct/{product_id}")
    public Product getSingleProductById(@PathVariable("product_id") Long id){
        return productsRepo.findByProductId(id);
    }




    @PutMapping("/editProduct/{product_id}")
    public String updateProduct(@RequestBody Product product, @PathVariable Long product_id){
        Product editProduct = productsRepo.findById(product_id).get();
        editProduct.setTitle(product.getTitle());
        editProduct.setDescription(product.getDescription());
        editProduct.setPrice(product.getPrice());
        productsRepo.save(editProduct);
        return "updated";
    }

    @DeleteMapping("/deleteProductById/{product_id}")
    public boolean deleteProduct(@PathVariable("product_id") Long id) {
        if (!productsRepo.findById(id).equals(Optional.empty())) {
            productsRepo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    }








