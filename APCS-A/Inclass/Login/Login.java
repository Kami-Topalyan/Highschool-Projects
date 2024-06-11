package Login;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Login {
    public static void main(String[] args) throws IOException {
        String phase4 = "";

        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine().strip();

        String middleName = sc.nextLine().strip();

        String lastName = sc.nextLine().strip();

        String date = sc.nextLine().strip();

        File file = new File(firstName + " " + lastName + ".json");

        file.createNewFile();

        FileWriter write = new FileWriter(firstName + " " + lastName + ".json");

        String phase1 = lastName.substring(lastName.length() - 2);

        String phase2 = middleName.substring(0, 3);

        String phase3 = date.substring(2, 4);

        String unreadyPhase4 = firstName.substring(0, 3);

        for (int i = 2; i >= 0; i--) {
            phase4 += unreadyPhase4.charAt(i);

        }

        String Total = (phase1 + phase2 + phase3 + phase4).toLowerCase();
        write.write(
                "{\n\"" + Total + "\": { \n   \"First Name\": " + "\"" + firstName + "\"," + "\n    "
                        + "\"Middle Name\": "
                        + "\"" + middleName + "\"," + "\n   \"Last Name\": " + "\"" + lastName + "\","
                        + "\n    \"Birth Date\": " + "\"" + date + "\"" + "\n}\n}");
        write.close();
        System.out.println(Total);

    }
}