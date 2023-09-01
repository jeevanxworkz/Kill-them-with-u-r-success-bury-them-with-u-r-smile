package com.xworkz.space.app.repositry;

public class PatientRepositryImpl implements PatientRepositry {
	
	String[] Patients = new String[TOTAL_NAME];
	int position;

	@Override
	public void save(String name) {
	System.out.println("invoking save in PatientRepositry");
	if(position<TOTAL_NAME)
	{
		this.Patients[position] = name;
		System.out.println("invoking save in PatientRepositry");
		System.out.println("Stored "+name+" in position "+this.position);
		this.position++;
	}
	else
	{
		System.err.println("stored name is more than stored name");
	}
		
	}

}
