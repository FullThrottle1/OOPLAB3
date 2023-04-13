public class Dog extends Animal {
    private String breed;

    public Dog(String colour, int age, String breed){
        super(colour, age);
        this.breed = breed;
    }

    public Dog(){
        super();
        this.breed = "";
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
}
 