import java.util.Arrays;
import java.util.Random;

public class HW2_1 {

    static Random random;

    public static void reverseArray() {
        int[] array = {0, 0, 0, 0, 1, 1, 1, 1};
        System.out.println("Оригинальный массив");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println("Зеркальный массив");
        System.out.println(Arrays.toString(array));
    }

    public static void progressiveArray(){
        int[] progress = new int[8];
        for (int i = 0; i < progress.length -1 ; i++) {
            progress[i + 1] = progress[i] + 3;
        }
        System.out.println(Arrays.toString(progress));
    }

    public static void multiplicateArray() {
        int[] startArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Оригинальный массив");
        System.out.println(Arrays.toString(startArray));
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] < 6) {
                startArray[i] = startArray[i] * 6;
            }
        }
        System.out.println("Преобразованный массив");
        System.out.println(Arrays.toString(startArray));
    }

    public static void diagonalArray(){
        int[][] sqwer = new int[4][4];
        for (int i = 0; i <sqwer.length ; i++) {
            for (int j = 0; j <sqwer.length ; j++) {
                if (i == j || i + 1 == sqwer.length - j){
                    sqwer[i][j] = 1;
                }
                System.out.printf("%4d", sqwer[i][j]);
            }
            System.out.println();
        }
    }

    public static void minMaxArray() {
        random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(15);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальное значение в массиве является: " + max);
        System.out.println("Минимальное значение в массиве является: " + min);
    }

        public static void shiftArray(int Shift) {
            int[] arr = {1, 2, 3, 4, 5}; //делаю такой массив специально, для отслеживания корректности выполнения кода. Можно сделат Random и размер массива назначаль через console
            System.out.println("Исходный массив");
            System.out.println(Arrays.toString(arr));
            int s = Shift;
            if (s > 0) {
                for (int n = 0; n < s; n++) {
                    // убираем первый элемент в буфер, а на его место ставим хвостовой элемент
                    int buffer = arr[0];
                    int[] myArray = new int[1];
                    myArray[0] = arr[arr.length - 1];

                    // циклично сдвигаем весь массив
                    for (int j = 1; j < arr.length - 1; j++) {
                        arr[arr.length - j] = arr[arr.length - j - 1];
                    }
                    arr[0] = myArray[0];
                    // ставим буферный элемент в 1 ячейку
                    arr[1] = buffer;
                }
            }
            else if (s < 0) {
                for (int n = 0; n > s; n--) {
                    // убираем последний  элемент в буфер, а на его место ставим первый элемент
                    int buffer = arr[arr.length - 1];
                    int[] myArray = new int[1];
                    myArray[0] = arr[0];

                    // циклично сдвигаем весь массив
                    for (int j = 1; j < arr.length - 1; j++) {
                        arr[j - 1] = arr[j];
                    }
                    arr[arr.length - 1] = myArray[0];
                    // ставим буферный элемент в 1 ячейку
                    arr[arr.length-2] = buffer;
                }
            }
            System.out.println("Смещенный массив");
            System.out.println(Arrays.toString(arr));
        }



    public static void main(String[] args) {
        System.out.println("Задача 1");
    reverseArray();
        System.out.println("Задача 2");
    progressiveArray();
        System.out.println("Задача 3");
    multiplicateArray();
        System.out.println("Задача 4");
    diagonalArray();
        System.out.println("Задача 5");
    minMaxArray();
        System.out.println("Задача 7");
    shiftArray(2);
    }
}
// Вполне позможно работа тапорная, но мы еще не волшебники.