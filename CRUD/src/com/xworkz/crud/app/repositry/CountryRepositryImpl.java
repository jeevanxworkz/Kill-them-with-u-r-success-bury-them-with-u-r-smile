package com.xworkz.crud.app.repositry;

public class CountryRepositryImpl implements CountryRepositry {
	
	private String[] countries = new String[TOTAL_ITEMS];
	private int position;
	

	@Override
	public void store(String countries) {
		System.out.println("invoking store in LocationRepositry");
		if(position<TOTAL_ITEMS) 
			{
				this.countries[position]=countries;
				System.out.println("countries is +"+countries+"stored at position"+position);
				System.out.println("stored"+countries+"in position"+this.position);
				this.position++;
			}
			else {
				
				System.err.println("stored countries is more than stored countries");
			}
			}
					@Override
					public boolean isExist(String countries) {
						for(int index=0;index<this.position;index++)
						{
							String temp=this.countries[index];
							{
								System.out.println("countries name is already exists....");
							}
							}
						return false;
					}


					}



