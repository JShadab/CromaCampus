package warehouse.express.models;

public class WarehouseModel {

	private String WarehouseId;
	private String WarehouseName;
	private String Phone;
	private String Email;
	private String Password;
	private String ManagerName;
	private String Address;
	private String LocationId;
	private LocationModel locationModel;
	public String getWarehouseId() {
		return WarehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		WarehouseId = warehouseId;
	}
	public String getWarehouseName() {
		return WarehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		WarehouseName = warehouseName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLocationId() {
		return LocationId;
	}
	public void setLocationId(String locationId) {
		LocationId = locationId;
	}
	public LocationModel getLocationModel() {
		return locationModel;
	}
	public void setLocationModel(LocationModel locationModel) {
		this.locationModel = locationModel;
	}
	
}
