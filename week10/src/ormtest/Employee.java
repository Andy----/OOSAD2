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
package ormtest;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Employee {
	public Employee() {
	}
	
	public static Employee loadEmployeeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return loadEmployeeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return getEmployeeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return loadEmployeeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return getEmployeeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Employee) session.load(ormtest.Employee.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Employee) session.get(ormtest.Employee.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employee) session.load(ormtest.Employee.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee getEmployeeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Employee) session.get(ormtest.Employee.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return queryEmployee(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return queryEmployee(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return listEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return listEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormtest.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmployee(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormtest.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employee", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmployee(session, condition, orderBy);
			return (Employee[]) list.toArray(new Employee[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee[] listEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmployee(session, condition, orderBy, lockMode);
			return (Employee[]) list.toArray(new Employee[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return loadEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return loadEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Employee[] employees = listEmployeeByQuery(session, condition, orderBy);
		if (employees != null && employees.length > 0)
			return employees[0];
		else
			return null;
	}
	
	public static Employee loadEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Employee[] employees = listEmployeeByQuery(session, condition, orderBy, lockMode);
		if (employees != null && employees.length > 0)
			return employees[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return iterateEmployeeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ormtest.Ormweek10PersistentManager.instance().getSession();
			return iterateEmployeeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormtest.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmployeeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ormtest.Employee as Employee");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Employee", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Employee loadEmployeeByCriteria(EmployeeCriteria employeeCriteria) {
		Employee[] employees = listEmployeeByCriteria(employeeCriteria);
		if(employees == null || employees.length == 0) {
			return null;
		}
		return employees[0];
	}
	
	public static Employee[] listEmployeeByCriteria(EmployeeCriteria employeeCriteria) {
		return employeeCriteria.listEmployee();
	}
	
	public static Employee createEmployee() {
		return new ormtest.Employee();
	}
	
	public boolean save() throws PersistentException {
		try {
			ormtest.Ormweek10PersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			ormtest.Ormweek10PersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			ormtest.Ormweek10PersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			ormtest.Ormweek10PersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private int id;
	
	private String name;
	
	private String address;
	
	private String pps;
	
	private String mobile;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
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
	
	public void setPps(String value) {
		this.pps = value;
	}
	
	public String getPps() {
		return pps;
	}
	
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
