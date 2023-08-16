package com.xworkz.task.object.app;

public class Kerchief {
	
	private String brand;
	private String color;
	private int size;
	private int price;
	private String type;
	private boolean washable;
	private boolean isPrinted;
	
	public Kerchief() {
		
	}
	
	public Kerchief(String brand,String color,int size,int price,String type,boolean washable,boolean isPrinted) {
		super();
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.price=price;
		this.type=type;
		this.washable=washable;
		this.isPrinted=isPrinted;
		
	}
	@Override
	public String toString() {
		System.out.println("invoking ToString in cave");
        return "brand:"+brand+"color:"+color+"size:"+size+"price:"+price+"type:"+type+"washable:"+washable+"isPrinted:"+isPrinted;
        }
}
