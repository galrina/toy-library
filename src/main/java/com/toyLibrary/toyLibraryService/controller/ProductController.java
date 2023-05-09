package com.toyLibrary.toyLibraryService.controller;


import com.toyLibrary.toyLibraryService.dto.request.ProductRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductListResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public ResponseDTO<ProductListResponseDTO> getProductList(){
        return productService.getProductList();
    }

    @PostMapping("/create")
    public ResponseDTO<ProductResponseDTO> addProduct(@RequestBody ProductRequestDTO req){
        return productService.addProduct(req);
    }
}
