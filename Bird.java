public class Bird extends Animal{
    private int wingspan;

    public Bird(String colour, int age, int wingspan){
        super(colour, age);
        this.wingspan = wingspan;
    }

    public Bird(){
        super();
        this.wingspan = 10;
    }

    public int getWingspan(){
        return this.wingspan;
    }

    public void setWingspan(int wingspan){
        this.wingspan = wingspan;
    }
}
