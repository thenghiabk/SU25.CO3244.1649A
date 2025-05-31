package L01_JavaReview.OOPPrinciples;

public class Light {
    // attributes
    private String name;
    private boolean isOn;
    private int brightness;

    // constructor
    public Light() {
        this.name = "Light";
        this.isOn = false;
        this.brightness = 50;
    }

    public Light(String name, int brightness, boolean isOn) {
        setName( name );
        setBrightness( brightness );
        if (isOn) {
            turnOn();
        } else {
            turnOff();
        }
    }

    // methods
    public void turnOn() {
        isOn = true;
    }


    public void turnOff() {
        isOn = false;
    }

    public void setName(String name){
        this.name = name.toUpperCase();
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

class AutoLight{
    // attributes
    private String name;
    private boolean isOn;
    private int brightness;
    private int timer;

    // constructor
    public AutoLight() {
        this.name = "Light";
        this.isOn = false;
        this.brightness = 50;
        this.timer = 30;
    }

    public AutoLight(String name, int brightness, int timer, boolean isOn) {
        setName( name );
        setBrightness( brightness );
        setTimer( timer );
        if (isOn) {
            turnOn();
        } else {
            turnOff();
        }
    }

    // methods
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setName(String name){
        this.name = name.toUpperCase();
    }

    public void setBrightness(int brightness){
        if (brightness > 0 && brightness <= 100) {
            this.brightness = brightness;
        }
    }

    public void setTimer(int timer){
        this.timer = timer;
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

        Light light2 = new Light("Bathroom", 75, false);
        light2.displayInfo(); // prints "Bathroom is off with brightness 75%"

        AutoLight autoLight1 = new AutoLight();
        autoLight1.setName("Livingroom");
        autoLight1.setBrightness(50);
        autoLight1.setTimer(30);
        autoLight1.turnOn();

        AutoLight autoLight2 = new AutoLight("Kitchen", 75, false);
        autoLight2.displayInfo();
    }
}