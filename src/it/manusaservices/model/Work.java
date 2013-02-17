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
	
	public  String toXML(){
	
		XmlSerializer serializer = Xml.newSerializer();
		StringWriter writer = new StringWriter();
		try {
			serializer.setOutput(writer);
			serializer.startDocument("UTF-8", true);
			serializer.startTag(null, "workdata");
			serializer.startTag(null, "work");
			
			serializer.startTag(null,"date");
			serializer.endTag(null,	"date");
			serializer.startTag(null,"hour");
			serializer.endTag(null,	"hour");
			serializer.startTag(null,"note");
			serializer.text(this.getNote());
			serializer.endTag(null,	"note");
			serializer.startTag(null,"plant_id");
			serializer.text(this.getPlantId().toString());
			serializer.endTag(null,	"plant_id");
			serializer.startTag(null,"manpowerhours");
			serializer.text(this.getManpowerHours().toString());
			serializer.endTag(null,	"manpowerhours");
			serializer.startTag(null,"kilometers");
			serializer.text(this.getKilometers().toString());
			serializer.endTag(null,	"kilometers");
			serializer.startTag(null,"priceperwork");
			serializer.text(this.getPriceperwork().toString());
			serializer.endTag(null,	"priceperwork");
			serializer.startTag(null,"manpowerprice");
			serializer.text(this.getPricePerManpower().toString());
			serializer.endTag(null,	"manpowerprice");
			serializer.startTag(null,"kilometersprice");
			serializer.text(this.getPricePerKilometers().toString());
			serializer.endTag(null,	"kilometersprice");
			serializer.endTag(null, "work");
			serializer.startTag(null, "item");
			for (Item item : items){
				for (int i = 0; i < item.getNumOfElements(); i++) {
					serializer.startTag(null, "item");
					serializer.text(item.getId().toString());
					serializer.endTag(null, "item");

				}
			}
			serializer.endTag(null, "item");
			serializer.endTag(null, "workdata");
			serializer.endDocument();
		
		
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return writer.toString();	
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
