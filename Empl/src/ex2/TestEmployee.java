package ex2;
import java.util.Scanner;

/**
 *
 * @author WEERASINGHE
 */
public class TestEmployee {

    public static void main(String[] args) {
        String name;
        String position;
        int department;
        int idNumber;
        int noOfEmployee;
        Department de;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Employee:");
        noOfEmployee = input.nextInt();

        Employee[] details = new Employee[noOfEmployee];

        for (int i = 0; i < noOfEmployee; i++) {

            System.out.println("Enter the Employee name:");
            name = input.next();
            System.out.println("Enter the Employee ID number:");
            idNumber = input.nextInt();

            System.out.println("Enter the Position of Employee:");
            position = input.next();
            System.out.println("Enter your department:");
            System.out.println("1. ACCOUNTING");
            System.out.println("2. ENGINEERING");
            System.out.println("3. IT");
            System.out.println("4. MARKETING");
            department = input.nextInt();

            if (department == 1) {
                de = Department.ACCOUNTING;
            } else if (department == 2) {
                de = Department.ENGINEERING;
            } else if (department == 3) {
                de = Department.IT;
            } else {
                de = Department.MARKETING;
            }

            details[i] = new Employee(name, idNumber, position, de);
        }
        
        for (int i = 0; i < noOfEmployee; i++) {
            System.out.println(details[i]);
        }
            
    }

}
