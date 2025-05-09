package com.javaex.idea.vo;

public class UserVo {

	private int userId;
	private int memberId;
	private String userName;
	private String userProfileImageUrl;
	private String birthDate;
	private String phoneNumber;
	private int disabilityTypeId;
	private int isVerified;
	
	//mypage
	private int bookmarkcount;
	private String id;
	private String email;
	
	public UserVo() {
		
	};
	
	public UserVo(int userId, int memberId, String userName, String userProfileImageUrl, String birthDate,
			String phoneNumber, int disabilityTypeId, int isVerified, int bookmarkcount, String id, String email) {
		super();
		this.userId = userId;
		this.memberId = memberId;
		this.userName = userName;
		this.userProfileImageUrl = userProfileImageUrl;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.disabilityTypeId = disabilityTypeId;
		this.isVerified = isVerified;
		this.bookmarkcount = bookmarkcount;
		this.id = id;
		this.email = email;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserProfileImageUrl() {
		return userProfileImageUrl;
	}

	public void setUserProfileImageUrl(String userProfileImageUrl) {
		this.userProfileImageUrl = userProfileImageUrl;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getDisabilityTypeId() {
		return disabilityTypeId;
	}

	public void setDisabilityTypeId(int disabilityTypeId) {
		this.disabilityTypeId = disabilityTypeId;
	}

	public int getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(int isVerified) {
		this.isVerified = isVerified;
	}

	public int getBookmarkcount() {
		return bookmarkcount;
	}


	public void setBookmarkcount(int bookmarkcount) {
		this.bookmarkcount = bookmarkcount;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", memberId=" + memberId + ", userName=" + userName
				+ ", userProfileImageUrl=" + userProfileImageUrl + ", birthDate=" + birthDate + ", phoneNumber="
				+ phoneNumber + ", disabilityTypeId=" + disabilityTypeId + ", isVerified=" + isVerified
				+ ", bookmarkcount=" + bookmarkcount + ", id=" + id + ", email=" + email + "]";
	}

	
}
