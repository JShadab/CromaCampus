package warehouse.express.models;

public class SellerModel {
	
	private String SellerId;
	private String Name;
	private String Email;
	private String Phone;
	private String Password;
	private String Tin;
	private String LocationId;
	private String Address;
	private String Status;
	private LocationModel locationModel;
	public String getSellerId() {
		return SellerId;
	}
	public void setSellerId(String sellerId) {
		SellerId = sellerId;
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
	public String getTin() {
		return Tin;
	}
	public void setTin(String tin) {
		Tin = tin;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
