public class loopSquares {
    // 3, 5, 7, 9 
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; number < 100; i += 2) {
            number += i;
            System.out.println(number);
        }
    }
}

// How do you even do this while using multiplication anyway