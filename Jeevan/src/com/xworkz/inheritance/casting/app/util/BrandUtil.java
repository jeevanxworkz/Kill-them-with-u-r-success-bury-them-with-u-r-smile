package com.xworkz.inheritance.casting.app.util;

import com.xworkz.inheritance.casting.app.Brand;
import com.xworkz.inheritance.casting.app.DuplicateBrand;
import com.xworkz.inheritance.casting.app.InternationalBrand;
import com.xworkz.inheritance.casting.app.LocalBrand;
import com.xworkz.inheritance.casting.app.NationalBrand;

public class BrandUtil {
public static void location(Brand brand)
{
	System.out.println("invoking Brand in BrandUtil");
	System.out.println(brand.name);
	brand.brandInfo();
	if(brand instanceof LocalBrand)
	{
		System.out.println("****************LocalBrand***********");
		LocalBrand localBrand=(LocalBrand)brand;
		System.out.println(localBrand.name);
		localBrand.localInfo();
		
	}
	if(brand instanceof NationalBrand)
	{
		System.out.println("*****************NationalBrand***********");
		NationalBrand nationalBrand=(NationalBrand)brand;
		System.out.println(nationalBrand.price);
		nationalBrand.sell();
		
	}
	if(brand instanceof DuplicateBrand)
	{
		System.out.println("*************DuplicateBrand*************");
		DuplicateBrand duplicateBrand=(DuplicateBrand)brand;
		System.out.println(duplicateBrand.since);
		duplicateBrand.duplicateInfo();
		
	}
	if(brand instanceof InternationalBrand)
	{
		System.out.println("******************InternationalBrand*****************");
		InternationalBrand internationalBrand=(InternationalBrand)brand;
		System.out.println(internationalBrand.quantity);
		internationalBrand.internationalInfo();
		
	}
}

}
