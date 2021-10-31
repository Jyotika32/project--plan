public class Dog {

    String name;
    int size;

    Dog(String name, int size) {
        this.name = name;
        this.size = size;

    }

    void bark(int noOfTimes) {
        for (int x = 0; x < noOfTimes; x++) {
            System.out.println("Bow Bow!");
        }
    }

    void play() {
        System.out.println("I am Playing!");
    }
}
