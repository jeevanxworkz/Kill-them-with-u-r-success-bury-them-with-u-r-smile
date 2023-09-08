package com.xworkz.crud.app.repositry;

public class LocationRepositryImpl implements LocationRepositry {

	private String[] locations = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void store(String locations) {
		System.out.println("invoking store in LocationRepositry");
		if (position < TOTAL_ITEMS) {
			this.locations[position] = locations;
			System.out.println("location is+" + locations + "Stored at position" + position);
			System.out.println("stored" + locations + "in position" + this.position);
			this.position++;
		} else {
			System.err.println("stored locations is more than stored locations");
		}

	}

	@Override
	public boolean isExist(String locations) {
		for (int index = 0; index < this.position; index++) {
			String temp = this.locations[index];
			if(temp.equals(locations)){
				System.out.println("locations name is already exists....");
				return true;
			}
		}
		return false;
	}

}
