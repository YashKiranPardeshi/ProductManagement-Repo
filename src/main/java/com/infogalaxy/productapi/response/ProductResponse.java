package com.infogalaxy.productapi.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ProductResponse {
    private String message;

    private HttpStatus code;

    private Object object;

    public ProductResponse(String message) {
        this.message = message;
    }


    public ProductResponse(String message, HttpStatus code) {
        this.message = message;
        this.code = code;
    }

    public ProductResponse(String message, HttpStatus code, Object object) {
        this.message = message;
        this.code = code;
        this.object = object;
    }
}
