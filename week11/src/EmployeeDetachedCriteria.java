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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EmployeeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression PPS;
	public final StringExpression name;
	public final StringExpression address;
	public final IntegerExpression yearsService;
	public final IntegerExpression age;
	public final StringExpression mobile;
	
	public EmployeeDetachedCriteria() {
		super(Employee.class, EmployeeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		PPS = new StringExpression("PPS", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		yearsService = new IntegerExpression("yearsService", this.getDetachedCriteria());
		age = new IntegerExpression("age", this.getDetachedCriteria());
		mobile = new StringExpression("mobile", this.getDetachedCriteria());
	}
	
	public EmployeeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, EmployeeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		PPS = new StringExpression("PPS", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		address = new StringExpression("address", this.getDetachedCriteria());
		yearsService = new IntegerExpression("yearsService", this.getDetachedCriteria());
		age = new IntegerExpression("age", this.getDetachedCriteria());
		mobile = new StringExpression("mobile", this.getDetachedCriteria());
	}
	
	public Employee uniqueEmployee(PersistentSession session) {
		return (Employee) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Employee[] listEmployee(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Employee[]) list.toArray(new Employee[list.size()]);
	}
}

