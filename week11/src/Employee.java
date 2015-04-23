/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
public class Employee {
	public Employee() {
	}
	
	private int ID;
	
	private String PPS;
	
	private String name;
	
	private String address;
	
	private int yearsService;
	
	private int age;
	
	private String mobile;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPPS(String value) {
		this.PPS = value;
	}
	
	public String getPPS() {
		return PPS;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setYearsService(int value) {
		this.yearsService = value;
	}
	
	public int getYearsService() {
		return yearsService;
	}
	
	public void setAge(int value) {
		this.age = value;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
