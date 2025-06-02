package L02_GenericClass;

class BoxInt {
    // attributes
    private int content;

    // constructor
    public BoxInt(int content) {
        this.content = content;
    }
}

class BoxString {
    // attributes
    private String content;

    // constructor
    public BoxString(String content) {
        this.content = content;
    }
}

class Box<E> {
    // attributes
    private E content;

    // constructor
    public Box(E content) {
        this.content = content;
    }
}

class Dog {
    // attributes
    private String name;

    // constructor
    public Dog(String name) {
        this.name = name;
    }
}

public class GenericClassExample {
    public static void main ( String[] args ) {
        BoxInt b1 = new BoxInt(2025);
        BoxString b2 = new BoxString("hello");

        Box<Integer> b3 = new Box<>(2025); // <Integer>
        Box<String> b4 = new Box<>("hello"); // <String>

        Dog d1 = new Dog("Fido");
        Box<Dog> b5 = new Box<>(d1); // <Dog>
    }
}
