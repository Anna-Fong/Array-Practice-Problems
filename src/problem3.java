public class problem3 {
    public static void main(String[] args) {


        //Take the last array you made and swap 2 different index positions


        int[] integers = new int[11];
        double total = 0;
        double average = total / 10;


        System.out.println("Index: \tValue: \n------------------");
        for (int i = 1; i < 11; i++) {
            integers[i] = i * 2;
            if (i == 11) {
                break;
            }

            int rand = (int) ((Math.random() * 100) + 1);

            total = total + rand;
            average = total / i;


        System.out.println(rand + "\t\t" + i);

        }

        System.out.println("------------------");

        System.out.println("Average value: " + average);




    }

}
