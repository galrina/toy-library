package com.toyLibrary.toyLibraryService.controller;

import com.toyLibrary.toyLibraryService.dto.request.ProductRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductListResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ProductResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public ResponseDTO<ProductListResponseDTO> getProductList(){
        return productService.getProductList();
    }

    @PostMapping("/create")
    public ResponseDTO<ProductResponseDTO> addProduct(@RequestPart("file") MultipartFile file, @ModelAttribute ProductRequestDTO req) {
        return productService.addProduct(req,file);
    }

    @PostMapping("/edit")
    public ResponseDTO<ProductResponseDTO> editProduct(@RequestPart("file") MultipartFile file, @ModelAttribute ProductRequestDTO req){
        return productService.editProduct(req, file);
    }

    @DeleteMapping("/{id}")
    public ResponseDTO<String> deleteProduct(@PathVariable("id") Integer i){
        return productService.deleteProduct(i);
    }
}



