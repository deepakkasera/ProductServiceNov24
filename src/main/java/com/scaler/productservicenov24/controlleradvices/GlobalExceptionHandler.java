package com.scaler.productservicenov24.controlleradvices;

import com.scaler.productservicenov24.dtos.ProductNotFoundExceptionDto;
import com.scaler.productservicenov24.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    //Global Exception Handler.
    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<ProductNotFoundExceptionDto> handleProductNotFoundException() {
        ProductNotFoundExceptionDto dto = new ProductNotFoundExceptionDto();
        dto.setMessage("Product not found with the given id.");
        dto.setResolution("Please try passing a valid productId.");

        return new ResponseEntity<>(
                dto,
                HttpStatus.UNAUTHORIZED
        );
    }

    @ExceptionHandler(RuntimeException.class)
    public void handleRunTimeException() {

    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    private void handleArrayIndexOutOfBoundException() {

    }
}
