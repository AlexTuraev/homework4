public class Main {
    public static void main(String[] args) {
        // ------------ Task-1 Homework-4 ------------
        System.out.println("------------ Task-1 Homework-4 ------------");
        int i=1;
        while (i<11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i=10; i>0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ------------ Task-2 Homework-4 ------------
        System.out.println("------------ Task-2 Homework-4 ------------");
        int dateFriday = 2; // first friday
        for (; dateFriday <= 31; dateFriday += 7) {
            System.out.println("Today is friday, the " + dateFriday + "nd. You have to make a report");
        }

        // ------------ Task-3 Homework-4 ------------
        System.out.println("\n------------ Task-3 Homework-4 ------------");
        int startTracking = 2022 - 200; // точка отсчета за 200 лет от тек-го года
        int n = startTracking/79;

        int year = 79 * n;
        if (year >= startTracking){
            System.out.println("Year: " + year);
        }

        do {
            year += 79;
            System.out.println("Year: " + year);
        } while (year <= 2022);
    }
}