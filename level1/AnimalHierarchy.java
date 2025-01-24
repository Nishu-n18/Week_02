package level1;
class Animal{
    protected String name;
    protected int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("Name: " + name +" Age: "+ age +" Sound: " + "Roaring");
    }
}
class Dog extends Animal{

    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println("Name: " + name +" Age: " + age +" Sound: " + "Dog is barking");
    }
}
class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println("Name: " + name +" Age: " + age +" Sound: " + "meow");
    }
}
class Bird extends Animal{

    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Name: " + name +" Age: " + age +" Sound: " + "chirping");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal=new Animal("Sheru",10);
        Dog dog=new Dog("Rocky",5);
        Cat cat=new Cat("Pushy",3);
        Bird bird=new Bird("Sparrow",1);
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
