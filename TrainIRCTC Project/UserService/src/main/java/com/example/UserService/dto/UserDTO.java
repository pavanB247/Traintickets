package com.example.UserService.dto;


public class UserDTO {

    private String id;
    private String username;
    private String email;
    private String phoneNumber;
    private String fullName;
    private String gender;
    private String address;

    // Constructors
    public UserDTO() {}

    public UserDTO(String id, String username, String email, String phoneNumber, String fullName, String gender, String address) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    // Getters and Setters
    
}
