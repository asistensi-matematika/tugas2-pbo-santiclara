package tugasasis2;

/**
 *
 * @author santiclara
 */
public class DiscountRateClass {

    static double getServiceexpense(String memberType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static double getProductexpense() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static double getProductExpense(String memberType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold = 0.15;
    private double serviceDiscountSilver = 0.1;
    private double productDiscountPremium = 0.1;
    private double productDiscountGold = 0.1;
    private double productDiscountSilver = 0.1;
    
   
    
public double getServiceDiscountrate(String tipe){
    switch(tipe) {
    case "Tipe Premium" :
        return serviceDiscountPremium;
    case "Tipe Gold" :
        return serviceDiscountGold;
    case "Tipe Silver" :
        return serviceDiscountSilver;
    default : 
        return 0;
        }
    }

public double getProductDiscountrate(String tipe){
    switch(tipe) {
    case "Tipe Premium" :
        return productDiscountPremium;
    case "Tipe Gold" :
        return productDiscountGold;
    case "Tipe Silver" :
        return productDiscountSilver;
    default : 
        return 0;    
    }
  }
}


