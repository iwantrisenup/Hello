package extendsTest;

public class Dog extends Animal
{
    void eat() {
        super.eat();
        System.out.println("dog : eat");
    }

    void eatTest()
    {
        this.eat();
        super.eat();
    }

}