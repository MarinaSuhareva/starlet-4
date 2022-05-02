public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15810;
        int miles = service.calculate(price);

        System.out.println("Ваш бонус (в милях) от покупки составил:");
        System.out.println(miles);
        System.out.println("Счастливого полета!");
    }
}
