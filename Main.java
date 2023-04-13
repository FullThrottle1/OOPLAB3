import java.util.Random;

public class Main{
    public static void main(String[] args){
        useRandomFeature(100);
        useRandomFeature(1000);
        useRandomFeature(10000);
    }
    
    private static void useRandomFeature(int numberOfTimes){
        Random random = new Random();
        Container container = new Container(10000);
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfTimes; i++){
            int n = random.nextInt(6);
            switch (n) {
                case 0:
                    container.add(new Dog());
                    break;
                case 1:
                    container.addFirst(new Bird());
                    break;
                case 2:
                    container.insert(new Fish());
                    break;
                case 3:
                    container.remove(0);
                    break;
                case 4:
                    container.delete(0);
                    break;
                case 5:
                    container.get(0);
                    break;
            }
        }
        long elapsedTime = System.nanoTime() - startTime;
        double timeInMillis = (double) elapsedTime / 1000000;
        System.out.println("Time for "+ numberOfTimes +"=" + timeInMillis);
    }
}

    
    
    