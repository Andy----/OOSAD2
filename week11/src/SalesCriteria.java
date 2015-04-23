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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SalesCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression totalSales;
	public final StringExpression financialYear;
	
	public SalesCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		totalSales = new IntegerExpression("totalSales", this);
		financialYear = new StringExpression("financialYear", this);
	}
	
	public SalesCriteria(PersistentSession session) {
		this(session.createCriteria(Sales.class));
	}
	
	public SalesCriteria() throws PersistentException {
		this(OrmtestPersistentManager.instance().getSession());
	}
	
	public Sales uniqueSales() {
		return (Sales) super.uniqueResult();
	}
	
	public Sales[] listSales() {
		java.util.List list = super.list();
		return (Sales[]) list.toArray(new Sales[list.size()]);
	}
}

