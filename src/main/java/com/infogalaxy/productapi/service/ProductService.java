package com.infogalaxy.productapi.service;
import com.infogalaxy.productapi.entity.Prod;
import com.infogalaxy.productapi.repo.prodrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService implements IProductservics{

    @Autowired
    prodrepo prodRepo;


    // Not work
    @Override
    public Prod addProd(Prod prod){
        prodRepo.save(prod);
       return prod;
    }

    @Override
    public List<Prod> getAllProd() {
        return prodRepo.findAll();
    }


    @Override
    public Prod getProd(){
        Prod prod = new Prod();
        prod.setId(1);
        prod.setName("pen");
        prod.setDescription("gel pen");
        prod.setPrice(5);
        prod.setQuantity(10);
        prod.setStatus("Available");
        return prod;
    }

    @Override
    public Prod getProdById(int id) {
        return prodRepo.findById(id).get();
    }

    @Override
    public String deleteprodbyid(int id) {
        Prod prod = getProdById(id);
        prodRepo.delete(prod);

        return "Prod Deleted successfully....";
    }

    @Override
    public Prod updateprodbyid(int id,Prod prod) {
        Prod oldProd = getProdById(id);

        oldProd.setName(prod.getName());
        oldProd.setDescription(prod.getDescription());
        oldProd.setQuantity(prod.getQuantity());
        oldProd.setPrice(prod.getPrice());
        oldProd.setStatus(prod.getStatus());
        return prodRepo.save(oldProd);
    }
}
