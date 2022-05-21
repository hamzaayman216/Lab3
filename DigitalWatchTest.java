import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class digital_watchTest {
    @Test
    void test1() {
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
    }
    @Test
    public void test2(){
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
    }
    @Test
    public void test3(){
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
        assertEquals("Turned off",d.turnOff());
    }
    @Test
    public void test4(){
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
    }
    @Test
    public void test5(){
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        assertEquals("Wait for timer to end",d.doSomething());
    }
    @Test
    public void test6(){
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.timer_state = false;
        assertEquals("Accepted",d.doSomething());
    }
    @Test
    public void test7(){
        DigitalWatch d = new DigitalWatch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.timer_state = false;
        assertEquals("Accepted",d.doSomething());
        assertEquals("Turned off",d.turnOff());
    }
}
