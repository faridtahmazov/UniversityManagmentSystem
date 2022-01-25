package util;

import com.faridtahmazov.studentmanagmentsystem.Config;

import Model.Teacher;
import Bean.Input;

public class TeacherUtil {
    public static Teacher fillTeacher(){
        String name = Input.inputRequiredString("Enter Teacher Name: ");
        String surname = Input.inputRequiredString("Enter Teacher Surname: ");
        String gender = Input.inputRequiredString("Enter Teacher Gender: ");
        Integer age = Input.inputRequiredInteger("Enter Teacher Age: ");
        String subject = Input.inputRequiredString("Enter Teacher Subject: ");

        Teacher teacher = new Teacher(subject, name, surname, gender, age);
        return teacher;
    }

    public static void rergistrationTeacher(){
        int count = Input.inputRequiredInteger("How To Teacher Registration: ");
        Config.teachers = new Teacher[count];

        for (int i=0; i<count; i++){
            System.out.println(i+1 + ". Register: ");
            Config.teachers[i] = TeacherUtil.fillTeacher();
            System.out.println();
        }
        System.out.println("Registration Completed Successfully!");
        System.out.println();
    }

    public static void showAllTeachers(){
        if (Config.teachers == null){
            return;
        }
        String text = new String();
        for (int i=0; i<Config.teachers.length; i++){
            Teacher teacher = Config.teachers[i];
            text = teacher.getFullInfo();
            System.out.println();
            System.out.println(i+1 + ". " + text);
        }
        System.out.println();
    }

    public static void updateTeacher(){
        showAllTeachers();
        Integer index = Input.inputRequiredInteger("Which Teacher: ");
        Teacher teacher = Config.teachers[index-1];
        String character = Input.inputRequiredString("Which one do you want to change (Name, Surname, etc.): ");
        String[] parametres = character.split(", ");
        for (int i=0; i<parametres.length; i++){
            String keyword = parametres[i];
            if (keyword.equalsIgnoreCase("name")){
                teacher.setName(Input.inputRequiredString("Update Teacher Name: "));
            }
            else if (keyword.equalsIgnoreCase("surname")){
                teacher.setSurname(Input.inputRequiredString("Update Teacher Surname: "));
            }
            else if (keyword.equalsIgnoreCase("gender")){
                teacher.setGender(Input.inputRequiredString("Update Teacher Gender: "));
            }
            else if (keyword.equalsIgnoreCase("age")){
                teacher.setAge(Input.inputRequiredInteger("Update Teacher Age: "));
            }
            else if (keyword.equalsIgnoreCase("subject")){
                teacher.setSubject(Input.inputRequiredString("Update Teacher Subject: "));
            }else{
                System.out.println("\nUpdate To Failed!");
            }
        }
        System.out.println("\nUpdate Completed Successfully!");
    }

    public static void removeTeacher(){
        showAllTeachers();
        Integer index = Input.inputRequiredInteger("Which removed Teacher: ");
        Teacher teacher = new Teacher();
        Config.teachers[index-1] = teacher.removeTeacher();

        System.out.println("\nTeacher Removed Successfully!\n");
    }

    public static Teacher[] findTeacher(String keyword){
        int count=0;

        for (int i=0; i<Config.teachers.length; i++){
            Teacher teacher = Config.teachers[i];
            if (teacher.getName().contains(keyword) || teacher.getSubject().contains(keyword) || teacher.getSubject().contains(keyword)){
                count++;
            }
        }

        Teacher[] result = new Teacher[count];
        int found=0;
        for (int i=0; i<Config.teachers.length; i++){
            Teacher teacher = Config.teachers[i];
            if (teacher.getName().contains(keyword) || teacher.getSubject().contains(keyword) || teacher.getSubject().contains(keyword)){
                result[found] = teacher;
                found++;
            }
        }
        return result;
    }

    public static void findTeacherAndPrint(){
        String search = Input.inputRequiredString("Search Teacher: ");
        Teacher[] teachers = findTeacher(search);
        for (int i=0; i<Config.teachers.length; i++){
            System.out.println(teachers[i].getFullInfo());
        }
    }
}
