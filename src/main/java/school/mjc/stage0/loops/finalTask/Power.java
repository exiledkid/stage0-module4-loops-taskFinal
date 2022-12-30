package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {

        int sum = 1;

        for (int x = 1; x <= power; x++) {
            sum = numberToPrint * sum;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
