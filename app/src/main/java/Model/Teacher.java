package Model;

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject, String name, String surname, String gender, Integer age){
        super(name, surname, gender, age);
        this.subject = subject;
    }

    public Teacher(){
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFullInfo(){
        String gender = "Gender: ";
        String age = "Age: ";
        String subject = "Subject: ";
        return this.getName() + " "
                + this.getSurname() + "\n"
                + gender + this.getGender() + "\n"
                + age + this.getAge() + "\n"
                + subject + this.getSubject();
    }

    public Teacher removeTeacher(){
        return new Teacher("null", "null", "", "null", 0);
    }
}
