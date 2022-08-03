package warehouse.express.models;

public class TrackingModel {

	private String TrackingId;
	private String productorderId;
	private ProductorderModel productorderModel;
	private String CurrentId;
	private String CurrentUser;
	private String CurrentStatus;
	private String CurrentDate;
	private String CurrentUserName;
	public String getTrackingId() {
		return TrackingId;
	}
	public void setTrackingId(String trackingId) {
		TrackingId = trackingId;
	}
	public String getProductorderId() {
		return productorderId;
	}
	public void setProductorderId(String productorderId) {
		this.productorderId = productorderId;
	}
	public ProductorderModel getProductorderModel() {
		return productorderModel;
	}
	public void setProductorderModel(ProductorderModel productorderModel) {
		this.productorderModel = productorderModel;
	}
	public String getCurrentId() {
		return CurrentId;
	}
	public void setCurrentId(String currentId) {
		CurrentId = currentId;
	}
	public String getCurrentUser() {
		return CurrentUser;
	}
	public void setCurrentUser(String currentUser) {
		CurrentUser = currentUser;
	}
	public String getCurrentStatus() {
		return CurrentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		CurrentStatus = currentStatus;
	}
	public String getCurrentDate() {
		return CurrentDate;
	}
	public void setCurrentDate(String currentDate) {
		CurrentDate = currentDate;
	}
	public String getCurrentUserName() {
		return CurrentUserName;
	}
	public void setCurrentUserName(String currentUserName) {
		CurrentUserName = currentUserName;
	}
	
}
