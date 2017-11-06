package com.javapath.userinfo;

public class Staff extends User{
	
	public void printUserType(){
		
		System.out.println("Staff");
		
	}
	
	@Override
	public void postAReview() {
		System.out.println("staff: postAReview" );
	}

}
