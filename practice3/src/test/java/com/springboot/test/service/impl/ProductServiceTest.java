package com.springboot.test.service.impl;

import com.springboot.test.data.dto.ProductDto;
import com.springboot.test.data.dto.ProductResponseDto;
import com.springboot.test.data.entity.Product;
import com.springboot.test.data.repository.ProductRepositoryTestByH2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class ProductServiceTest {
    private ProductRepositoryTestByH2 productRepository = Mockito.mock(ProductRepositoryTestByH2.class);
    private ProductServiceImpl productService;

//    @BeforeEach
//    public void setUpTest(){
//        productService = new ProductServiceImpl(productRepository);
//    }

//    @Test
//    void getProductTest(){
//        Product giveProduct = new Product();
//        giveProduct.setNumber(123L);
//        giveProduct.setName("펜");
//        giveProduct.setPrice(1000);
//        giveProduct.setStock(1234);
//
//        Mockito.when(productRepository.findById(123L))
//                .thenReturn(Optional.of(giveProduct));
//
//        ProductResponseDto productResponseDto = productService.getProduct(123L);
//
//        Assertions.assertEquals(productResponseDto.getNumber(), giveProduct.getNumber());
//        Assertions.assertEquals(productResponseDto.getName(), giveProduct.getName());
//        Assertions.assertEquals(productResponseDto.getPrice(),giveProduct.getPrice());
//        Assertions.assertEquals(productResponseDto.getStock(),giveProduct.getStock());
//
//        verify(productRepository).findById(123L);
//    }
//    @Test
//    void saveProductTest(){
//        Mockito.when(productRepository.save(any(Product.class)))
//                .then(returnsFirstArg());
//
//        ProductResponseDto productResponseDto = productService.saveProduct(
//                new ProductDto("펜",1000, 1234));
//
//        Assertions.assertEquals(productResponseDto.getName(),"펜");
//        Assertions.assertEquals(productResponseDto.getPrice(),1000);
//        Assertions.assertEquals(productResponseDto.getStock(),1234);
//
//        verify(productRepository.save(any()));
//    }
}
