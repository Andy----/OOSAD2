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
public class Sales {
	public Sales() {
	}
	
	private int ID;
	
	private int totalSales;
	
	private String financialYear;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTotalSales(int value) {
		this.totalSales = value;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
	
	public void setFinancialYear(String value) {
		this.financialYear = value;
	}
	
	public String getFinancialYear() {
		return financialYear;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
