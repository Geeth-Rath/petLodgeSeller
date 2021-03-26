package com.petLodgeSeller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.petLodgeSeller.entity.Seller;
import com.petLodgeSeller.service.SellerService;



@RestController
@CrossOrigin(origins ="*")
public class SellerController {
	
	@Autowired
	private SellerService service;
		

	@PostMapping("/addseller")
	public Seller addSeller(@RequestBody Seller seller) throws Exception{
		String tempEId = seller.getSellerId();
		if(tempEId != null && !"".equals(tempEId)) {
			Seller sell = service.getSellerById(tempEId);
			if(sell != null) {
				throw new Exception("Seller id "+tempEId+" already exists");
			}
			else {
				return service.saveSeller(seller);
			}
		}
		else {
			throw new Exception("null or empty inserted!check again");
		}
		
	}
		
		
	@PostMapping("/sellerlogin")
	public Seller sellerLogin (@RequestBody Seller seller) throws Exception {
		String userid = seller.getSellerId();
		String passw = seller.getSellerPassword();
		Seller logSeller= null;
		if(userid != null && passw != null) {
			logSeller = service.getSellerByIdandPassword(userid, passw);
			}
		if(logSeller == null) {
			String messageone = "wrong password or Id number! please check again.";
			throw new Exception(messageone);
		}
		return logSeller;
	}
	

	
	@GetMapping("/sellers")
	public List<Seller> findAllSellers() {
		return service.getSellers();
	}
	
	@GetMapping("/sellerById/{sellerId}")
	public Seller findSellerById(@PathVariable String sellerId) {
		return service.getSellerById(sellerId);
	}
	
		
	@GetMapping("/sellerByName/{sellerName}")
	public Seller findSellerByName (@PathVariable String sellerName) {
		return service.getSellerByName(sellerName);
	}
	
	@PutMapping("/updateseller")
	public Seller upateSeller(@RequestBody Seller seller) {
		return service.updateSeller(seller);  
	}
	
	@DeleteMapping("/deleteseller/{sellerId}")
	public String deleteSeller(@PathVariable String sellerId) {
		return service.deleteSeller(sellerId);
	}
	
}

