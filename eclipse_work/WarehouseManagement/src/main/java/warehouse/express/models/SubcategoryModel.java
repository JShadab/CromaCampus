package warehouse.express.models;



public class SubcategoryModel {

	private String SubcategoryId;
	private String SubcategoryName;
	private String CategoryId;
	private CategoryModel categoryModel;
	public String getSubcategoryId() {
		return SubcategoryId;
	}
	public void setSubcategoryId(String subcategoryId) {
		SubcategoryId = subcategoryId;
	}
	public String getSubcategoryName() {
		return SubcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		SubcategoryName = subcategoryName;
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
}
