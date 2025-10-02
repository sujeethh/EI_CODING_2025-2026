package creational.factory;
interface Animal{String speak();}class Dog implements Animal{public String speak(){return "Woof";}}class Cat implements Animal{public String speak(){return "Meow";}}
class AnimalFactory{public static Animal create(String t){if("dog".equalsIgnoreCase(t))return new Dog();if("cat".equalsIgnoreCase(t))return new Cat();throw new IllegalArgumentException("Unknown");}}
public class FactoryDemo{public static void run(){Animal a1=AnimalFactory.create("dog");Animal a2=AnimalFactory.create("cat");System.out.println("Dog:"+a1.speak());System.out.println("Cat:"+a2.speak());}}
