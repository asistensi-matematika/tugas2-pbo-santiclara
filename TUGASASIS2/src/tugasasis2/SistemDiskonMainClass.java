package tugasasis2;

import java.util.Date;

/**
 *
 * @author santiclara
 */
public class SistemDiskonMainClass {
    public static void main(String[] args) {
        CustomerClass A = new CustomerClass("Amira", "Premium");
        CustomerClass B = new CustomerClass("Bella", "Gold");
        CustomerClass C = new CustomerClass("Clara", "Silver");
        CustomerClass D = new CustomerClass ("Dinda","Bukan Member");
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println(D.toString());

        VisitClass A1 = new VisitClass(A, new Date());
        VisitClass B1 = new VisitClass(B, new Date());
        VisitClass C1 = new VisitClass(C, new Date());
        VisitClass D1 = new VisitClass(D, new Date());
        
        A1.setProductExpense(982758);
        A1.setServiceExpense(98275.8);
        System.out.print(A1.toString());
        System.out.println("Total Harga= " + A1.getTotalexpense());
        
        B1.setProductExpense(982758);
        B1.setServiceExpense(98275.8);
        System.out.print(B1.toString());
        System.out.println("Total Harga= " + B1.getTotalexpense());
        
        C1.setProductExpense(982758);
        C1.setServiceExpense(98275.8);
        System.out.print(C1.toString());
        System.out.println("Total Harga= " + C1.getTotalexpense());
        
        D1.setProductExpense(982758);
        D1.setServiceExpense(98275.8);
        System.out.print(D1.toString());
        System.out.println("Total Harga= " + D1.getTotalexpense());
        
        
    }
}

