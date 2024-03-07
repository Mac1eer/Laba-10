public class Main {
    public static void main(String[] args) {
        Dog tary = new Dog("bones", "Russia", "scent");
        Cat Mursik = new Cat("fish", "Russia", "ears");
        Horse Raf = new Horse("hay", "Russia", "hooves");
        Veterinarian person = new Veterinarian();
        System.out.println("Все животные:");
        tary.eat();
        Mursik.makeNoise();
        Raf.eat();
        System.out.println("У ветеринара: ");
        person.treatAnimal(tary);
        person.treatAnimal(Mursik);
        person.treatAnimal(Raf);
    }
}
class Animal {
    public String food;
    public String location;
    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("Животное издает звук");
    }
    public void eat() {
        System.out.println("Животное ест");
    }
    public void sleep() {
        System.out.println("Животное спит");
    }
}
class Dog extends Animal {
    String scent;
    public Dog(String food, String location, String scent){
        super(food, location);
        this.scent = scent;
    }
    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }
}
class Cat extends Animal {
    String ears;
    public Cat(String food, String location,String ears){
        super(food, location);
        this.ears = ears;
    }
    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }
    @Override
    public void eat() {
        System.out.println("Кошка ест рыбку");
    }
}
class Horse extends Animal {
    String hooves;
    public Horse(String food, String location,String hooves) {
        super(food, location);
        this.hooves = hooves;
    }
    @Override
    public void makeNoise() {
        System.out.println("Лошадь фыркает");
    }
    @Override
    public void eat() {
        System.out.println("Лошадь ест сено");
    }
}
class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.food);
        System.out.println("Местоположение: " + animal.location);
    }
}