package com.xworkz.task.object.app;

public class Cave {
	
	private String name;
	private String location;
	private boolean isOpenalways;
	private double depth;
	private double temperature;
	private boolean explorationStatus;
	private String geologicalFormation;
	private String caveSystemType;
	private int stalactiteCount;
	private int batPopulation;

	public Cave() {
		
	}

	public Cave(String name, String location, boolean isOpenalways, double depth, double temperature,
			boolean explorationStatus, String geologicalFormation, String caveSystemType, int stalactiteCount,
			int batPopulation) {
		super();
		this.name = name;
		this.location = location;
		this.isOpenalways = isOpenalways;
		this.depth = depth;
		this.temperature = temperature;
		this.explorationStatus = explorationStatus;
		this.geologicalFormation = geologicalFormation;
		this.caveSystemType = caveSystemType;
		this.stalactiteCount = stalactiteCount;
		this.batPopulation = batPopulation;
	}

	@Override
	public String toString() {
		System.out.println("invoking toString() in Cave");
		return "Name:" + name + " Location: " + location + " Always Open:" + isOpenalways + " Depth:" + depth
				+ " Tempareture:" + temperature + " Exploration Status:" + explorationStatus + " Geological Formation:"
				+ geologicalFormation + " Cave System Type:" + caveSystemType + " Stalactite Count:" + stalactiteCount
				+ " Bat Population:" + batPopulation;
	}

}
