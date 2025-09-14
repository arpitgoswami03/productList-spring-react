package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    public Product save(Product product, MultipartFile imageFile) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return productRepo.save(product);
    }

    public Product findByID(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product update(int id, Product product, MultipartFile imageFile) {
        Product originalProduct = productRepo.findById(id).orElse(null);
        originalProduct.setName(product.getName());
        originalProduct.setPrice(product.getPrice());
        originalProduct.setDescription(product.getDescription());
        originalProduct.setReleaseDate(product.getReleaseDate());
        originalProduct.setCategory(product.getCategory());
        originalProduct.setAvailable(product.isAvailable());
        originalProduct.setQuantity(product.getQuantity());
        originalProduct.setBrand(product.getBrand());
        try {
            originalProduct.setImageData(imageFile.getBytes());
            originalProduct.setImageName(imageFile.getOriginalFilename());
            originalProduct.setImageType(imageFile.getContentType());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productRepo.save(originalProduct);
    }

    public List<Product> searchProducts(String keyword) {
        return productRepo.searchProduct(keyword);
    }
}
