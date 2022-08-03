package warehouse.express.models;

public class ProductorderModel {

	private String productorderId;
	private String SellerId;
	private SellerModel sellerModel;
	private String BuyerId;
	private BuyerModel buyerModel;
	private String CurrentId;
	private String CurrentUser;
	private String CurrentStatus;
	private String CurrentDate;
	private String Status;
	public String getProductorderId() {
		return productorderId;
	}
	public void setProductorderId(String productorderId) {
		this.productorderId = productorderId;
	}
	public String getSellerId() {
		return SellerId;
	}
	public void setSellerId(String sellerId) {
		SellerId = sellerId;
	}
	public SellerModel getSellerModel() {
		return sellerModel;
	}
	public void setSellerModel(SellerModel sellerModel) {
		this.sellerModel = sellerModel;
	}
	public String getBuyerId() {
		return BuyerId;
	}
	public void setBuyerId(String buyerId) {
		BuyerId = buyerId;
	}
	public BuyerModel getBuyerModel() {
		return buyerModel;
	}
	public void setBuyerModel(BuyerModel buyerModel) {
		this.buyerModel = buyerModel;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
