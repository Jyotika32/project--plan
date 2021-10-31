public class DogRunner {
    public static void main(String[] args) {

        int s = 27;

        String n = "Fido";

        Dog meraKutta = new Dog(n, s);

        meraKutta.bark(8);

        meraKutta.play();

        System.out.println(meraKutta.name);

    }

}
