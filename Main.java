import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первого списка: ");
        int length = sc.nextInt();
        System.out.println("Заполняем список длины ".concat(String.valueOf(length)).concat(" случайными числами от -10 до 10..."));
        ArrayList<Integer> firstArray = new ArrayList<>();
        randomEntering(firstArray, -10, 10, length);
        System.out.println("Получившийся список: ".concat(firstArray.toString()));
        System.out.println("Введите длину второго списка: ");
        length = sc.nextInt();
        System.out.println("Заполняем список длины ".concat(String.valueOf(length)).concat(" случайными числами от -10 до 10..."));
        ArrayList<Integer> secondArray = new ArrayList<>();
        randomEntering(secondArray, -10, 10, length);
        System.out.println("Получившийся список: ".concat(secondArray.toString()));
        firstArray.addAll(secondArray);
        System.out.println("Теперь просто добавим к первому списку второй методом addAll:\n".concat(firstArray.toString()));
    }

    private static void randomEntering(ArrayList<Integer> arr, int min, int max, int length) {
        max -= min;
        for (int i = 0; i < length; i++)
            arr.add(Integer.valueOf((int)(Math.random() * ++max) + min));
    }
}