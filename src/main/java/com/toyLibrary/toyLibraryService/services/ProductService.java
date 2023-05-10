package com.toyLibrary.toyLibraryService.services;

import com.toyLibrary.toyLibraryService.dto.request.ProductRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductListResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;

public interface ProductService {
    ResponseDTO<ProductListResponseDTO> getProductList();
    ResponseDTO<ProductResponseDTO> addProduct(ProductRequestDTO req);
    ResponseDTO<ProductResponseDTO> editProduct(ProductRequestDTO req);
    ResponseDTO<String> deleteProduct(Integer i);
    boolean checkIfProductIsAlreadyBooked(Integer id);
}

