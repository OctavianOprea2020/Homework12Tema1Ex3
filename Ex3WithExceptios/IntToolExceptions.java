package Ex3WithExceptions;

public class IntToolExceptions {
    int number;

    public IntToolExceptions(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int digitSum() throws Exception {
        if (number < 0 ) {
            throw new Exception("Exceptie: Numarul " + number + " este negativ!");
        }

        if (number > Integer.MAX_VALUE) {
            throw new Exception("Exceptie: Numarul " + number + " este prea mare!");
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

    public String lastDigit() throws Exception {
        if (number < 0 ) {
            throw new Exception("Exceptie: Numarul " + number  + " este negativ!");
        }

        if (number > Integer.MAX_VALUE) {
            throw new Exception("Exceptie: Numarul " + number + " este prea mare!");
        }

        if (0 <= number && number < 10) {
            return Integer.toString(number);
        }

        String sNumber = Integer.toString(number);
        return sNumber.substring(sNumber.length() - 1, sNumber.length());
    }

    public int digitAt(int index) throws Exception {
        if (number < 0 ) {
            throw new Exception("Exceptie: Numarul " + number + " este negativ!");
        }

        if (number > Integer.MAX_VALUE) {
            throw new Exception("Exceptie: Numarul " + number + " este prea mare!");
        }

        if (index < 0) {
            throw new Exception("Exceptie: Indexul " + index + " este negativ!");
        }

        if (0 <= number && number < 10 && index > 0) {
            throw new Exception("Exceptie: Indexul " + index + " este in afara limitelor!");
        }

        String sNumber = Integer.toString(number);
        if (index >= sNumber.length()) {
            throw new Exception("Exceptie: Indexul " + index + " este prea mare!");
        }

        return Integer.parseInt(sNumber.substring(index, index + 1));
    }
}
