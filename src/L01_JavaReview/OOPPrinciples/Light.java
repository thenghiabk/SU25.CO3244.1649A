package L01_JavaReview.OOPPrinciples;

public class Light {
    // attributes
    private String name;
    private boolean isOn;
    private int brightness;

    // methods
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBrightness(int brightness){
        if (brightness > 0 && brightness <= 100) {
            this.brightness = brightness;
        }
    }

    public void displayInfo() {
        String status = this.isOn ? "on" : "off";
        System.out.println(this.name + " is " + status + " with brightness " + this.brightness + "%");
    }
}

class LightTestDrive {
    public static void main ( String[] args ) {
        Light light1 = new Light();
        light1.setName("Bedroom");
        light1.setBrightness(50);
        light1.turnOn();
        light1.displayInfo(); // prints "Bedroom is on with brightness 50%"

        Light light2 = new Light();
        light2.setName("Bathroom");
        light2.setBrightness(75);
        light2.turnOff();
        light2.displayInfo(); // prints "Bathroom is off with brightness 75%"
    }
}