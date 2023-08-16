package com.xworkz.task.object.app;

public class Pendant {
	
	private String name;
	private String material;
	private String design;
	private String color;
	private int size;
	private int weight;
	private String gameStone;
	private String chainType;
	private long price;
	private String owner;
	private String occasion;
	private String countryOfOrigin;

	public Pendant() {

	}

	public Pendant(String name, String material, String design, String color, int size, int weight, String gameStone,
			String chainType, long price, String owner, String occasion, String countryOfOrigin) {
		super();
		this.name = name;
		this.material = material;
		this.design = design;
		this.color = color;
		this.size = size;
		this.weight = weight;
		this.gameStone = gameStone;
		this.chainType = chainType;
		this.price = price;
		this.owner = owner;
		this.occasion = occasion;
		this.countryOfOrigin = countryOfOrigin;
	}

	public String toString() {
		System.out.println("invoking toString() in Pendant");
		return "Name:" + name + " Material:" + material + " Design:" + design + " Color:" + color + " Size:" + size
				+ " Weight:" + weight + " Game Stone:" + gameStone + " Chain Type:" + chainType + " Price:" + price
				+ " Onwer:" + owner + " Occasion:" + occasion + " Country of Origin:" + countryOfOrigin;
	}

}