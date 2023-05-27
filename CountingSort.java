import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 
            3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 
            2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4};
        countingSort(array);
    }
    
    static void countingSort(int[] array) {
        int[] count = new int[array.length];
        for (int number : array) {
            count[number]++;            
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(i + " -> " + count[i]);
            }
        }
    }
}  

//  вывод в строку (2-я реализация)

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 
            3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 
            2, 1, 3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4};
        int k = 50;
        countingSort(array, k);
    }
    
    static void countingSort(int[] array, int k) {
        int[] count = new int[k + 1];
        for (int number : array) {
            count[number]++;
            
        }
        int z = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[z] = i;
                z++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}