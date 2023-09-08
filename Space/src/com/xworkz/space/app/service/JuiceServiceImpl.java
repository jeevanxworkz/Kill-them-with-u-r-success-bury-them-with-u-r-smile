package com.xworkz.space.app.service;


public abstract  class JuiceServiceImpl implements JuiceService {
	
	private JuiceRepositry juiceRepositry;
	public JuiceServiceImpl (JuiceRepositry juiceRepositry){
		this.juiceRepositry=juiceRepositry;
	}

	@Override
	public boolean validateAndSave(String juice) {
		System.out.println("invoking validate and store to " + this.getClass().getSimpleName());
		if (juice != null && !juice.isEmpty() && juice.length() >= 3 && juice.length() <= 20) {
			System.out.println("Stored juice is valid ");
			if(!this.juiceRepositry.isExist(juice))
			{
			this.juiceRepositry.store(juice);
			return true;
			}
			else
			{
				System.err.println("juice name is already exist..");
			}
		} else {
			System.err.println("Stored valid is invalid, cannot save..");
		}
		return false;

	
	}
}

		