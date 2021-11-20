package Class20.HW;

public class Degree {
    void getPrerequisite () {
        System.out.println("To get a degree you need a high school diploma");
    }
}
class Bachelors extends Degree {
    void getPrerequisites () {
        System.out.println("I have Bachelors Degree");

    }

} class Masters extends Degree {
    void getPrerequisites() {
        System.out.println("I have Masters Degree");

    }
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisites();
        Masters masters = new Masters();
        masters.getPrerequisites();



    }
}
/*Create a class 'Degree' having a method 'getPrerequisite'
that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.*/