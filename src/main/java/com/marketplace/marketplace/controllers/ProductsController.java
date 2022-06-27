package com.marketplace.marketplace.controllers;

import com.marketplace.marketplace.dto.requestDto.ProductRequestDto;
import com.marketplace.marketplace.dto.responseDto.ProductResponseDto;
import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public ResponseEntity<ProductResponseDto> addProduct(@RequestBody final ProductRequestDto productRequestDto){
        ProductResponseDto productResponseDto = productService.addProduct(productRequestDto);
        return new ResponseEntity<>(productResponseDto,HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ProductResponseDto> getProduct(@PathVariable final Long id){
        ProductResponseDto productResponseDto = productService.getProductById(id);
        return new ResponseEntity<>(productResponseDto,HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ProductResponseDto>> getProducts(){
        List<ProductResponseDto> productResponseDto = productService.getProducts();
        return new ResponseEntity<>(productResponseDto,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ProductResponseDto> deleteProduct(@PathVariable final Long id){
        ProductResponseDto productResponseDto = productService.deleteProduct(id);
        return new ResponseEntity<>(productResponseDto,HttpStatus.OK);
    }


 /*   @PostMapping("/edit/{id}")
    public Product editProduct(@RequestBody Product product, @PathVariable Long id) {
        return productService.updateProduct(product,id);
    }

    @GetMapping("/{pageNo}/{pageSize}")
    public List<Product> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
        return productService.findPaginated(pageNo, pageSize);
    }*/

    /*@GetMapping("/list")
    public List<ProductDto> getProducts() {
        return productService.getAllProd();
    }

    public ResponseEntity<ProductDto>getProduct(@PathVariable("id") Long id){
        ProductDto productDto = productService.getSingleProductById(id);
        return new ResponseEntity<>(ProductDto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public String create(@RequestBody Product product){
        productService.createNewProduct(product);
        return "Product successfully created...";
    }

    @GetMapping("/view/{id}")
    public Product getSingleProductById(@PathVariable("id") Long id){
        return productService.getSingleProductById(id);
    }

    @PutMapping("/edit/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Long id) {
    return productService.updateProduct(product,id);
    }


  *//*  @DeleteMapping("/delete/{id}")
    public boolean deleteProduct(@PathVariable("id") Long id) {
        return productService.deleteProduct(id);
    }*//*

    @GetMapping("/{pageNo}/{pageSize}")
    public List<Product> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
        return productService.findPaginated(pageNo, pageSize);
    }
*/
/*

    @GetMapping("/product/{pageNo}/{pageSize}")
    public List<Product> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
        return productService.findPaginated(pageNo, pageSize);
    }

*//*
    @GetMapping("/viewProduct/{id}")
    public Product getSingleProductById(@PathVariable("id") Long id){
        return productsRepo.findByProductId(id);
    }
*//*

    @PutMapping("/editProduct/{id}")
    public String updateProduct(@RequestBody Product product, @PathVariable Long id){
        Product editProduct = productsRepo.findById(id).get();
        editProduct.setTitle(product.getTitle());
        editProduct.setDescription(product.getDescription());
        editProduct.setPrice(product.getPrice());
        productsRepo.save(editProduct);
        return "updated";
    }

    @DeleteMapping("/deleteProductById/{id}")
    public boolean deleteProduct(@PathVariable("id") Long id) {
        if (!productsRepo.findById(id).equals(Optional.empty())) {
            productsRepo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }*/

    }








