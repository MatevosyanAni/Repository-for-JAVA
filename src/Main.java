public class Main {
    public static void main(String[] args) {

        // The First Part
        int c ;
        int a = 2 ;
        int b = 3 ;
        c = a * a + b * b ;
        System.out.println("The sum of a and b's squares = " + c );

        //  The Second Part
        a = 5 ;
        b = 4 ;
        c = 6 ;
        System.out.println("The Surface of the Table = " + c * ( a + b  ) / 2 );

        //   The Third Part
        int Number  = 765 ;
        int num1 = Number / 100 ;
        System.out.println( "Number1 = " + num1 ) ;
        int num2 = ( Number % 100 ) / 10 ;
        System.out.println( "Number2 = " + num2 ) ;
        int num3 = Number % 10 ;
        System.out.println("Number3= " + num3 ) ;
    }
}
