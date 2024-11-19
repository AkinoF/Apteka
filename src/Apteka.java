import java.util.*;
public class Apteka{
    public static void main(String[] args) {
        // Массив названий лекарств
        String[] medicines = {"Парацетамол", "Аспирин", "Ибупрофен", "Цитрамон", "Но-шпа", "Анальгин"};

        // Массив для хранения цен
        int[] prices = new int[medicines.length];

        // Создание объекта Random для генерации случайных цен
        Random random = new Random();

        // Генерация случайных цен от 500 до 2000
        for (int i = 0; i < medicines.length; i++) {
            prices[i] = random.nextInt(1501) + 500; // 0-1500 + 500 = 500-2000
        }

        // Вывод результатов
        System.out.println("Цены на лекарства");
        for (int i = 0; i < medicines.length; i++) {
            System.out.println(medicines[i] + " - " + prices[i] + " руб.");
        }
    }
}

