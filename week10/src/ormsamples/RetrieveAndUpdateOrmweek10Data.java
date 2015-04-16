/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateOrmweek10Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Ormweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormtest.Employee lormtestEmployee = ormtest.Employee.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			lormtestEmployee.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		ormtest.EmployeeCriteria lormtestEmployeeCriteria = new ormtest.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormtestEmployeeCriteria.id.eq();
		System.out.println(lormtestEmployeeCriteria.uniqueEmployee());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOrmweek10Data retrieveAndUpdateOrmweek10Data = new RetrieveAndUpdateOrmweek10Data();
			try {
				retrieveAndUpdateOrmweek10Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateOrmweek10Data.retrieveByCriteria();
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
