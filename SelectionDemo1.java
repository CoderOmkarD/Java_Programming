import java.util.Scanner;


class SelectionDemo1

{
    public static void main(String[] args) {


        Scanner sobj=new Scanner(System.in);
        int iAge=0;
      
        System.out.println("Enter your age");
        iAge=sobj.nextInt();


        if(iAge>=18)
        {
            System.out.println("You Can Vote");
        }
        else{
            System.out.println("You Can't vote");
        }

    }
}