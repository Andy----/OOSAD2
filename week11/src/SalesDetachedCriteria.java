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

public class SalesDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression totalSales;
	public final StringExpression financialYear;
	
	public SalesDetachedCriteria() {
		super(Sales.class, SalesCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totalSales = new IntegerExpression("totalSales", this.getDetachedCriteria());
		financialYear = new StringExpression("financialYear", this.getDetachedCriteria());
	}
	
	public SalesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, SalesCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		totalSales = new IntegerExpression("totalSales", this.getDetachedCriteria());
		financialYear = new StringExpression("financialYear", this.getDetachedCriteria());
	}
	
	public Sales uniqueSales(PersistentSession session) {
		return (Sales) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sales[] listSales(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sales[]) list.toArray(new Sales[list.size()]);
	}
}

