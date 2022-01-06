package Class20.HW;

public class CreditCard {
    double balance;
    double interest;

    CreditCard (double balance) {
        this.balance = balance;
    }
    void calculate () {
        interest = balance*0.15;
        System.out.println(interest);
        System.out.println(balance);
    }
} class Visa extends CreditCard {
    Visa(double balance) {
        super(balance);
    }

    @Override
    void calculate () {
        interest = balance*0.05;
        System.out.println(interest);
    }
    static class AX extends CreditCard {
    AX(double balance) {
        super(balance);
    }

    }

    public static void main(String[] args) {
        CreditCard cc = new CreditCard(100);
        cc.calculate();
        Visa visa = new Visa(200);
        visa.calculate();
        AX ax = new AX(300);
        ax.calculate();
    }
}
