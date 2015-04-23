/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
public class ListOrmtestData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		Employee[] employees = EmployeeDAO.listEmployeeByQuery(null, null);
		int length = Math.min(employees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sales...");
		Sales[] saleses = SalesDAO.listSalesByQuery(null, null);
		length = Math.min(saleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(saleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		EmployeeCriteria employeeCriteria = new EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//employeeCriteria.ID.eq();
		employeeCriteria.setMaxResults(ROW_COUNT);
		Employee[] employees = employeeCriteria.listEmployee();
		int length =employees== null ? 0 : Math.min(employees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(employees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
		System.out.println("Listing Sales by Criteria...");
		SalesCriteria salesCriteria = new SalesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//salesCriteria.ID.eq();
		salesCriteria.setMaxResults(ROW_COUNT);
		Sales[] saleses = salesCriteria.listSales();
		length =saleses== null ? 0 : Math.min(saleses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(saleses[i]);
		}
		System.out.println(length + " Sales record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOrmtestData listOrmtestData = new ListOrmtestData();
			try {
				listOrmtestData.listTestData();
				//listOrmtestData.listByCriteria();
			}
			finally {
				OrmtestPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
