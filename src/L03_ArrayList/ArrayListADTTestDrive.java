package L03_ArrayList;

public class ArrayListADTTestDrive {
    public static void main ( String[] args ) {
        ArrayListADT<Integer> myIntList = new ArrayListADT<>(); // <Integer>
        myIntList.add(10);
        myIntList.add(20);
        myIntList.add(30);
        myIntList.add(40);
        myIntList.add(10, 50);

        //ArrayListADT<String> myStringList = new ArrayListADT<>(); // <String>
        //myStringList.add("Hello");
        //myStringList.add("World");
    }
}
