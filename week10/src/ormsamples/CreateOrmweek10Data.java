/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmweek10Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Ormweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			for(int i = 0; i < 50; i++) {
				ormtest.Employee lormtestEmployee = ormtest.Employee.createEmployee();
				// Initialize the properties of the persistent object here
				lormtestEmployee.setName("Jim McGee"+i);
				lormtestEmployee.setAddress("12" +i+ " Fake Street");
				lormtestEmployee.setPps("938493"+i);
				lormtestEmployee.setMobile("21654324"+i);
				lormtestEmployee.save();
				
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek10Data createOrmweek10Data = new CreateOrmweek10Data();
			try {
				createOrmweek10Data.createTestData();
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
