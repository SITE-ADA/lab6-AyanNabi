package az.edu.ada.wm2.lab6.service;

import az.edu.ada.wm2.lab6.model.dto.CategoryRequestDto;
import az.edu.ada.wm2.lab6.model.dto.CategoryResponseDto;
import az.edu.ada.wm2.lab6.model.dto.ProductResponseDto;

import java.util.List;
import java.util.UUID;

public class CategoryServiceImpl implements CategoryService{
    @Override
    public CategoryResponseDto create(CategoryRequestDto dto) {
        return null;
    }

    @Override
    public List<CategoryResponseDto> getAll() {
        return List.of();
    }

    @Override
    public CategoryResponseDto addProduct(UUID categoryId, UUID productId) {
        return null;
    }

    @Override
    public List<ProductResponseDto> getProducts(UUID categoryId) {
        return List.of();
    }
}
