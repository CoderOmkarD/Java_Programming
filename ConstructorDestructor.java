class Demo {
    public int iNo1;
    public int iNo2;

    public Demo() {
        System.out.println("Inside Default Constructor....");
    }

    public Demo(int i, int j) {
        System.out.println("Inside Parameterized Constructor....");
    }
        protected void finalize() //~Demo
        {
            System.out.println("Inside Finalize");
        }
}

class ConstructorDestructor {
    public static void main(String[] args) {

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,23);


        dobj1=null;
        dobj2=null;

        System.gc();

        System.out.println("End of Main");
    }
}