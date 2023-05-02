package com.example.shoeshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoeshop.model.ShoeShop;

@Repository
public interface ShoeShopRepository extends JpaRepository<ShoeShop,Integer> {

	List<ShoeShop> findByBrandStartingWith(String prefix);

	List<ShoeShop> findByBrandEndingWith(String suffix);

	List<ShoeShop> findByBrand(String attri);

}
