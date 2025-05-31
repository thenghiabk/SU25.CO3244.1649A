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
}

class LightTestDrive {
    public static void main ( String[] args ) {
        Light light1 = new Light();
        light1.setName("Bedroom");
        light1.setBrightness(50);
        light1.turnOn();
    }
}