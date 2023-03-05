public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 100 ir's number literal (just value)
        System.out.println(10000000);

        // variable:
        // holder for data
        // needs good name e.g. myDaughterAge
        // needs type of variable
        // that data type limit possible set of allowed values
        // int - integer numbers
        int myDaughterAge = 5;

        // assigning new value to variable
        myDaughterAge = 6;
        // sout + enter
        System.out.println(myDaughterAge);

        // use camel case starting ith lower letter
        // String type for words and letters
        String myName = "Natālija";
        String mySurname = "Samohvala";
        System.out.println(myName+" "+mySurname);

        String five = "5";
        String otherFive = "5";
        System.out.println(five+otherFive);

        //true and false
        boolean trueValue = true;
        trueValue = false;

        System.out.println(trueValue);

        //11.0
        int eleven = 11;

        //double type for number with fraction part
        double trueEleven = 11.0;

        //Exercise 7 - apples
        int HoneyCrisp = 1;
        double trueHoneyCrisp = 1.02;
        int GrannySmith = 1;
        double trueGrannySmith = 1.25;
        int Gala = 1;
        double trueGala = 1.30;
        int RedDelicious = 1;
        double trueRedDelicious = 1.45;

        // sum - returns sum of numbers
        System.out.println("SUM");
        System.out.println(trueHoneyCrisp+trueGrannySmith+trueGala+trueRedDelicious);

        //difference - the result of one of the important mathematical operations, which is obtained by subtracting two numbers.
        System.out.println("DIFFERENCE");
        System.out.println(trueRedDelicious-trueGala);

        //product - the result of two or more numbers when multiplied together
        System.out.println("PRODUCT");
        System.out.println(trueGrannySmith*trueHoneyCrisp);










    }
}