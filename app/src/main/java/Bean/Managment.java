package Bean;

import util.StudentUtil;
import util.TeacherUtil;

public class Managment {
    public static Integer menuTeacher = 0, menuStudent = 0;
    public static MenuAppearance menuAppearance = new MenuAppearance();

    public static void menuTeacher(){
        menuTeacher = menuAppearance.teacherOperation();
        switch (menuTeacher) {
            case 1:
                TeacherUtil.rergistrationTeacher();
                break;
            case 2:
                TeacherUtil.showAllTeachers();
                break;
            case 3:
                TeacherUtil.findTeacherAndPrint();
                break;
            case 4:
                TeacherUtil.updateTeacher();
                break;
            case 5:
                TeacherUtil.removeTeacher();
                break;
        }
    }

    public static void menuStudent(){
        menuStudent = menuAppearance.studentOperation();
        switch (menuStudent) {
            case 1:
                StudentUtil.registrationStudent();
                break;
            case 2:
                StudentUtil.showAllStudents();
                break;
            case 3:
                StudentUtil.findStudentAndPrint();
                break;
            case 4:
                StudentUtil.updateStudents();
                break;
            case 5:
                StudentUtil.removeStudent();
                break;
        }
    }
}
