package warehouse.express.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.CategoryModel;



public class CategoryDao {
	 
	public String addCategory(CategoryModel categoryModel) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			int a=st.executeUpdate("insert into Category(CategoryName) values('"+categoryModel.getCategoryName()+"')");	
			return "Category Added Successfully";
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
		return "Fail to add Category";	
	}
	
	public  List<CategoryModel> getCategory(){
		
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from Category");
			List<CategoryModel> categoryList=new ArrayList<CategoryModel>();
			while(rs.next()) {
				
				CategoryModel categoryModel=new CategoryModel();
				categoryModel.setCategoryId(rs.getString("CategoryId"));
				categoryModel.setCategoryName(rs.getString("CategoryName"));
				
				categoryList.add(categoryModel);
			}
			return categoryList;
			
		}catch(Exception e) {
			
			System.out.println(e);
			
			return null;
		}
	}	
}

