package week1;
public class Merey {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print("Arman\n");
        System.out.println("Arman");

        int lives = 9;
        String name = "Merey";
        boolean isSoska = true;
        double gpa = 4.0;

        System.out.println("Armanu pohui, on vse ravno lyubit");

        String ternaryMessage = isSoska ? "Arman loves you" : "Armanu pohui, on vse ravno lyubit";
        
        int favouriteNumber = 0;
        for(int i = 0; i < 228; i++) {
            favouriteNumber = favouriteNumber + 1;
        }
        int count = 0;

        while(isSoska) {
            if(count == 10) { 
                System.out.println("Stop, please");
                isSoska = false;
                break;
            }
            count++;
            System.out.println("Arman's complement");
        }
        // ajkdlfnkfa,fa
        
        System.out.println(favouriteNumber);
    }
}