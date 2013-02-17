package it.manusaservices.model;

public class Payment {
	private Integer id;
	private String type;
	private String description;

	public Payment(Integer id,String type,String description){
		this.setType(type);
		this.setDescription(description);
	};
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Payment() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}