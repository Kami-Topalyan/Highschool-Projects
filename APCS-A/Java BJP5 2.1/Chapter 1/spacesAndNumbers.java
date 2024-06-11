public class spacesAndNumbers {
    public static void main(String[] args)  {
        for(int i = 1; i <= 5; i++) {
            for(int b = 5 - i; b > 0; b--)
            System.out.print(" ");
            for(int c = 0; c < i; c++)
            System.out.print(i);
            System.out.println();
            }
        
    }
}
