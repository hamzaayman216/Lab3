import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CoffeeMachineTest {
    @Test
    public void test1() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("The machine is powered off, power it on please!", c.moneyAddition(30));
    }
    @Test
    public void test2() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power is on" + "Lights are on", c.openTheMachine());
    }
    @Test
    public void test3() {
        CoffeeMachine c = new CoffeeMachine();
        c.power = true;
        assertEquals("Error Occurred!", c.openTheMachine());
    }
    @Test
    public void test4() {
        CoffeeMachine c = new CoffeeMachine();
        c.openTheMachine();
        c.closeTheMachine();
        assertEquals("The machine is powered off, power it on please!", c.moneyAddition(30));
    }
    @Test
    public void test5() {
        CoffeeMachine c = new CoffeeMachine();
        c.openTheMachine();
        assertEquals("Money addition is done!", c.moneyAddition(30));
    }
    @Test
    public void test6() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power is on" + "Lights are on",c.openTheMachine());
        assertEquals("Money addition is done!",c.moneyAddition(30));
    }
    @Test
    public void test7(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power is on" + "Lights are on",c.openTheMachine());
        assertEquals("Money addition is done!",c.moneyAddition(30));
        assertEquals("Power is off" + "Lights are off",c.closeTheMachine());
    }
    @Test
    public void test8(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("The machine is powered off, power it on please!",c.makeTheCoffee(2));
    }
    @Test
    public void test9(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power is on" + "Lights are on",c.openTheMachine());
        assertEquals("Money addition is done!",c.moneyAddition(30));
        assertEquals(2+ "Your coffee is prepared successfully",c.makeTheCoffee(3));
    }
    @Test
    public void test10(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power is on" + "Lights are on",c.openTheMachine());
        assertEquals("Money addition is done!",c.moneyAddition(30));
        assertEquals(2+ "Your coffee is prepared successfully",c.makeTheCoffee(4));
    }
    @Test
    public void test11(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power is on" + "Lights are on",c.openTheMachine());assertEquals("Money addition is done!",c.moneyAddition(30));
        assertEquals(1+ "Your coffee is prepared successfully",c.makeTheCoffee(1));
    }
}