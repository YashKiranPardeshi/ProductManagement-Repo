package com.infogalaxy.productapi.service;

import com.infogalaxy.productapi.entity.Prod;

import java.util.ArrayList;
import java.util.List;

public interface IProductservics {

    public Prod addProd(Prod prod);

    public List<Prod> getAllProd();

    public Prod getProd();

    public Prod getProdById(int id);

    public String deleteprodbyid(int id);

    public Prod updateprodbyid(int id,Prod prod);
}
