package TaskB;

public class Student {
    private String dateOfBirth;
    private String surname;
    private String name;
    private String gender;
    private int age;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Неверный возраст");
        } else this.age = age;
    }

    public void showInfo() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(dateOfBirth);
    }
}
