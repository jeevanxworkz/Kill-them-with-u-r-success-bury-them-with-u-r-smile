class CarromPlayer{ 
public static void main(String[] args)
{

		System.out.println("\n");
		System.out.println("<<<<<<<<<<CARROM>>>>>>>>>>");
		System.out.println("\n");
		
		Carrom shot=new Carrom(88.9);
		System.out.println("Carrom Width :"+shot.width);
		System.out.println("Carrom height :"+shot.height);
		System.out.println("Carrom weight :"+shot.weight);
		System.out.println("Shape of the carrom:"+shot.shape);
		System.out.println("Material Used in Carrom:"+shot.materialUsed);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		Carrom shot1=new Carrom(88.9,88.9);
		System.out.println("Carrom Width :"+shot1.width);
		System.out.println("Carrom height :"+shot1.height);
		System.out.println("Carrom weight :"+shot1.weight);
		System.out.println("Shape of the carrom:"+shot1.shape);
		System.out.println("Material Used in Carrom:"+shot1.materialUsed);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		Carrom shot2=new Carrom(88.9,88.9);
		System.out.println("Carrom Width :"+shot2.width);
		System.out.println("Carrom height :"+shot2.height);
		System.out.println("Carrom weight :"+shot2.weight);
		System.out.println("Shape of the carrom:"+shot2.shape);
		System.out.println("Material Used in Carrom:"+shot2.materialUsed);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Carrom shot3=new Carrom(88.9,88.9,9,"Square");
		System.out.println("Carrom Width :"+shot3.width);
		System.out.println("Carrom height :"+shot3.height);
		System.out.println("Carrom weight :"+shot3.weight);
		System.out.println("Shape of the carrom:"+shot3.shape);
		System.out.println("Material Used in Carrom:"+shot3.materialUsed);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Carrom shot4=new Carrom(88.9,88.9,9,"Square","Wood");
		System.out.println("Carrom Width :"+shot4.width);
		System.out.println("Carrom height :"+shot4.height);
		System.out.println("Carrom weight :"+shot4.weight);
		System.out.println("Shape of the carrom:"+shot4.shape);
		System.out.println("Material Used in Carrom:"+shot4.materialUsed);
}
}