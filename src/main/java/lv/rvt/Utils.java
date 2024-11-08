package lv.rvt;

public class NumberRange {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skaitļus (-1, lai beigtu):");
        while (true) {
            double number = scanner.nextDouble();
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        System.out.print("No kura indeksa? ");
        int startIndex = scanner.nextInt();
        System.out.print("Līdz kuram indeksam? ");
        int endIndex = scanner.nextInt();

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numbers.get(i));
        }

        scanner.close();
    }
}
