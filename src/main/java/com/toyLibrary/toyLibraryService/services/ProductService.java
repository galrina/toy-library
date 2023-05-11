package com.toyLibrary.toyLibraryService.services;

import com.toyLibrary.toyLibraryService.dto.request.ProductRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductListResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.entity.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProductService {
    ResponseDTO<ProductListResponseDTO> getProductList();
    ResponseDTO<ProductResponseDTO> addProduct(ProductRequestDTO req, MultipartFile file);
    ResponseDTO<ProductResponseDTO> editProduct(ProductRequestDTO req);
    ResponseDTO<String> deleteProduct(Integer i);
    boolean checkIfProductIsAlreadyBooked(Integer id);
    void updateProductBookings(List<Product> products);
}

