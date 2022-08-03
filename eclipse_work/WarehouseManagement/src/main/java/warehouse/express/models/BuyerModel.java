package warehouse.express.models;

public class BuyerModel {
	
	private String BuyerId;
	private String Name;
	private String Email;
	private String Phone;
	private String Password;
	private String LocationId;
	private String Address;
	private LocationModel locationModel;
	public String getBuyerId() {
		return BuyerId;
	}
	public void setBuyerId(String buyerId) {
		BuyerId = buyerId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLocationId() {
		return LocationId;
	}
	public void setLocationId(String locationId) {
		LocationId = locationId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public LocationModel getLocationModel() {
		return locationModel;
	}
	public void setLocationModel(LocationModel locationModel) {
		this.locationModel = locationModel;
	}

}
