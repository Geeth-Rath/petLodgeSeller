package com.petLodgeSeller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petLodgeSeller.entity.Seller;
import com.petLodgeSeller.repository.SellerRepository;



@Service
public class SellerService {
	@Autowired
	
	private SellerRepository repository;
	
/////////post method///////////////////////////////////////////
	public Seller saveSeller(Seller seller) {
		return repository.save(seller);
	}
	
//	public List <Seller> saveAllSeller(List <Seller> sellers) {
//		return repository.saveAll(sellers);
//	}
	
/////////get method///////////////////////////////////////////

	public List<Seller> getSellers(){
		return repository.findAll();
	}

	public Seller getSellerById(String sellerId){
		return repository.findById(sellerId).orElse(null);
	}
	
	public Seller getSellerByIdandPassword(String sellerId,String sellerPassword) {
		return repository.findBySellerIdAndSellerPassword(sellerId, sellerPassword);                        
	}
	
	public Seller getSellerByName(String sellerName){
		return repository.findById(sellerName).orElse(null);
	}
	
	
/////////delete method////////////////////////////////////////
	
	public String deleteSeller(String sellerId) {
		repository.deleteById(sellerId);
		return "succesfully deleted id :"+sellerId;
	}
	
////////put(update) method///////////////////////////////////
	
	public Seller updateSeller(Seller seller) {
		Seller existedSeller = repository.findById(seller.getSellerId()).orElse(null);
		existedSeller.setSellerAddress(seller.getSellerAddress());
		existedSeller.setSellerContactNo(seller.getSellerContactNo());
		existedSeller.setSellerEmail(seller.getSellerEmail());
		existedSeller.setSellerName(seller.getSellerName());
		existedSeller.setSellerPassword(seller.getSellerPassword());
		existedSeller.setSellerStatus(seller.getSellerStatus());
		
		return repository.save(existedSeller);
	}	
	
}