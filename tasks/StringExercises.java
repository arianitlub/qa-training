package tasks;

public class StringExercises {

    public static void main(String[] args) {
        String str1 = "Automation is the best!";
        String str2 = "Automation is the best!";

        System.out.println("CHAR AT METHOD: " + str1.charAt(0));
        System.out.println("String length: " + str1.length());

        String substr = str1.substring(0, 5);
        System.out.println("SUBSTRING: " + substr);

        System.out.println("CONTAINS: " + str1.contains("best"));
        System.out.println("EQUALS: " + str1.equals(str2));
        System.out.println("== " + (str1 == str2));

        System.out.println("REPLACE: " + str1.replace("best", "greatest"));

        String[] arr = str1.split(" ");
        System.out.println("SPLIT: " + arr[2]);

        System.out.println("TRIM: " + str1.trim());

        System.out.println("TO UPPER CASE: " + str1.toUpperCase());
        System.out.println("TO LOWER CASE: " + str1.toLowerCase());
    }
}
