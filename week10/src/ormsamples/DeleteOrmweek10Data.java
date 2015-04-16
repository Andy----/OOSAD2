/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteOrmweek10Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Ormweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.loadEmployeeByQuery(null, null);
			lormtestEmployee.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOrmweek10Data deleteOrmweek10Data = new DeleteOrmweek10Data();
			try {
				deleteOrmweek10Data.deleteTestData();
			}
			finally {
				ormtest.Ormweek10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
