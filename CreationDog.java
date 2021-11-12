package HomeWork122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class CreationDog {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
       ArrayList<Dog> dogs =  dogCreation();
       compare(dogs);
    Dog.printNumberOfDogs();

    }
    public static ArrayList<Dog> dogCreation() throws IOException {
        System.out.println("hos many dogs do you have?");
        int numberOfDogs = Integer.parseInt(reader.readLine());
        String name;
        int age;
        int weight;
        String breed;
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < numberOfDogs; i++) {
            System.out.println("type name for dog");
            name = reader.readLine();
            System.out.println("type age of dog");
            age = Integer.parseInt(reader.readLine());
            System.out.println("type weight of dog");
            weight = Integer.parseInt(reader.readLine());
            System.out.println("type dog`s breed");
            breed = reader.readLine();
            Dog dog = new Dog(name, age, weight, breed);
            dogs.add(dog);
        }
        return dogs;


    }
    public static void compare(ArrayList<Dog> dogs) {
        for (int i = 0; i < dogs.size() - 1; i++)
            for (int j = dogs.size() - 1 ; j > i ; j--) {
                if (dogs.get(i) == dogs.get(j)){
                    System.out.println("Links dog"+ (i + 1)  + " and dog" + (j + 1) + " are equal");
                }
                if (dogs.get(i).equals(dogs.get(j))){
                    System.out.println("dog`s weight and are  " + (i + 1) + "to dog" + (j + 1) + "same" );

            }

        }
    }
}
