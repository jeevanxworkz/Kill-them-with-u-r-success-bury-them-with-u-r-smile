package com.xworkz.task.equals.app;

public class Minister {
	
	private String name;
	private String partyName;
	private String positionName;
	private String kshetra;
	private int period;
	private boolean isPresentMinister;
	
	public Minister() {
}

	public Minister(String name, String partyName, String positionName, String kshetra, int period, boolean isPresentMinister) {
		super();
		this.name = name;
		this.partyName = partyName;
		this.positionName = positionName;
		this.kshetra = kshetra;
		this.period = period;
		this.isPresentMinister = isPresentMinister;
	}
	
	@Override
	public String toString() {
		System.out.println("invoking toString() in Minister");
		return "Name:"+name+"partyName:"+partyName+"positionName:"+positionName+"kshetra:"+kshetra+"period:"+period+"isPresentMinister:"+isPresentMinister;
	}   
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals() in Minister");
		if(obj !=null) {
			System.out.println("obj is not null");
			if(obj instanceof Minister) {
				System.out.println("obj is instanceof Minister");
				Minister min=(Minister)obj;
				if(min.name.equals(this.name)) {
					System.out.println("object and properties are same");
					return true;
				}
				else {
					System.err.println("object and properties are not same");
				}
	
				}else {
					System.err.println("object is not Minister");
				}
		        }else {
		        	System.err.println("object is null");
		        						
				}
		return false;
					
				}
			
		}
