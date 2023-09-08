package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repositry.MobileNoRepositry;



public class MobileNoServiceImpl implements MobileNoService {
	
private MobileNoRepositry mobileNoRepository;
	
	public MobileNoServiceImpl(MobileNoRepositry mobileNoRepository) {
		this.mobileNoRepository=mobileNoRepository;
	}
	
	@Override
	public boolean validateAndSave(long mobileNo) {
		System.out.println("invoking validate and save in "+this.getClass().getSimpleName());
		if(mobileNo!=0 && mobileNo>999999999L && mobileNo<99999999999L)
		{
			System.out.println("Mobile no is valid..");
			if(!this.mobileNoRepository.isExist(mobileNo)) {
			this.mobileNoRepository.save(mobileNo);
			return true;
			}
		}
		else
		{
			System.err.println("Mobile no is invalid, cannot save");
		}
		return false;
	}

}
	