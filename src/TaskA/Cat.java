package TaskA;

public class Cat {
    private String name;
    private int age;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Неверный возраст");
        } else this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void speak() {
        System.out.println("Кошка:" + " Кличка - " + getName() + " | Возраст - " + getAge() + " лет " + "| Порода: " + getBreed());
    }
}
