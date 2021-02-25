public class problem4 {
    public static void main(String[] args) {

        // Take the last array you made and completely reverse the order of the array

        int[] array = new int[11];
        double total = 0;
        double average = total / 10;

        System.out.println("Index: \tValue: \n------------------");

        for (int i = 10; i > 0; i--) {
            array[i] = (int) ((Math.random() * 100) + 1);
            if (i == 0) {
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
