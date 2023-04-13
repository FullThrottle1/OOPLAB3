public class Fish extends Animal{
    private boolean saltwater;

    public Fish(String colour, int age, boolean saltwater){
        super(colour, age);
        this.saltwater = saltwater;
    }

    public Fish(){
        super();
        this.saltwater = true;
    }

    public boolean isSaltwater(){
        return this.saltwater;
    }

    public void setSaltwater(boolean saltwater){
        this.saltwater = saltwater;
    }
}
