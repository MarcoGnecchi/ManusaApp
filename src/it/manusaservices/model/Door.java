package it.manusaservices.model;

import java.util.ArrayList;




public class Door {
	
	static final String DEFAULT_VALUE = "Non definito";

	Integer id;
	String motorType,shutter,glass,colorType,color,doorType,motorDescription;
	ArrayList<Item> availableItem;
	
	public Door() {
		availableItem = new ArrayList<Item>(); 
	}


	public ArrayList<Item> getAvailableItem() {
		return availableItem;
	}

	public void setAvailableItem(ArrayList<Item> availableItem) {
		this.availableItem = availableItem;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer doorId) {
		this.id = doorId;
	}

	
	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	public String getMotorDescription() {
		return motorDescription;
	}

	public void setMotorDescription(String motorDescription) {
		this.motorDescription = motorDescription;
	}



	public String getShutter() {
		return shutter;
	}

	public void setShutter(String shutter) {
		this.shutter = shutter;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public String getColorType() {
		return colorType;
	}

	public void setColorType(String colorType) {
		this.colorType = colorType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDoorType() {
		return doorType;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}
		

	
}
