package TaskA;

public class Fish {
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

    void speak() {
        System.out.println("Рыбка:" + " Кличка - " + getName() + " | Возраст - " + getAge() + " лет " + "| Порода: " + getBreed());
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
