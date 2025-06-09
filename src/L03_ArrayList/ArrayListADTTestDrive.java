package L03_ArrayList;

public class ArrayListADTTestDrive {
    public static void main ( String[] args ) {
        ArrayListADT<Integer> myIntList = new ArrayListADT<>(); // <Integer>
        myIntList.add(10);
        myIntList.add(20);
        myIntList.add(30);
        myIntList.add(40);
        myIntList.add(1, 50);
        myIntList.add(1, 60);
        myIntList.get(2); // 50
        //myIntList.get(20); // Exception
        myIntList.set(2, 70); // update the array [10, 60, 70, 20, 30, 40], returns '50'
        myIntList.remove(2);
        myIntList.remove(2);
        myIntList.remove(2);
        myIntList.remove(2);

        //ArrayListADT<String> myStringList = new ArrayListADT<>(); // <String>
        //myStringList.add("Hello");
        //myStringList.add("World");
    }
}
