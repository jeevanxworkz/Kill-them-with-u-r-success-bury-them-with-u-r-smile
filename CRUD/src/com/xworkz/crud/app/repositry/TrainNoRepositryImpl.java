package com.xworkz.crud.app.repositry;

public class TrainNoRepositryImpl implements TrainNoRepositry {
	
	private int[] nos = new int[TOTAL_NOS];
	private int position;
	
	@Override
	public void save(int trainNo) {
		System.out.println("invoking save in TrainNoRepositry");
		if(position <TOTAL_NOS)
		{
			this.nos[position]=trainNo;
			System.out.println("TrainNo added"+trainNo+ "at position"+this.position);
			this.position++;
		}else {
			System.err.println("stored trainNo is more than stored trainNo");
		}
	}
	@Override
	public boolean isExist(int trainNo) {
		for(int index =0;index< this.position;index++) {
			int temp=this.nos[index];
			if(temp==trainNo) {
				System.out.println("trainNo already exist");
				return true;
				
				
				
				
				
				
				
				
			}
		}
			
		return false;
	}

	}