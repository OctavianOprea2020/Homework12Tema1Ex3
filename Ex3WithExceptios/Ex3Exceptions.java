package Ex3WithExceptions;

public class Ex3Exceptions {

    public static void main(String[] args) throws Exception {
        int[] myIntArray = {4321, -100, 0, 9, 10001, 987654321, 1234, 7777, Integer.MAX_VALUE, -9875, Integer.MAX_VALUE +10};
        IntToolExceptions intToolExceptions = new IntToolExceptions(0);
        String sNumber = "";
        int testIndex = 5;

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Nr. este: " + myIntArray[i]);
            intToolExceptions.setNumber(myIntArray[i]);

            try {
                System.out.printf("Suma cifrelor nr. %d este %d", intToolExceptions.getNumber(), intToolExceptions.digitSum());
                System.out.println();

                System.out.printf("Ultima cifra a nr. %d este %s", intToolExceptions.getNumber(), intToolExceptions.lastDigit());
                System.out.println();

                // Try index 5 din numar
                testIndex = 5;
                System.out.printf("Cifra de pe pozitia %d a nr. %d este %s", testIndex, intToolExceptions.getNumber(), intToolExceptions.digitAt(testIndex));
                System.out.println();

                sNumber = Integer.toString(myIntArray[i]);
                for (int j = 0; j < sNumber.length(); j++) {
                    System.out.printf("Cifra de pe pozitia %d a nr. %d este %s", j, intToolExceptions.getNumber(), intToolExceptions.digitAt(j));
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }
    }
}
