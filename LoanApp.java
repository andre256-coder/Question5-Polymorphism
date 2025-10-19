/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andre.loanapp;
public class LoanApp {
    public static void main(String[] args) {
        CarLoan loan1 = new CarLoan();
        loan1.setLoanId("CL2025-001");
        loan1.setCustName("Ainebyona Moses");
        loan1.setAmount(15000000);
        loan1.setCarLien("Toyota Premio - Lien Active");

        System.out.println("Loan ID: " + loan1.getLoanId());
        System.out.println("Customer Name: " + loan1.getCustName());
        System.out.println("Loan Type: " + loan1.getLoanType());
        System.out.println("Loan Amount: UGX " + loan1.getAmount());
        System.out.println("Car Lien: " + loan1.getCarLien());
    }
}