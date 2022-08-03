package warehouse.express.models;

public class ProductitemModel {
	
	private String ProductitemId;
	private String productorderId;
	private ProductorderModel productorderModel;
	private String SellerProductId;
	private SellerProductModel sellerProductModel;
	private String Quantity;
	private String Price;
	private String Status;
	public String getProductitemId() {
		return ProductitemId;
	}
	public void setProductitemId(String productitemId) {
		ProductitemId = productitemId;
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
	public String getSellerProductId() {
		return SellerProductId;
	}
	public void setSellerProductId(String sellerProductId) {
		SellerProductId = sellerProductId;
	}
	public SellerProductModel getSellerProductModel() {
		return sellerProductModel;
	}
	public void setSellerProductModel(SellerProductModel sellerProductModel) {
		this.sellerProductModel = sellerProductModel;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
