package lv.acodemy.objects;

public class Dog extends Animals {

    public void bark() {
        System.out.println("Barking...");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating! Wuf-Wuf!");
    }
}