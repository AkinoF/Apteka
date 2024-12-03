import java.util.*;
public class Apteka {
    public static void main(String[] args) {
        AptekaF apteka = new AptekaF("Здоровье");

        // Добавление лекарств
        apteka.dobavitLekarstvo(new AptekaL("Парацетамол", 50));
        apteka.dobavitLekarstvo(new AptekaL("Ибупрофен", 75));
        apteka.dobavitLekarstvo(new AptekaL("Анальгин", 30));
        apteka.dobavitLekarstvo(new AptekaL("Аспирин", 40));
        apteka.dobavitLekarstvo(new AptekaL("Лоратадин", 100));
        apteka.dobavitLekarstvo(new AptekaL("Цетиризин", 90));

        // Получение информации об аптеке
        System.out.println(apteka.poluchitInformatsiyu());

        // Самое дорогое лекарство
        System.out.println("Стоимость самого дорогого лекарства: " + apteka.samoeDorogoeLekarstvo() + " руб.");

        // Общая стоимость всех лекарств
        System.out.println("Общая стоимость всех лекарств: " + apteka.obshchayaStoimost() + " руб.");
    }
}
//Добавить несколько аптек, для полного завершения задания.