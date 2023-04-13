public class Animal {
    protected String colour;
    protected int age;

    public Animal(String colour, int age){
        this.colour = colour;
        this.age = age;
    }

    public Animal(){
        this.colour = "";
        this.age = 1;
    }

    public String getColour(){
        return this.colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isOld(){
        return age > 10;
    }
    
    public void doubleTheAge(){
        this.age = this.age * 2;
    }
}
