public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] array1 = {"Apple", "Banana", "Kiwi", "Berry"};
        String[] array2 = {"Red", "Yellow", "Green", "Blue"};
        int option = 1;
        concatenateStrings(array1, array2, option);
    }
    public static void concatenateStrings(String[] array1, String[] array2, int option) {
        if (array1.length != array2.length) {
            System.out.println("Arrays must be of equal length for concatenation");
            return;
        }
        String[] result = new String[array1.length];
        switch (option) {
            case 1:
                for (int i = 0; i < array1.length; i++) {
                    result[i] = array1[i] + " is " + array2[i];
                }
                break;
            default:
                System.out.println("ERROR, Invalid option");
                return;
        }
        printResult(result);
    }
    public static void printResult(String[] result) {
        System.out.print("Result: (");
        for (int i = 0; i < result.length; i++) {
            System.out.print("\"" + result[i] + "\"");
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}
