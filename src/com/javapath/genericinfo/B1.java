package com.javapath.genericinfo;

import com.javapath.genericinforgain.C2;

public class B1 {

	public static void main(String[] args) {
		System.out.println(A1.defaultMember);
		System.out.println(C1.defaultMember);
		
		System.out.println(A1.protectedMember);
		System.out.println(C1.protectedMember);
		System.out.println(C2.protectedMember);
		
		
		System.out.println(A1.publicMember);
		System.out.println(C1.publicMember);
		System.out.println(C2.publicMember);
		


	}

}
