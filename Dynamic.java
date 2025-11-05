import java.util.Scanner;


class Dynamic {

    public static void main(String Arr3[]) {

        Scanner sobj= new Scanner(System.in);

        int length=0;
        int Arr[];

        System.out.println("Enter the no. of elements:");
        length=sobj.nextInt();

        Arr=new int[length];

        if(Arr==null)
        {
            System.out.println("Enable To Allocate the Memory");
        }
        else{
            System.out.println("Memory gets successfully Allocated");


        }

        Arr=null;
        System.gc();
    }
}