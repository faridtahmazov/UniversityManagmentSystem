package Model;

public class Student extends Person{
    private String profession;

    public Student(String profession, String name, String surname, String gender, Integer age) {
        super(name, surname, gender, age);
        this.profession = profession;
    }

    public Student(){
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFullInfo(){
        String name = "Name: ";
        String surname = "Surname: ";
        String gender = "Gender: ";
        String age = "Age: ";
        String profession = "Profession: ";
        return  this.getName() + " "
                + this.getSurname() + "\n"
                + gender + this.getGender() + "\n"
                + age + this.getAge() + "\n"
                + profession + this.getProfession();
    }

    public Student removeStudent(){
       return new Student("null", "null", "", "null", 0);
    }
}
