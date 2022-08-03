package warehouse.express.models;

public class SellerProductModel {
	
	private String SellerProductId;
	private String ProductName;
	private String CategoryId;
	private CategoryModel categoryModel;
	private String SubcategoryId;
	private SubcategoryModel subcategoryModel;
	private String Price;
	private String Picture;
	private String BrandName;
	private String Description;
	private String SellerId;
	private SellerModel sellerModel;
	private String Status;
	public String getSellerProductId() {
		return SellerProductId;
	}
	public void setSellerProductId(String sellerProductId) {
		SellerProductId = sellerProductId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(String categoryId) {
		CategoryId = categoryId;
	}
	public CategoryModel getCategoryModel() {
		return categoryModel;
	}
	public void setCategoryModel(CategoryModel categoryModel) {
		this.categoryModel = categoryModel;
	}
	public String getSubcategoryId() {
		return SubcategoryId;
	}
	public void setSubcategoryId(String subcategoryId) {
		SubcategoryId = subcategoryId;
	}
	public SubcategoryModel getSubcategoryModel() {
		return subcategoryModel;
	}
	public void setSubcategoryModel(SubcategoryModel subcategoryModel) {
		this.subcategoryModel = subcategoryModel;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
