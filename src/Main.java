import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[10];
        Scanner key=new Scanner(System.in);
        for(int i=0;i<10;i++){
            list[i]=(i+1);
        }

        int sum=0;
        for(int i=0;i<=9;i++){
            sum+=list[i];
        }
        System.out.println(sum);

        int[] list1=new int[10];
        int sum1=0;
        for(int i=0;i<=9;i++){
         System.out.printf("Enter the %d st number of %d : ",(i+1),list1.length);
         int num=key.nextInt();
         list1[i]=num;
         sum1+=list1[i];
        }
        System.out.println(sum1/list1.length);

        System.out.println();
        String[] list2=new String[3];

        for(int i=0;i<=2;i++){
            System.out.printf("Enter the %dst name of %d : ",(i+1),list2.length);
            String name=key.next();
            list2[i]=name;

        }
        for(int i=0;i<=2;i++){

            System.out.println(list2[i]);
        }

        int[] list3={2,5,9,0,2,1,8,5,4};
        for(int i=0;i<list3.length;i++){
            if(list3[i]==5){
                System.out.println("Index/s of the Number 5: "+i);
            }

        }

        for(int i=(list.length-1);i>=0;i--){
            System.out.println(list[i]);

        }

        String[] alpha={"W","t","y","h","k"};
        for(int i=0;i<alpha.length;i++){
            if(alpha[i].equalsIgnoreCase("t")){
                alpha[i]="hello";
                System.out.println(alpha[i]);
            }

        }

       int[] array1={1,7,6,5,9};
        int[] array2={2,7,6,3,4};
        for(int x=0;x<array1.length;x++){
           for(int j=0;j<array2.length;j++){
               if(array1[x]==array2[j]){
                   System.out.println("("+array1[x]+", "+array2[j]+")");
               }
           }
        }
    }
}

