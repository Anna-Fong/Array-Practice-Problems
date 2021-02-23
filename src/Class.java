public class Class{
    public static void main(String[] args){


        //class example

        int[] array=new int[20];
                int count=0;
                for(int i = 0;i<array.length;i++){
                    array[i]=(int)(Math.random()*6)+1;;
                    if(array[i]==1){
                        count=count+1;
                    }
                }
                System.out.println("********************");
                System.out.println(count);
            }
}
