package com.infogalaxy.productapi.repo;

import com.infogalaxy.productapi.entity.Prod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface prodrepo extends JpaRepository<Prod,Integer> {
}
