package com.scaler.productservicenov24.services;

import com.scaler.productservicenov24.dtos.FakeStoreProductDto;
import com.scaler.productservicenov24.exceptions.ProductNotFoundException;
import com.scaler.productservicenov24.models.Category;
import com.scaler.productservicenov24.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService")
//@Primary
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
//        throw new ProductNotFoundException("Something went wrong");

        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + productId,
                FakeStoreProductDto.class
        );

        //Convert FakeStoreProductDto object into Product object.
        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
    }

    @Override
    public Page<Product> getAllProducts(int pageNumber, int pageSize) {

        //Type Erasure
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject(
                        "https://fakestoreapi.com/products",
                            FakeStoreProductDto[].class
                );

        List<Product> products = new ArrayList<>();
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            products.add(convertFakeStoreProductDtoToProduct(fakeStoreProductDto));
        }

        return new PageImpl<>(products);
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public void updateProduct(Long productId, Product product) {
        //TODO
    }

    @Override
    public void replaceProduct(Long productId, Product product) {

    }

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDto fakeStoreProductDto) {
        Product product = new Product();
        product.setCategory(new Category());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImage(fakeStoreProductDto.getImage());
        product.setId(fakeStoreProductDto.getId());
        product.getCategory().setValue(fakeStoreProductDto.getCategory());

        return product;
    }
}
