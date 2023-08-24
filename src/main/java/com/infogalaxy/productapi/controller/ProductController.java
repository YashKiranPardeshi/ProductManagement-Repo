package com.infogalaxy.productapi.controller;

import com.infogalaxy.productapi.entity.Prod;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/prod/api")
public class ProductController {

    ArrayList<Prod> prodArrayList = new ArrayList<>();

    @GetMapping("/home")
    public String homepage(){
        return "welcome to Prod API";
    }
@PostMapping("/addprod")
    public Prod addprod(@RequestBody Prod prod){
        prodArrayList.add(prod);
        return prod;
    }
    @GetMapping("/getprod")
    public Prod getProd(){
        Prod prod = new Prod();
        prod.setId(1);
        prod.setName("pen");
        prod.setDescription("Gel pen");
        prod.setPrice(9);
        prod.setQuantity(10);
        prod.setStatus("Available");
        return prod;
    }
    @GetMapping("/getallprod")
    public ArrayList<Prod> getallprod(){
        return prodArrayList;
    }
}
