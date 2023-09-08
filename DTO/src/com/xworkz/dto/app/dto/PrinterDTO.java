package com.xworkz.dto.app.dto;

public class PrinterDTO {

	private String brand;
	private String color;
	private double cost;
	
	public PrinterDTO() {
		}
	
	public PrinterDTO(String string, String string2, int i) {
	}

	@Override
	public String toString() {
		return "PrinterDTO [brand=" + brand + ", color=" + color + ", cost=" + cost + "]";
	}
		public String getbrand() {
			return brand;
		}
		public void setbrand(String brand) {
			this.brand=brand;
		}
		public String getcolor(String color) {
			return color;
		}
		public void setcolor(String color) {
			this.color=color;
		}
		public double getcost() {
			return cost;
		}
		public void setcost(double cost) {
			this.cost=cost;
	}
}
