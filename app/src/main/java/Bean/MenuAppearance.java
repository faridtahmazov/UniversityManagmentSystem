package Bean;

import java.util.Scanner;

public class MenuAppearance {
    String teacherKeyword = "Teacher";
    String studentKeyword = "Student";

    public Integer entry(){
        System.out.println("\t_____University Managment System!_____");

        System.out.print("0. Exit System" +
                "\n1. Teacher Managment System" +
                "\n2. Student Managment System" +
                "\n\nChoice System: ");

        Scanner scanner = new Scanner(System.in);
        Integer system = scanner.nextInt();

        return system;
    }

    private Integer operation(String person){
        System.out.print("\n1. Register " + person +
                "\n2. Show All " + person +
                "\n3. Find " + person +
                "\n4. Update " + person +
                "\n5. Remove " + person +
                "\n\n" + person + " Managment operation: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        return option;
    }

    public Integer teacherOperation(){
       return operation(teacherKeyword);
    }
    public Integer studentOperation(){
        return operation(studentKeyword);
    }
}


