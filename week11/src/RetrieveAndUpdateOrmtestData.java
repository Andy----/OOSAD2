/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
public class RetrieveAndUpdateOrmtestData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = OrmtestPersistentManager.instance().getSession().beginTransaction();
		try {
			Employee employee = EmployeeDAO.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			EmployeeDAO.save(employee);
			Sales sales = SalesDAO.loadSalesByQuery(null, null);
			// Update the properties of the persistent object
			SalesDAO.save(sales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		EmployeeCriteria employeeCriteria = new EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//employeeCriteria.ID.eq();
		System.out.println(employeeCriteria.uniqueEmployee());
		
		System.out.println("Retrieving Sales by SalesCriteria");
		SalesCriteria salesCriteria = new SalesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//salesCriteria.ID.eq();
		System.out.println(salesCriteria.uniqueSales());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOrmtestData retrieveAndUpdateOrmtestData = new RetrieveAndUpdateOrmtestData();
			try {
				retrieveAndUpdateOrmtestData.retrieveAndUpdateTestData();
				//retrieveAndUpdateOrmtestData.retrieveByCriteria();
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
