/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
public class CreateOrmtestData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = OrmtestPersistentManager.instance().getSession().beginTransaction();
		try {
			Employee employee = EmployeeDAO.createEmployee();
			employee.setName("Jim McGee");
			employee.setPPS("HFGH54654");
			employee.setAddress("132 sdfgdfgd");
			employee.setYearsService(10);
			employee.setAge(50);
			EmployeeDAO.save(employee);

			Sales sales = SalesDAO.createSales();
			sales.setTotalSales(100);
			sales.setFinancialYear("2010");
			SalesDAO.save(sales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmtestData createOrmtestData = new CreateOrmtestData();
			try {
				createOrmtestData.createTestData();
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
