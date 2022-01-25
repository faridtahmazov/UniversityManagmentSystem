package Model;

public class Person {
    private String name;
    private String surname;
    private String gender;
    private Integer age;

    public Person(String name, String surname, String gender, Integer age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public Person(){

    }


    //Getter-Setter Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Getter-Setter Surname
    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    ////Getter-Setter Gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    ////Getter-Setter Age
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }




}
