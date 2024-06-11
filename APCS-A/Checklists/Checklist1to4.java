
public class Checklist1to4 {

    void one() {
        System.out.println("Executing code 1");
        int intA = 1;
        double doubleA = 1.5;

        System.out.println((double) intA);
        System.out.println((int) doubleA);
    }

    void two() {
        System.out.println("Executing code 2");
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1--);
        System.out.println(num1 += 5);
        System.out.println(num1 %= 10);
    }

    void three() {
        // An object is an instance of a class objects have behaviors of thier classes
    }

    class Q4obj {
        public String Q5obj() {
            return ("solution 4");
        }
    }

    void Q4() {
        System.out.println("Executing code 4");
        Q4obj obj = new Q4obj();
        System.out.println(obj);
    }

    class Q5obj {
        public String Q5(String first) {
            return (first + "tion 5");
        }
    }

    void Q5() {
        System.out.println("Executing code 5");
        Q5obj obj = new Q5obj();
        System.out.println(obj.Q5("solu"));
    }

    void Q6ex(String str) {
        System.out.println(str);
    }

    void Q6() {
        System.out.println("Executing code 6");
        Q6ex("Solution 6");
    }

    void Q7ex() {
        System.out.println("Solution 7");
    }

    void Q7() {
        System.out.println("Executing code 7");
        Q7();
    }

    String Q8ex(String text) {
        return text;
    }

    void Q8() {
        System.out.println("Executing code 8");
        Q8ex("Solution 8");
    }

    String Q9ex() {
        return ("Solution9");
    }

    void Q9() {
        System.out.println("Executing code 9");
        System.out.println(Q9ex());
    }

    void Q10() {
        System.out.println("Executing code 10");
        String newStr = "Solution 10";
        System.out.println(newStr);
    }

    void Q11() {
        System.out.println("Executing code 11");
        String newStr = "Solution 11";
        System.out.println("Solution " + newStr.length());
    }

    void Q12() {
        System.out.println("Executing code 12");
        String newString = "Solution ";
        newString.concat("12");
        System.out.println(newString);
    }

    void Q13() {
        System.out.println("Executing code 13");
        String result = "Solution 13";
        String one = "Solu";
        one += "tion 13";
        if (one.equals(result)) {
            System.out.println(one);
        }
    }

    void Q14() {
        System.out.println("Executing code 14");
        int stringInt = 5;
        int stringInt2 = 10;

        System.out.println(Integer.toString(stringInt) + Integer.toString(stringInt2));
    }

    void Q15() {
        System.out.println("Executing code 15");
        String string = "Solution 1";
        int index = string.indexOf("i");
        System.out.println(string + index);
    }

    void Q16() {
        // I do no understand the question
    }

    void Q17() {
        System.out.println("Executing code 17");
        String str = "Solutiti";
        String fullStr = "Solution ";
        System.out.println(fullStr + str.length());

    }

    void Q18() {
        System.out.println("Executing code 18");
        String str = "AAASolution 18AAA";
        System.out.println(str.substring(3, 14));
    }

    void Q19() {
        System.out.println("Executing code 19");
        String str = "AAASolution 18";
        System.out.println(str.substring(3));
    }

    void Q20() {
        System.out.println("Executing code 20");
        String string = "Solution 2";
        int index = string.indexOf("S");
        System.out.println(string + index);
    }

    void Q21() {
        System.out.println("Executing code 21");
        String str1 = "Solution 21";
        String str2 = "Solution 20";
        if (!str1.equals(str2)) {
            System.out.println(str1);
        }
    }

    void Q22() {
        System.out.println("Executing code 22");
        Integer obj = Integer.valueOf(22);
        System.out.println("Solution " + obj);
    }

    void Q23() {
        System.out.println("Executing code 23");
        Double obj = Double.valueOf(23);
        System.out.println("Solution " + obj);
    }

    static void Q24ex() {
        // wow its a static
        System.out.println("Solution 24");
    }

    void Q27ex() {
        System.out.println("Executing code 24");

    }

    void Q27() {
        System.out.println("Executing code 27");
        Q27ex();
    }

    void Q28() {
        System.out.println("Executing code 28");
        double sol = Math.sqrt(784);
        System.out.println("Solution " + sol);
    }

    void Q29() {
        System.out.println("Executing code 29");
        double rand = Math.random();
        double abs = Math.abs(rand);
        double pow = Math.pow(rand, 2);
        double sqrt = Math.sqrt(rand);
        System.out.println("Solution 29");
        System.out.println(rand);
        System.out.println(abs);
        System.out.println(pow);
        System.out.println(sqrt);
    }

    void Q30Q31() {
        System.out.println("Executing code 30 and 31");
        boolean bol1 = true;
        boolean bol2 = false;
        if (bol2 != bol1) {
            System.out.println("Solution 30");
        }
    }

    void Q32() {
        System.out.println("Executing code 32");
        boolean bol1 = true;
        boolean bol2 = false;
        if (bol1) {
            if (!bol2) {
                System.out.println("Solution 32");
            }
        }
    }

    void Q33() {
        System.out.println("Executing code 33");
        boolean bol1 = true;
        boolean bol2 = false;
        boolean bol3 = true;
        if ((bol1 && bol3) || (bol2 != bol3)) {
            System.out.println("Solution 33");
        }
    }

    void Q34() {
        System.out.println("Executing code 34");
        boolean bol1 = true;
        boolean bol2 = true;
        if (!bol1 == !bol2) {
            System.out.println("Solution 34");
        }
    }

    void Q35() {
        int i = 0;
        System.out.println("Executing code 35");
        while (i < 4) {
            System.out.println("Iteration " + i);
            i++;
        }
        System.out.println("Solution 35");
    }

    void Q36() {
        System.out.println("Executing code 36");
        for (int i = 0; i < 4; i++) {
            System.out.println("Iteration " + i);
        }
        System.out.println("Solution 36");
    }

    void Q37() {
        int i = 0;
        System.out.println("Executing code 37");
        do {
            System.out.println("Iteration " + i);
            i++;
        } while (i < 4);
        System.out.println("Solution 37");
    }

    void Q38() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("J is: " + j);
            }
            System.out.println("I is: " + i);
        }
    }

    public static void main(String[] args) {
        Checklist1to4 mainObj = new Checklist1to4();
        mainObj.Q38();
    }

}
