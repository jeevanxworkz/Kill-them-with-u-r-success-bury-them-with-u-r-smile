package com.xworkz.Engineer.app.dto;

public class ApplicationDTO {
	
	private int id;
	private String name;
	private String developedBy;
	private String developedAt;
	private String version;
	
	
	
	public ApplicationDTO(){
		
	}
	
	public ApplicationDTO(int id,String name,String develpedBy,String devolpedAt,String version) {
		super();
		this.id=id;
		this.name=name;
		this.developedBy=developedBy;
		this.developedAt=developedAt;
		this.version=version;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developedAt == null) ? 0 : developedAt.hashCode());
		result = prime * result + ((developedBy == null) ? 0 : developedBy.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		if (developedAt == null) {
			if (other.developedAt != null)
				return false;
		} else if (!developedAt.equals(other.developedAt))
			return false;
		if (developedBy == null) {
			if (other.developedBy != null)
				return false;
		} else if (!developedBy.equals(other.developedBy))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String getName) {
		this.name=name;
	}
	public String getDevelopedby() {
		return developedBy;
	}
	public void setDevelopedby(String getDevelopedby) {
		this.developedBy=developedBy;
	}
	public String getDevelopedat() {
		return developedAt;
	}
	public void setDevelopedat(String getDevelopedat) {
		this.developedAt=developedAt;
	}

	public String getVersion() {
		return null;
	}
	public void setVersion(String getVersion) {
		this.version=version;
	}
}
