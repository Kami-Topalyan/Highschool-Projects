public class numeric {
          public static void main(String[] args) {
                    byte newByte = 127;
                    short newShort = 432;
                    int newInt = 423423;
                    long newLong = 948324623;
                    
                    double newDouble = 1;
                    double secondInt = 1;
                    double newerDouble = 1;
                    
                    newByte += 1; // Because we add 1 to the Byte varible it overflows resulting in -128 (very cool)

                    newShort *= newByte;
                    newInt *= newShort;
                    newLong *= newInt;
                    
                    newDouble = (newerDouble * (5.6 + 7.2));

                    secondInt = (int) (newerDouble * (5.6 + 7.8));

                    System.out.println();
                    System.out.println("Byte value is: " + newByte);
                    System.out.println();
                    System.out.println("Short value is: " + newShort);
                    System.out.println();
                    System.out.println("Int value is: " + newInt);
                    System.out.println();
                    System.out.println("Long value is: " + newLong);
                    System.out.println();
                    System.out.println("Second int value is: " + newDouble);
                    System.out.println();
                    System.out.println("Second double value if it was an int: " + secondInt);
          }
}
