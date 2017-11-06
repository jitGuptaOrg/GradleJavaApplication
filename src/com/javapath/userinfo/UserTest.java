package com.javapath.userinfo;

import java.util.HashMap;

public class UserTest {
	
	
	public void printUserType(User u){
		u.printUserType();
		
	}

	public static void main(String[] args) {
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		
		UserTest test = new UserTest();
		editor.printUserType();
		/*test.printUserType(user);
		test.printUserType(staff);
		test.printUserType(editor);*/
		
		user.approveReview(new Editor());
		staff.saveWebLink();
		
		
		
	}

}
