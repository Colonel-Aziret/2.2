package TaskA;

public class Main {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot();
        parrot1.setName("Крош");
        parrot1.setAge(5);
        parrot1.setBreed("Корелла");
        parrot1.speak();

        Parrot parrot2 = new Parrot();
        parrot2.setName("Санчо");
        parrot2.setAge(6);
        parrot2.setBreed("Какаду");
        parrot2.speak();

        Dog dog1 = new Dog();
        dog1.setName("Бобик");
        dog1.setAge(7);
        dog1.setBreed("Алабай");
        dog1.speak();

        Dog dog2 = new Dog();
        dog2.setName("Геракл");
        dog2.setAge(8);
        dog2.setBreed("Доберман");
        dog2.speak();

        Cat cat1 = new Cat();
        cat1.setName("Хэппи");
        cat1.setAge(9);
        cat1.setBreed("Мейн-Кун");
        cat1.speak();

        Cat cat2 = new Cat();
        cat2.setName("Ричи");
        cat2.setAge(10);
        cat2.setBreed("Британская");
        cat2.speak();

        Fish fish1 = new Fish();
        fish1.setName("Аврора");
        fish1.setAge(11);
        fish1.setBreed("Золотая рыбка");
        fish1.speak();

        Fish fish2 = new Fish();
        fish2.setName("Мамба");
        fish2.setAge(12);
        fish2.setBreed("Гуппи");
        fish2.speak();
    }
}

