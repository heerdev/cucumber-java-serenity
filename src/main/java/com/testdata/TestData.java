package com.testdata;

public class TestData {
	//testdata for admin user
	static String adminusername;
	static String adminpassword;
	static String adminemail;
	static String customerAccountName;
	static String jobname;
	
	
	public static String getJobname() {
		return jobname;
	}
	public static void setJobname(String jobname) {
		TestData.jobname = jobname;
	}
	public static String getCustomerAccountName() {
		return customerAccountName;
	}
	public static void setCustomerAccountName(String customerAccountName) {
		TestData.customerAccountName = customerAccountName;
	}
	public static String getAdminusername() {
		return adminusername;
	}
	public static void setAdminusername(String adminusername) {
		TestData.adminusername = adminusername;
	}
	public static String getAdminpassword() {
		return adminpassword;
	}
	public static void setAdminpassword(String adminpassword) {
		TestData.adminpassword = adminpassword;
	}
	public static String getAdminemail() {
		return adminemail;
	}
	public static void setAdminemail(String adminemail) {
		TestData.adminemail = adminemail;
	}
	
	

}
