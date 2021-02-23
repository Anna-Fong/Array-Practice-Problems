public class problem1 {
    public static  void main(String[] args) {

        //Create an array that holds 20 positions, give each index a
        //random value between 1-6, then use a for loop to count
        //how many 1's were randomly generated in  the array
        
        //hold 20 integers, define the variable (count) to count the number of 1's randomly generated
        int[] integers = new int[21];
        int count = 0;

            //count 20 positions, stop after the 20th
            for(int i = 1; i < 21; i++) {
                integers[i] =  i * 2;
                if(i == 21) {
                   break; }

                //generate random value between 1-6, increase count value by 1 every time random number = 1
                int rand = (int)((Math.random() * 6) + 1);
                    if (rand==1) {
                        count++;
                    }

                System.out.println("Value: " + rand + "\t(" + i + ")");
        }

        System.out.println("\nNumber of times the value 1 was randomly generated: " + count);


    }
}








