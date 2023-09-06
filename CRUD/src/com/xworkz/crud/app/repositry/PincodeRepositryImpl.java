package com.xworkz.crud.app.repositry;

public class PincodeRepositryImpl implements PincodeRepositry {

	private int[] codes = new int[TOTAL_CODES];
	private int position;

	@Override
	public void save(int pincodes) {
		System.out.println("invoking save in PincodeRepositry");
		if (position < TOTAL_CODES)
		{
			this.codes[position] = pincodes;
			System.out.println("Pincode added" + pincodes + "at position" + this.position);
			this.position++;
		} else {
			System.err.println("Stored pincode is more than stored pincode");
		}
	}

	@Override
	public boolean isExist(int pincodes) {
		for (int index = 0; index < this.position; index++) {
			int temp = this.codes[index];
			if (temp== pincodes) {
				System.err.println("pincodes already exist");
				return  true;
			}
		}
		return false;
	}
}