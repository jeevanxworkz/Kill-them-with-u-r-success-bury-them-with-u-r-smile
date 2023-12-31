package com.xworkz.Engineer.app.dto;

public class EngineerDTO {

	
	private String id;
	private String name;
	private String collegeName;
	
	public EngineerDTO() {
	
	}
		
		public EngineerDTO(String id,String name,String collegeName) {
			
			
			super();
			this.id=id;
			this.name=name;
			this.collegeName=collegeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EngineerDTO other = (EngineerDTO) obj;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
		
		public String getid() {
			return id;
		}
		public void setId(String id) {
			this.id=id;
		}
		public String getName() {
			return name;
		}
		public void setName( String name) {
			this.name=name;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName=collegeName;
	}
	
}
