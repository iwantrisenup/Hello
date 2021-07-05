import InterfaceTest.InterfaceCTest;
import InterfaceTest.InterfaceDTest;
//import extendsTest.Animal;

public class App
{
    public static void main(String[] args)
    {
//      1.extendsTest.Animal extend问题
//        Animal baobao = new Animal("tt",7);
//        baobao.eat();
//        baobao.introduction();
//        baobao.sleep();

        System.out.println("-------------------------------------");

        //2.implements
        InterfaceDTest IT = new InterfaceCTest();
        IT.eat();
//        IT.show();
//        IT.sleep();

    }
}