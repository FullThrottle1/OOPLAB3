import java.util.Random;

public class Main{
    public static void main(String[] args){
        useRandomFeature();
    }
    
    private static void useRandomFeature(){
        Random random = new Random();
        int n = random.nextInt(6);
        switch (n) {
            case 0:
                System.out.println("---Add to the end method:");
                getAddTime(100);
                getAddTime(1000);
                getAddTime(10000);
                break;
            case 1:
                System.out.println("---AddFirst method");
                getAddFirstTime(100);
                getAddFirstTime(1000);
                getAddFirstTime(10000);
                break;
            case 2:
                System.out.println("---Insert method");
                getInsertTime(100);
                getInsertTime(1000);
                getInsertTime(10000);
                break;
            case 3:
                System.out.println("---Remove method");
                getRemoveTime(100);
                getRemoveTime(1000);
                getRemoveTime(10000);
                break;
            case 4:
                System.out.println("---Delete method");
                getDeleteTime(100);
                getDeleteTime(1000);
                getDeleteTime(10000);
                break;
            case 5:
                System.out.println("---Change age method");
                getChangeTime(100);
                getChangeTime(1000);
                getChangeTime(10000);
                break;
            default:
                break;
        }
    }

    private static void addManyTimes(int numberOfIterations, Container storage){
        for (int i = 0; i < numberOfIterations; i++){
            if (i % 3 == 0) {
                storage.add(new Dog("green", i + 3, "stray"));
            } else if (i % 4 == 0) {
                storage.add(new Fish("blue", i, true));
            } else {
                storage.add(new Bird("red", i, i * 10));
            }
        }
    }

    private static void getAddTime(int numberOfIterations){
        Container a = new Container();

        long startTime = System.nanoTime();
        addManyTimes(numberOfIterations, a);
        long elapsedTime = System.nanoTime() - startTime;
        double timeInMillis = (double)elapsedTime / 1000000;
        System.out.println("Time for "+ numberOfIterations + " = " + timeInMillis);
    }

    private static void addFirstManyTimes(int numberOfIterations, Container storage){
        for (int i = 0; i < numberOfIterations; i++){
            if (i % 3 == 0) {
                storage.addFirst(new Dog("green", i + 3, "stray"));
            } else if (i % 4 == 0) {
                storage.addFirst(new Fish("blue", i, true));
            } else {
                storage.addFirst(new Bird("red", i, i * 10));
            }
        }
    }

    private static void getAddFirstTime(int numberOfIterations){
        Container a = new Container();

        long startTime = System.nanoTime();
        addFirstManyTimes(numberOfIterations, a);
        long elapsedTime = System.nanoTime() - startTime;
        double timeInMillis = (double)elapsedTime / 1000000;
        System.out.println("Time for "+ numberOfIterations + " = " + timeInMillis);
    }

    private static void insertManyTimes(int numberOfIterations, Container storage){
        for (int i = 0; i < numberOfIterations; i++){
            if (i % 3 == 0) {
                storage.insert(new Dog("green", i + 3, "stray"));
            } else if (i % 4 == 0) {
                storage.insert(new Fish("blue", i, true));
            } else {
                storage.insert(new Bird("red", i, i * 10));
            }
        }
    }

    private static void getInsertTime(int numberOfIterations){
        Container a = new Container();

        long startTime = System.nanoTime();
        insertManyTimes(numberOfIterations, a);
        long elapsedTime = System.nanoTime() - startTime;
        double timeInMillis = (double)elapsedTime / 1000000;
        System.out.println("Time for "+ numberOfIterations + " = " + timeInMillis);
    }

    private static void removeManyTimes(int numberOfTimes){
        Container a = new Container(numberOfTimes);
        while (!a.isEmpty()) {
            a.remove(0);   
        }
    }

    private static void getRemoveTime(int numberOfIterations){
        long startTime = System.nanoTime();
        removeManyTimes(numberOfIterations);
        long elapsedTime = System.nanoTime() - startTime;
        double timeInMillis = (double)elapsedTime / 1000000;
        System.out.println("Time for "+ numberOfIterations + " = " + timeInMillis);
    }

    private static void deleteManyTimes(int numberOfTimes){
        Container a = new Container(numberOfTimes);

        for (int i = 0; i < a.size(); i++) {
            a.delete(i);
        }
    }

    private static void getDeleteTime(int numberOfIterations){
        long startTime = System.nanoTime();
        deleteManyTimes(numberOfIterations);
        long elapsedTime = System.nanoTime() - startTime;
        double timeInMillis = (double)elapsedTime / 1000000;
        System.out.println("Time for "+ numberOfIterations + " = " + timeInMillis);
    }
    
    private static void changeAgeManyTimes(int numberOfObjects){
        Container storage = new Container();
        addManyTimes(numberOfObjects, storage);
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i) instanceof Dog) {
                ((Dog)storage.get(i)).doubleTheAge();
            } else if (storage.get(i) instanceof Fish) {
                ((Fish)storage.get(i)).doubleTheAge();
            } else if (storage.get(i) instanceof Bird) {
                ((Bird)storage.get(i)).doubleTheAge();
            }
        }
    }
    
    private static void getChangeTime(int numberOfIterations){
        long startTime = System.nanoTime();
        changeAgeManyTimes(numberOfIterations);
        long elapsedTime = System.nanoTime() - startTime;
        double timeInMillis = (double)elapsedTime / 1000000;
        System.out.println("Time for "+ numberOfIterations + " = " + timeInMillis);
    }
}

    
    
    