public class problem2 {
    public static  void main(String[] args) {

        //Create another array holds 10 positions, give each index
        //a random value between 1 and 100, then find the average
        //of all the values in the array

        // Hold 10 positions, define total and average variables
        int[] integers = new int[11];
        double total = 0;
        double average = total/10;

        // Count 10 positions, stop after 10th
        for(int i = 1; i < 11; i++) {
            integers[i] = i * 2;
            if (i == 11) {
                break; }

            // Generate random integer from 1-100
            int rand = (int) ((Math.random() * 100) + 1);

            // Determine average value
            total = total + rand;
            average = total/i;


            System.out.println("#" + i + "\tValue: " + rand);

        }
        System.out.println("------------------");
        System.out.println("Average value: " + average);
    }

}
