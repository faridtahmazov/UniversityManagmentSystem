package Bean;

public class UniversityManagment {


    public static void system() {
        while (true) {
            MenuAppearance menuAppearance = new MenuAppearance();
            Integer system = menuAppearance.entry();
            switch (system) {
                case 0:
                    System.exit(-1);
                case 1:
                    Managment.menuTeacher();
                    break;
                case 2:
                    Managment.menuStudent();
                    break;
            }
        }
    }
}
