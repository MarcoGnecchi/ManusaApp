package it.manusaservices.model;



import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class Item implements Parcelable {

	private String code, description;
	private Integer id, price, numOfElements;
	
	private Item(Parcel in) {
		Log.v("ITEM", "ParcelData(Parcel source): time to put back parcel data");
		id = in.readInt();
		price = in.readInt();
		numOfElements = in.readInt();
		code = in.readString();
		description = in.readString();
		
	}

	public Item(Integer id, String code, Integer price, String description) {
		this.id = id;
		this.code = code;
		this.price = price;
		this.description = description;
		this.numOfElements = 0;

	}

	

	
	
	
	public void increase(){
		this.numOfElements++;
	}
	public void decrease(){
		this.numOfElements--;
	}
	
	public Integer getNumOfElements() {
		return numOfElements;
	}

	public void setNumOfElements(Integer numOfElements) {
		this.numOfElements = numOfElements;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(id);
		dest.writeInt(price);
		dest.writeInt(numOfElements);
		dest.writeString(code);
		dest.writeString(description);
		// TODO Auto-generated method stub

	}


	
	
	public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {

		@Override
		public Item createFromParcel(Parcel in) {
			return new Item(in);
		}

		@Override
		public Item[] newArray(int size) {
			return new Item[size];
		}

	};

}
