package util;

import com.faridtahmazov.studentmanagmentsystem.Config;

import Model.Student;
import Bean.Input;

public class StudentUtil {
    public static Student fillStudent(){
        String name = Input.inputRequiredString("Enter Student Name: ");
        String surname = Input.inputRequiredString("Enter Student Surname: ");
        String gender = Input.inputRequiredString("Enter Student Gender: ");
        Integer age = Input.inputRequiredInteger("Enter Student Age: ");
        String profession = Input.inputRequiredString("Enter Student Profession: ");

        Student student = new Student(profession, name, surname, gender, age);
        return student;
    }

    public static void registrationStudent(){
        int count=0;
        count = Input.inputRequiredInteger("How To Student Registration: ");
        Config.students = new Student[count];

        for (int i=0; i<count; i++){
            System.out.println(i+1 + ". Register: ");
            Config.students[i] = StudentUtil.fillStudent();
            System.out.println();

        }
        System.out.println("Registration Completed Successfully!");
        System.out.println();
    }

    public static void showAllStudents(){
        if (Config.students == null){
            System.out.println("None Students weren't register!\n");
            return;
        }
        String text = new String();
        for (int i=0; i<Config.students.length; i++){
            Student student = Config.students[i];
            text = student.getFullInfo();
            System.out.println();
            System.out.println(i+1 + ". " + text);
        }
        System.out.println();
    }

    public static void updateStudents(){
        showAllStudents();
        Integer index = Input.inputRequiredInteger("Select the index of the user you want to change ");
        Student student = Config.students[index-1];
        String character = Input.inputRequiredString("Which one do you want to change (Name, Surname, etc.):  ");
        String[] parametres = character.split(", ");
        for (int i=0; i<parametres.length; i++){
            String keyword = parametres[i];
            if (keyword.equalsIgnoreCase("name")){
                student.setName(Input.inputRequiredString("Update Student Name: "));
            }
            if (keyword.equalsIgnoreCase("surname")){
                student.setSurname(Input.inputRequiredString("Update Student Surname: "));
            }
            if (keyword.equalsIgnoreCase("gender")){
                student.setGender("Update Student Gender: ");
            }
            if (keyword.equalsIgnoreCase("age")){
                student.setAge(Input.inputRequiredInteger("Update Student Age: "));
            }
            if (keyword.equalsIgnoreCase("profession")){
                student.setProfession(Input.inputRequiredString("Update Student Profession: "));
            }else{
                System.out.println("\nUpdate Completed Fail!");
            }
        }
        System.out.println("\nUpdate Completed Successfully!\n");
    }

    public static void removeStudent(){
        showAllStudents();
        Integer index = Input.inputRequiredInteger("Which Student Remove: ");
        Student student = new Student();
        Config.students[index-1] = student.removeStudent();

        System.out.println("\nStudent Removed Successfully!\n");
    }

    public static Student[] findStudent(String keyword){
        int count = 0;
        for (int i=0; i<Config.students.length; i++){
           Student student = Config.students[i];
           if (student.getName().contains(keyword) || student.getSurname().contains(keyword) || student.getProfession().contains(keyword)){
               count++;
           }
        }

        Student[] result = new Student[count];
        int found=0;
        for (int j=0; j<Config.students.length; j++){
            Student student1 = Config.students[j];
            if (student1.getName().contains(keyword) || student1.getSurname().contains(keyword) || student1.getProfession().contains(keyword)){
                result[found] = student1;
                found++;
            }
        }
        return result;
    }

    public static void findStudentAndPrint(){
        String search = Input.inputRequiredString("Search Student: ");
        Student[] student = findStudent(search);
        for (int i=0; i<student.length; i++){
            System.out.println(i+1 + ". " + student[i].getFullInfo());
            System.out.println();
        }
    }
}
