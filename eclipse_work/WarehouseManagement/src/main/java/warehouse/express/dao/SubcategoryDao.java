package warehouse.express.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import warehouse.express.dbcon.DatebaseConnection;
import warehouse.express.models.SubcategoryModel;




public class SubcategoryDao {

	public String addSubcategory(SubcategoryModel subcategoryModel) {
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			int a=st.executeUpdate("insert into Subcategory(SubcategoryName,CategoryId) values('"+subcategoryModel.getSubcategoryName()+"','"+subcategoryModel.getCategoryId()+"')");	
			
			return "Sub Category Added Successfully";
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
		return "Fails to add sub category";	
	}
	
	public  List<SubcategoryModel> getSubcategory(){
			
			try {
				Connection con = DatebaseConnection.getConnection();
				Statement st = con.createStatement();
				
				ResultSet rs=st.executeQuery("select * from Subcategory");
				
				List<SubcategoryModel> subcategoryList=new ArrayList<SubcategoryModel>();
				while(rs.next()) {
					
					SubcategoryModel subegoryModel=new SubcategoryModel();
					
					subegoryModel.setSubcategoryName(rs.getString("SubcategoryName"));
					subegoryModel.setSubcategoryId(rs.getString("SubcategoryId"));
					subegoryModel.setCategoryId(rs.getString("CategoryId"));
					
					subcategoryList.add(subegoryModel);
				}
				return subcategoryList;
				
			}catch(Exception e) {
				
				System.out.println(e);
				
				return null;
			}
		}	
	
	public  List<SubcategoryModel> getSubcategory(String CategoryId){
		
		try {
			Connection con = DatebaseConnection.getConnection();
			Statement st = con.createStatement();
			System.out.println("select * from Subcategory where CategoryId='"+CategoryId+"'");
			ResultSet rs=st.executeQuery("select * from Subcategory where CategoryId='"+CategoryId+"'");
			
			List<SubcategoryModel> subcategoryList=new ArrayList<SubcategoryModel>();
			while(rs.next()) {
				
				SubcategoryModel subegoryModel=new SubcategoryModel();
				
				subegoryModel.setSubcategoryName(rs.getString("SubcategoryName"));
				subegoryModel.setSubcategoryId(rs.getString("SubcategoryId"));
				subegoryModel.setCategoryId(rs.getString("CategoryId"));
				
				subcategoryList.add(subegoryModel);
			}
			return subcategoryList;
			
		}catch(Exception e) {
			
			System.out.println(e);
			
			return null;
		}
	}	

	}
