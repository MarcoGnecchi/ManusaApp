package it.manusaservices.model;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import org.xmlpull.v1.XmlSerializer;

import android.util.Xml;

public class Work {
	
	private Integer id;
	private Integer plantId;
	private String plantBarCode; 
	private String note;
	private ArrayList<Item> items;
	private Integer manpowerHours, kilometers;
	private Double priceperwork, pricePerManpower, pricePerKilometers;
	private Payment payment;
	private Boolean posted;
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getPosted() {
		return posted;
	}

	public void setPosted(Boolean posted) {
		this.posted = posted;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Work(){
		posted = false;
		
		
	}
	
	public Work(Integer plantId){
		this();
		this.plantId = plantId; 
	}
	
	
	
	
	




	public Integer getPlantId() {
		return plantId;
	}

	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}

	public Integer getManpowerHours() {
		return manpowerHours;
	}








	public void setManpowerHours(Integer manpowerHours) {
		this.manpowerHours = manpowerHours;
	}








	public Integer getKilometers() {
		return kilometers;
	}








	public void setKilometers(Integer kilometers) {
		this.kilometers = kilometers;
	}








	public Double getPriceperwork() {
		return priceperwork;
	}








	public void setPriceperwork(Double priceperwork) {
		this.priceperwork = priceperwork;
	}








	public Double getPricePerManpower() {
		return pricePerManpower;
	}








	public void setPricePerManpower(Double pricePerManpower) {
		this.pricePerManpower = pricePerManpower;
	}








	public Double getPricePerKilometers() {
		return pricePerKilometers;
	}








	public void setPricePerKilometers(Double pricePerKilometers) {
		this.pricePerKilometers = pricePerKilometers;
	}








	public String getPlantBarCode() {
		return plantBarCode;
	}

	public void setPlantBarCode(String plantBarCode) {
		this.plantBarCode = plantBarCode;
	}

	public String getNote() {
		if (note==null){
				note = "";		
		} 
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	
	
	

}
