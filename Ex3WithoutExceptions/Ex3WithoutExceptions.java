package Ex3WithoutExceptions;

public class Ex3WithoutExceptions {

    public static void main(String[] args) {
        int[] myIntArray = {4321, -100, 0, 9, 10001, 987654321, 1234, 7777, Integer.MAX_VALUE, -9875, Integer.MAX_VALUE +10};
        IntToolWithoutExceptions intToolWithoutExceptions = new IntToolWithoutExceptions(0);
        String sNumber = "";
        int testIndex = 0;
        int digitAtTestIndex = 0;

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Nr. este: " + myIntArray[i]);

            if (myIntArray[i] < 0) {
                System.out.println("Numarul este negativ!");
            } else if (myIntArray[i] > Integer.MAX_VALUE) {
                System.out.println("Numarul este prea mare!");
            } else {
                intToolWithoutExceptions.setNumber(myIntArray[i]);

                System.out.printf("Suma cifrelor nr. %d este %d", intToolWithoutExceptions.getNumber(), intToolWithoutExceptions.digitSum());
                System.out.println();

                System.out.printf("Ultima cifra a nr. %d este %s", intToolWithoutExceptions.getNumber(), intToolWithoutExceptions.lastDigit());
                System.out.println();

                // index 5 din numar
                testIndex = 5;
                digitAtTestIndex = intToolWithoutExceptions.digitAt(testIndex);
                if (digitAtTestIndex < 0) {
                    System.out.printf("Nu exista cifra de pe pozitia %d a nr. %d", testIndex, intToolWithoutExceptions.getNumber());
                } else {
                    System.out.printf("Cifra de pe pozitia %d a nr. %d este %s", testIndex, intToolWithoutExceptions.getNumber(), intToolWithoutExceptions.digitAt(testIndex));
                }
                System.out.println();

                sNumber = Integer.toString(myIntArray[i]);
                for (int j = 0; j < sNumber.length(); j++) {
                    System.out.printf("Cifra de pe pozitia %d a nr. %d este %s", j, intToolWithoutExceptions.getNumber(), intToolWithoutExceptions.digitAt(j));
                    System.out.println();
                }
            }

            System.out.println();
        }
    }
}