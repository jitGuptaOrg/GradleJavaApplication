package com.javapath.userinfo;

public class User {
	
	public int id = 1;
	
	public void printUserType(){
		
		System.out.println("User");
		
	}
	
	
	public void saveWebLink(){
		System.out.println("User: SaveWebLink");
		postAReview();
	}
	
	
	public void postAReview(){
		
		System.out.println("User: postAReview");
		
	}
	
	public void approveReview(Staff s){
		
		if(s instanceof Editor){
			
			((Editor)s).approveReview();
		}else{
			
			System.out.println("Invalid Object Passed");
		}
		
		
		
		
	}

}
