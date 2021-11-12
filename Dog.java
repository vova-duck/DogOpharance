package HomeWork122;



public class Dog<COUNT> {
    public static int COUNT;
    private String name;
    private int age;
    private int weight;
    private String breed;
    public Dog(){

    }


    public Dog (String name, int age, int weight, String breed){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        COUNT++;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String toString(){
        return "name of dog is " + this.name + " its age " + age + "its weight" + weight + " its breed" + this.breed;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        return   this.age==dog.age&&this.weight== dog.weight;

    }
    public static void printNumberOfDogs(){
        System.out.println(" we have " + COUNT + " dogs");
    }
}
