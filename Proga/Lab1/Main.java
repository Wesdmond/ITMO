import java.lang.Math;
import java.util.Random;

public class Main {

    /**
     * Print Array
     * @param table Array
     */
    static void Print(double[][] table) {
        for (double[] column : table) {
            for (double row : column)
                System.out.printf(" %10.5f ", row);
            System.out.println();
        }
    }

    /**
     * searches among the elements given by the task for element n
     * @param n element you try to find
     * @return true if element in Array, else - false
     */
    static boolean Check(short n) {
        short[] conditions = {4, 6, 10, 11, 13, 14, 15};
        for (short element : conditions) {
            if (n == element)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        short[] t = new short[15 - 1];
        for (short i = 0, num = 15; i < 14; i++, num--) {
            t[i] = num;
        }

        Random obj = new Random();
        System.out.println(obj.nextFloat());
        double[] x = new double[20];
        double left = -9, right = 4;
        for (int i = 0; i < 20; ++i) {
            x[i] = Math.random()*(right-left)+left;
        }

        double[][] y = new double[14][20];
        for (int i = 0; i < y.length; ++i) {
            for (int j = 0; j < y[0].length; ++j) {
                if (t[i] == 7)
                    y[i][j] = Math.sin(
                            Math.pow(
                                    Math.pow(Math.E, x[j]) * Math.tan(x[j] + 1), Math.pow(x[j], 0.25-x[j])
                            )
                    );
                else if (Check(t[i]))
                    y[i][j] = Math.pow(
                            Math.pow(Math.asin((x[j]-2.5)/13) ,Math.pow(1 - x[j], 3)), Math.cos(Math.tan(x[j]))
                    );
                else
                    y[i][j] = Math.pow(
                            Math.pow(Math.exp(1f/4/x[j]), (2 - Math.sin(x[j]))/Math.log(Math.abs(x[j]))), 1f/3
                    );
            }
        }
        Print(y);
    }
}