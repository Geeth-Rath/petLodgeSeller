package com.petLodgeSeller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petLodgeSeller.entity.Seller;



public interface SellerRepository extends JpaRepository < Seller,String>{

	Seller findBySellerIdAndSellerPassword(String sellerId, String sellerPassword);

		
}