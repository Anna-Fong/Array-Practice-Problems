import java.sql.SQLOutput;

public class problem3 {
    public static void main(String[] args) {

        //Take the last array you made and swap 2 different index positions

        // i switched 3 and 7

        int[] array = new int[11];
        double total = 0;
        double average = total / 10;
        System.out.println("Index: \tValue: \n------------------");

        for (int i = 1; i < 11; i++) {
            if(i == 3) {
                array[i] = (int) ((Math.random() * 100) + 1);
                System.out.println("7" + "\t\t" + array[i]);
                i++;
            } else {
                array[i] = (int) ((Math.random() * 100) + 1);
            }

            if(i == 7) {
                array[i] = (int) ((Math.random() * 100) + 1);
                System.out.println("3" + "\t\t" + array[i]);
                i++;
            } else {
                array[i] = (int) ((Math.random() * 100) + 1);
            }

            if (i == 11) {
                    break;
            }
            System.out.println(i + "\t\t" + array[i]);

            total = total + array[i];
            average = total / 10;
        }
        System.out.println("------------------");
        System.out.println("Average value: " + average);

    }
}
