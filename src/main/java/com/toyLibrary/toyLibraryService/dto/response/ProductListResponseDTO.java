package com.toyLibrary.toyLibraryService.dto.response;

import java.util.List;

public class ProductListResponseDTO {
    private List<ProductResponseDTO> products;

    public ProductListResponseDTO(List<ProductResponseDTO> products) {
        this.products = products;
    }

    public List<ProductResponseDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponseDTO> products) {
        this.products = products;
    }
}
