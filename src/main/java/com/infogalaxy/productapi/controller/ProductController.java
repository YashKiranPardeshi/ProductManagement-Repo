package com.infogalaxy.productapi.entity;

import com.infogalaxy.productapi.controller.Prod;
import com.infogalaxy.productapi.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/prod/api")
public class ProductController {

    ProductService productService = new ProductService();

    @GetMapping("/home")
    public String homepage(){
        return "welcome to Prod API";
    }
@PostMapping("/addprod")
    public Prod addprod(@RequestBody Prod prod){
    return productService.addProd(prod);

    }
    @GetMapping("/getprod")
    public Prod getProd(){

        return productService.getProd();
    }
    @GetMapping("/getallprod")
    public ArrayList<Prod> getallprod(){
        return productService.getAllProd();
    }
}
