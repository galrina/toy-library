package com.toyLibrary.toyLibraryService.services.impl;

import com.toyLibrary.toyLibraryService.dto.request.ProductRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductListResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.entity.Product;
import com.toyLibrary.toyLibraryService.repository.ProductRepository;
import com.toyLibrary.toyLibraryService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    public ResponseDTO<ProductListResponseDTO> getProductList(){
        List<Product> products = productRepository.findAll();
        List<ProductResponseDTO> productListResponse = products.stream().map(ProductResponseDTO::new).toList();
        ProductListResponseDTO response = new ProductListResponseDTO(productListResponse);
        return new ResponseDTO<>(response, HttpStatus.OK.value(), "Fetched Product List Successfully!");
    }

    public ResponseDTO<ProductResponseDTO> addProduct(ProductRequestDTO req){
        Product p = new Product();
        p.setName(req.getName());
        p = productRepository.save(p);
        ProductResponseDTO responseDTO = new ProductResponseDTO(p);
        return new ResponseDTO<>(responseDTO, HttpStatus.OK.value(), "Product Created Successfully!");
    }
}