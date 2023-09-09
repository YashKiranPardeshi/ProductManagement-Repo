package com.infogalaxy.productapi.controller;
import com.infogalaxy.productapi.entity.Prod;
import com.infogalaxy.productapi.response.ProductResponse;
import com.infogalaxy.productapi.service.IProductservics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/prod/api")
public class ProductController {

    //ProductService productService = new ProductService();
    @Autowired
    IProductservics productservics;

    @GetMapping("/home")
    public String homepage(){

        return "welcome to Prod API";

    }


    @PostMapping("/addprod")
    public ResponseEntity<?> addprod(@RequestBody Prod prod){

    System.out.println(prod.toString());
    return new ResponseEntity<>(new ProductResponse("Data Added successfully...",HttpStatus.CREATED,productservics.addProd(prod)),HttpStatus.CREATED);

    }

    @GetMapping("/getprod")
    public Prod getProd(){

        return productservics.getProd();
    }


    @GetMapping("/getallprod")
    public ResponseEntity<?> getallprod(){



        return new ResponseEntity<>(new ProductResponse("Data Found Successfully...",HttpStatus.FOUND,productservics.getAllProd()),HttpStatus.FOUND);

    }


    @GetMapping("/getprodbyid/{id}")
    public ResponseEntity<?> getProdByID(@PathVariable("id") int id){

        return new ResponseEntity<>(new ProductResponse("Product Found Successfully...",HttpStatus.FOUND,productservics.getProdById(id)),HttpStatus.FOUND);

    }


    @DeleteMapping("/deleteprodbyid/{id}")
    public ResponseEntity<?> deleteprodbyid(@PathVariable("id") int id){

        productservics.deleteprodbyid(id);
        return new ResponseEntity<>(new ProductResponse("Product Deleted Successfully", HttpStatus.ACCEPTED),HttpStatus.ACCEPTED);
    }


    @PutMapping("/updateprodbyid/{id}")
    public  ResponseEntity<?> updateprodbyid(@PathVariable("id" ) int id,@RequestBody Prod prod) {
        productservics.updateprodbyid(id,prod);
        return new ResponseEntity<>(new ProductResponse("Data Update by given id",HttpStatus.ACCEPTED),HttpStatus.ACCEPTED);
    }

}
