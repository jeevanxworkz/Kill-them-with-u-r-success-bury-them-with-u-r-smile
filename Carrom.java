class Carrom{
	double width;
	double height;
	int weight;
	String shape;
	String materialUsed;
	
	Carrom(double width)
	{
		this.width=width;
	}
	
	Carrom(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	Carrom(double width,double height,int weight)
	{
		this.width=width;
		this.height=height;
		this.weight=weight;
	}
	Carrom(double width,double height,int weight,String shape)
	{
		this.width=width;
		this.height=height;
		this.weight=weight;
		this.shape=shape;
	}
	Carrom(double width,double height,int weight,String shape,String materialUsed)
	{
		this.width=width;
		this.height=height;
		this.weight=weight;
		this.shape=shape;
		this.materialUsed=materialUsed;
	}
}