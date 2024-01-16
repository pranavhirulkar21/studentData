package com.pranav.dto;



public class StudentDto {
	
	   private int id;

	    private String firstName;
	    private String lastName;
//	    private Date dateOfBirth;
	    private String gender;
//	    private String address;
	    private String email;
	    private String phoneNumber;
	    
	    
		public StudentDto(int id, String firstName, String lastName, String gender, String email, String phoneNumber) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}


		public StudentDto() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
