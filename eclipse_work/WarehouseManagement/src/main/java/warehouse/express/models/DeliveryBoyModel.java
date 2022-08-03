package warehouse.express.models;

public class DeliveryBoyModel {
	private String DeliveryBoyId;
	private String Name;
	private String Email;
	private String Phone;
	private String Password;
	private String Experience;
	private String WarehouseId;
	private WarehouseModel warehouseModel;
	public String getDeliveryBoyId() {
		return DeliveryBoyId;
	}
	public void setDeliveryBoyId(String deliveryBoyId) {
		DeliveryBoyId = deliveryBoyId;
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
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public String getWarehouseId() {
		return WarehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		WarehouseId = warehouseId;
	}
	public WarehouseModel getWarehouseModel() {
		return warehouseModel;
	}
	public void setWarehouseModel(WarehouseModel warehouseModel) {
		this.warehouseModel = warehouseModel;
	}
	
}
