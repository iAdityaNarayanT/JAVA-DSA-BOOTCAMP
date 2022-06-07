package aditya;

public class BlockScope {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        {
             //! int a = 99;  //already initialised outside the block in the same method, hence you cannot initialise again
            //! but you can update the value of a inside the block-->
            a=100; // reassign the origin ref variable to some other value, which can be accessed outside the block as well
            System.out.println(a); //will print 100

            int c=99; // values initialised in this block, will remain in block
            System.out.println(c);
        }

        //        System.out.println(c); // cannot use --c-- outside the block
        System.out.println(a); //will print 100


        // scoping in for loops
        for (int i = 0; i < 4; i++) {
           System.out.println(i);
            int num = 90;
            a = 999; // value of a can be updated inside for loop
        }
//        System.out.println(i); // i cannot be accessed outside for loop
//        System.out.println(num); num cannot be accessed outside for loop
        System.out.println(a); //will print 999; as original ref variable is being changed
    }

}
