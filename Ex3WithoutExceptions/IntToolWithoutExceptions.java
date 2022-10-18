package Ex3WithoutExceptions;

public class IntToolWithoutExceptions {
    int number;

    public IntToolWithoutExceptions(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int digitSum() {
        if (number < 0 || number > Integer.MAX_VALUE) {
            return -1;
        }

        if (0 <= number && number < 10) {
            return number;
        }

        int sum = 0;
        int nr = number;

        while (nr > 0) {
            sum += nr % 10;
            nr /= 10;
        }

        return sum;
    }

    public String lastDigit() {
        if (number < 0 || number > Integer.MAX_VALUE) {
            return "";
        }

        if (0 <= number && number < 10) {
            return Integer.toString(number);
        }

        String sNumber = Integer.toString(number);
        return sNumber.substring(sNumber.length() - 1, sNumber.length());
    }

    public int digitAt(int index) {
        if (number < 0 || number > Integer.MAX_VALUE) {
            return -1;
        }

        if (index < 0) {
            return -1;
        }

        if (0 <= number && number < 10 && index > 0) {
            return -1;
        }

        String sNumber = Integer.toString(number);
        if (index >= sNumber.length()) {
            return -1;
        }

        return Integer.parseInt(sNumber.substring(index, index + 1));
    }
}
