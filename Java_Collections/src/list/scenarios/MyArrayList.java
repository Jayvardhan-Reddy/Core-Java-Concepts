package list.scenarios;

//Own Implementation of Arraylist

public class MyArrayList<E extends Object> {

    private static int initialCapacity = 5;
    private static int currentSize;
    private Object[] myArrayList = {}, temp = {};

    private static int currentIndex = 0;

    public static void main(String[] args) {
        MyArrayList arrList = new MyArrayList();
        arrList.add("123"); //add String
        arrList.printAllElements();
        arrList.add(new Integer(111)); //add Integer
        arrList.printAllElements();

        arrList.add(new Float("34.56")); //add Integer
        arrList.printAllElements();

        arrList.delete("123");
        arrList.printAllElements();

        arrList.delete(123);
        arrList.printAllElements();
        arrList.delete(123);

        arrList.printAllElements();

    }

    public MyArrayList() {  //creates default sized Array of Objects
        myArrayList = new Object[initialCapacity]; //generic expression

        /* everytime I cross my capacity, 
    I make double size of Object Array, copy all the elements from past myObject Array Object
         */
    }

    public MyArrayList(int size) { //creates custom sized Array of Objects
        myArrayList = new Object[size];
    }

    public void add(Object anyObj) {
        //add element directy
        myArrayList[currentIndex] = anyObj;
        currentSize = myArrayList.length;
        currentIndex++;
        if (currentIndex == currentSize) {
            createDoubleSizedObjectArray(currentSize);
        }
    }

    //print all elements
    public void printAllElements() {
        System.out.println("Displaying list : ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(myArrayList[i].toString()); 
        }
    }

    private void createDoubleSizedObjectArray(int currentSize) {
        temp = myArrayList.clone();
        myArrayList = new MyArrayList[2 * currentSize];  //myObject pointer big size data structure

//         myObject = temp.clone(); //probably I can do this here as well. Need to check this
        System.arraycopy(temp, 0, myArrayList, 0, currentSize);

    }

    void delete(Object object) {
        //if already empty 
        if (currentIndex == 0) {
            System.out.println("Already empty!");
            return;
        }
        //you don't need to delete anything. I can simply override the storage
        currentIndex--;
    }
}