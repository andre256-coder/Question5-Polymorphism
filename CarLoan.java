class CarLoan extends Loans {
    private String car_lien;

    public CarLoan() {
        this.amount = 0.0;
        this.loan_id = "";
        this.cust_name = "";
    }

    public void setCarLien(String car_lien) {
        this.car_lien = car_lien;
    }

    public String getCarLien() {
        return car_lien;
    }

    @Override
    public String getLoanType() {
        return "Car Loan";
    }
}