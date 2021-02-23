public class problem1 {
    public static  void main(String[] args) {

        //Create an array that holds 20 positions, give each index a
        //random value between 1-6, then use a for loop to count
        //how many 1's were randomly generated in  the array
        

        int[] array = new int[21];
        int count = 0;

            for(int i = 1; i < 21; i++) {
                if(i == 21) {
                   break; }

                int rand = (int)((Math.random() * 6) + 1);
                    if (rand==1) {
                        count++;
                    }
                System.out.println("Value: " + rand);
            }

        System.out.printf("------------------");
        System.out.println("\nNumber of times the value 1 was randomly generated: " + count);


    }
}








