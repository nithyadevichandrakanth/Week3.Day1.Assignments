package org.bank;

public class Students {
	public void getStudentInfo(String id) {
		System.out.println("The id of the stsudent is: " +id);
		
	}
	
	public void getStudentInfo(String id, String name) {
		System.out.println("The id of the stsudent is: " +id+" and name is: "+name);
	}
	
	public void getStudentInfo(String email, int phonenumber) {
		System.out.println("The email of the stsudent is: " +email+" and phonenumber is: "+phonenumber);
	}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo("203678");
		info.getStudentInfo("67890", "Nithya");
		info.getStudentInfo("123@gmail.com", 1234567890);
	}

}
