/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
import org.orm.*;
public class DeleteOrmtestData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = OrmtestPersistentManager.instance().getSession().beginTransaction();
		try {
			Employee employee = EmployeeDAO.loadEmployeeByQuery(null, null);
			// Delete the persistent object
			EmployeeDAO.delete(employee);
			Sales sales = SalesDAO.loadSalesByQuery(null, null);
			// Delete the persistent object
			SalesDAO.delete(sales);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOrmtestData deleteOrmtestData = new DeleteOrmtestData();
			try {
				deleteOrmtestData.deleteTestData();
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
