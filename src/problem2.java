public class problem2 {
    public static  void main(String[] args) {

        //Create another array holds 10 positions, give each index
        //a random value between 1 and 100, then find the average
        //of all the values in the array

        int[] integers = new int[11];
        double total = 0;
        double average = total/10;

        System.out.println("Index: \tValue: \n------------------");
        for(int i = 1; i < 11; i++) {
            int rand = (int) ((Math.random() * 100) + 1);
            if (i == 11) {
                break; }

            total = total + rand;
            average = total/10;

            System.out.println(i + "\t\t" + rand);
        }
        System.out.println("------------------");
        System.out.println("Average value: " + average);


    }
}
