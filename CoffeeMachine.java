public class CoffeeMachine {
    public boolean power = false;
    public boolean light = false;
    public boolean busy_state = false;
    public float money;
    private final float price = 12;
    public int coffeeAmount;
    public String moneyAddition(float money) {
        if (power) {
            this.money = money;
            return "Money addition is done!";
        } else {
            return "The machine is powered off, power it on please!";
        }
    }
    public String openTheMachine() {
        if (!power) {
            power = true;
            light = true;
            return "Power is on" + "Lights are on";
        } else {
            return "Error Occurred!";
        }
    }
    public String closeTheMachine() {
        if (power) {
            light = false;
            power = false;
            return "Power is off" + "Lights are off";
        } else {
            return "Error Occurred!";
        }
    }
    public String makeTheCoffee(int coffeeAmount) {
        if (power) {
            int i = 0;
            if (money >= price) {
                while (money >= price && coffeeAmount > 0) {
                    money -= price;
                    busy_state = true;
                    coffeeAmount--;
                    i++;
                }
            }
            else{
                return "Balance is not enough!";
            }
            busy_state = false;
            return i + "Your coffee is prepared successfully";
        } else {
            return "The machine is powered off, power it on please!";
        }
    }
}
