package com.xworkz.inheritance.casting.app.boot;

import com.xworkz.inheritance.casting.app.Brand;
import com.xworkz.inheritance.casting.app.DuplicateBrand;
import com.xworkz.inheritance.casting.app.InternationalBrand;
import com.xworkz.inheritance.casting.app.LocalBrand;
import com.xworkz.inheritance.casting.app.NationalBrand;
import com.xworkz.inheritance.casting.app.util.*;

public class BrandRunner {
	public static void main(String[] args) {
		System.out.println("invoking main BrandRunner");
		System.out.println("...............................");
		Brand brand=new Brand();
		LocalBrand localBrand=new LocalBrand();
		NationalBrand nationalBrand=new NationalBrand();
		DuplicateBrand duplicateBrand =new DuplicateBrand();
		InternationalBrand internationalBrand=new InternationalBrand();
		BrandUtil.location(brand);
		System.out.println("...............................");
		BrandUtil.location(localBrand);
		System.out.println("...............................");
		BrandUtil.location(nationalBrand);
		System.out.println("...............................");
		BrandUtil.location(duplicateBrand);
		System.out.println("...............................");
		BrandUtil.location(internationalBrand);


	}

}


