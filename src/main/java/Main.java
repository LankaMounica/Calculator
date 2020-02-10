import Method.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n1,n2;
        String operator;
        String oprtr;
        Operations calculator = null;
        while(true) {
            System.out.println("Enter the respective input as given format(val val op)");
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            oprtr = scan.next();
            if (oprtr.equals("+"))
                calculator = new add();
            else if (oprtr.equals("-"))
                calculator = new substraction();
            else if (oprtr.equals("*"))
                calculator = new multiplication();
            else if (oprtr.equals("/"))
                calculator = new division();
            System.out.println(calculator.calculate(n1, n2));
            System.out.println("Enter y to continue to exit enter n");
            scan.nextLine();
            oprtr = scan.nextLine();
            if (oprtr.equals("y"))
                break;
        }
    }
}
