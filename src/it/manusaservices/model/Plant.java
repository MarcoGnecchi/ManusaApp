package it.manusaservices.model;



public class Plant {

	static final String DEFAULT_VALUE = "Non definito";

	String shipmentDate, warrantyDate, number, warranty, state, supply,
			address, city;

	Integer Id, doorId;
	Work work;
	Customer customer;
	Door door;

	public Plant() {

		shipmentDate = DEFAULT_VALUE;
		warranty = DEFAULT_VALUE;
		number = DEFAULT_VALUE;
		state = DEFAULT_VALUE;
		supply = DEFAULT_VALUE;
		address = DEFAULT_VALUE;
		city = DEFAULT_VALUE;
		warrantyDate = DEFAULT_VALUE;
		Id = null;
		doorId = null;

		door = new Door();
		customer = new Customer();
		work = new Work();

	}

	public Plant(String XMLplant) {
		this();

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}



	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(String warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getDoorId() {
		return doorId;
	}

	public void setDoorId(Integer doorId) {
		this.doorId = doorId;
	}

}
