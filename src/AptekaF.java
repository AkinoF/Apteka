import java.util.*;

public class AptekaF {
    private String nazvanie;
    private List<AptekaL> lekarstva;

    public AptekaF(String nazvanie) {
        this.nazvanie = nazvanie;
        this.lekarstva = new ArrayList<>();
    }

    public void dobavitLekarstvo(AptekaL lekarstvo) {
        lekarstva.add(lekarstvo);
    }

    public String poluchitInformatsiyu() {
        StringBuilder info = new StringBuilder("Аптека: " + nazvanie + "\nЛекарства:\n");
        for (AptekaL lekarstvo : lekarstva) {
            info.append(lekarstvo.getNazvanie()).append(" - ")
                    .append(lekarstvo.getStoimost()).append(" руб.\n");
        }
        return info.toString();
    }

    public double samoeDorogoeLekarstvo() {
        double maxStoimost = 0;
        for (AptekaL lekarstvo : lekarstva) {
            if (lekarstvo.getStoimost() > maxStoimost) {
                maxStoimost = lekarstvo.getStoimost();
            }
        }
        return maxStoimost;
    }

    public double obshchayaStoimost() {
        double total = 0;
        for (AptekaL lekarstvo : lekarstva) {
            total += lekarstvo.getStoimost();
        }
        return total;
    }
}