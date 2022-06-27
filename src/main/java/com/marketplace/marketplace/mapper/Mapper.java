package com.marketplace.marketplace.mapper;

import com.marketplace.marketplace.dto.responseDto.ProductResponseDto;
import com.marketplace.marketplace.dto.responseDto.UserResponseDto;
import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.models.Users;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public static ProductResponseDto prodToProdResponseDto (Product product){
        ProductResponseDto psd = new ProductResponseDto();
        psd.setId(product.getId());
        psd.setId(product.getId());
        psd.setTitle(product.getTitle());
        psd.setDescription(product.getDescription());
        psd.setPrice(product.getPrice());
        return psd;
    }

    public static List<ProductResponseDto> prodToProdResponseDto (List<Product> products){
        List<ProductResponseDto> prodToProdResponseDto = new ArrayList<>();
        for (Product product : products){
            prodToProdResponseDto.add(prodToProdResponseDto(product));
        }
        return prodToProdResponseDto;
    }

    public static UserResponseDto userToUserResponseDto (Users user){
        UserResponseDto urd = new UserResponseDto();
        urd.setId(user.getId());
        urd.setUsername(user.getUsername());
        urd.setEmail(user.getEmail());
        return urd;
    }


    /*public static  List<ProductResponseDto> findPaginated(int pageNumber, int pageSize){
        Pageable paginate = PageRequest.of(pageNumber, pageSize);

    }


    @Override
    public List<Product> findPaginated(int pageNumber, int pageSize) {
        Pageable paginate = PageRequest.of(pageNumber, pageSize);
        Page<Product> pageResult = productsRepo.findAll(paginate);
        return pageResult.toList();
    }*/

}
