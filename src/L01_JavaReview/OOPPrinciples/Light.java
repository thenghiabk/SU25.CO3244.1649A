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

class AutoLight extends Light {
    // attributes
    private int timer;

    // constructor
    public AutoLight() {
        super(); // call the parent constructor
    }

    public AutoLight(String name, int brightness, int timer, boolean isOn) {
        super( name, brightness, isOn ); // call the parent constructor
        setTimer( timer );
    }

    public void setTimer(int timer){
        this.timer = timer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Timer: " + this.timer);
    }
}

class LightTestDrive {
    public static void main ( String[] args ) {
        Light light1 = new Light();
        light1.setName("Bedroom");
        light1.setBrightness(50);
        light1.turnOn();
        //light1.displayInfo(); // prints "Bedroom is on with brightness 50%"

        Light light2 = new Light("Bathroom", 75, false);
        //light2.displayInfo(); // prints "Bathroom is off with brightness 75%"

        AutoLight light3 = new AutoLight();
        light3.setName("Livingroom");
        light3.setBrightness(50);
        light3.setTimer(30);
        light3.turnOn();

        AutoLight light4 = new AutoLight("Kitchen", 75, 15, false);
        //light4.displayInfo(); // prints "Kitchen is off with brightness 75%. Timer: 15."

        Light[] myLights = {light1, light2, light3, light4};

        for (Light l : myLights) {
            l.displayInfo();
            System.out.println("---");
        }



    }
}