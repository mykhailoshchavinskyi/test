
public class Main {
    public static void main(String[] args) {
        Animal spike;
        spike = new Dog();
        spike.eat();
        spike.say();
    }
}


interface Animal{
    void say();
    void eat();
}

class Dog implements Animal{

    @Override
    public void say() {
        System.out.println("WUF WUF WUF !!!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating....");
    }
}