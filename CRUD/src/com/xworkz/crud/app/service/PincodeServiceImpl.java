package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repositry.PincodeRepositry;

public class PincodeServiceImpl implements PincodeService {
	private PincodeRepositry pincodeRepositry;
	public PincodeServiceImpl(PincodeRepositry pincodeRepositry) {
		this.pincodeRepositry=pincodeRepositry;
	}
	@Override
	public boolean ValidAndSave(int pincode) {
		System.out.println("invoking validate and store to "+this.getClass().getSimpleName());
		if(pincode >=500000 && pincode<=1000000) {
			System.out.println("if Pincode is valid...");
			if(!this.pincodeRepositry.isExist(pincode)) {
				(this.pincodeRepositry).save(pincode);
				return true;
			}
			else {
				System.err.println("pincode is already exist...");
			}
		}else {
			System.err.println("Stored valid is invalid, cannot save...");
			}
		return false;
	}

}
	
	
	
	