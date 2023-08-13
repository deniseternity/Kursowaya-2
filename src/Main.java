import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] massiv = {1, 2, 4, 5, 7, 45, 34};
        int[] backMassiv = {4, 5, 7, 45, 34};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0) {
                massiv[i]++;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }
}