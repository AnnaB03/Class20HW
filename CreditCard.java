package Class20.HW;

public class CreditCard {
    double balance = 2000;
    double interest = 3.00;
    void calculate () {
        System.out.println((balance*interest)/100);
    }
} class Visa extends CreditCard {
    void calculate () {
        System.out.println((balance-interest)/100);
    }

} class AX extends CreditCard {
    void calculate () {
        System.out.println((balance+interest)/100);
    }

    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        cc.calculate();
        Visa visa = new Visa();
        visa.calculate();
        AX ax = new AX();
        ax.calculate();
    }
}
