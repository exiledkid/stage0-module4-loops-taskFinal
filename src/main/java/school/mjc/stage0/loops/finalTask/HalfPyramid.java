package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        int num = cathetusLength;

        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j < num) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            num--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
