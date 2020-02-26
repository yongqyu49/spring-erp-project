package kr.co.jhta.erp.vo;

public class Store {

	private int no;
	private String name;
	private String tel;
	private String address;
	private int employeeNo;
	private double lon; // 경도
	private double lat; // 위도

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLet(double lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "Store [no=" + no + ", name=" + name + ", address=" + address + ", employeeNo=" + employeeNo + ", tel="
				+ tel + "]";
	}

}