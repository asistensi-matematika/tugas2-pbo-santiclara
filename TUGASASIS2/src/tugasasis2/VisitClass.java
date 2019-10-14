package tugasasis2;

import java.util.Date;

/**
 *
 * @author santiclara
 */
public class VisitClass {
    private CustomerClass name;
    private Date date;
    private double serviceexpense;
    private double productexpense;
    private double totalexpense;
    
    public VisitClass(CustomerClass name,Date date){
        this.name=name;
        this.date=date;
    }
    public String getName(){
        return name.getName();
    }
     public String getCustomerName() {
        return name.getName();
    }

    public double getServiceexpense() {
        return serviceexpense;
    }

    public void setServiceExpense(double serviceexpense) {
        this.serviceexpense = serviceexpense;
    }

    public double getProductexpense() {
        return productexpense;
    }

    public void setProductExpense(double productexpense) {
        this.productexpense = productexpense;
    }
    public double getTotalexpense(){
        return  (serviceexpense - (serviceexpense * DiscountRateClass.getServiceexpense(name.getMemberType()))) +
                (productexpense - (productexpense * DiscountRateClass.getProductexpense()));
    }
    public double setTotalexpense(){
        this.totalexpense = (serviceexpense - (serviceexpense * DiscountRateClass.getServiceexpense(name.getMemberType()))) +
                (productexpense - (productexpense * DiscountRateClass.getProductExpense(name.getMemberType())));
        return 0;
    }
    
    @Override
    public String toString() {
        return  "Nama= " + name.getName() + " Tanggal Beli= " + date;
    }
  }


