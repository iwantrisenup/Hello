package InterfaceTest;

import InterfaceTest.InterfaceATest;
import InterfaceTest.InterfaceBTest;

public class InterfaceCTest extends InterfaceDTest implements InterfaceATest, InterfaceBTest
{
    public void eat()
    {
        System.out.println("C eating ...");
    }

    public void sleep()
    {
        System.out.println("C sleep ...");
    }

    public void show()
    {
        System.out.println("C showing ...");
    }
}
