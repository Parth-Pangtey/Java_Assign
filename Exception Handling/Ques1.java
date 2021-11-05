public class Ques1 {

    public static void main(String[] args) throws Exception {
        int a= 9;
        int b = 0,c=0;
        try
        {
        c = a/b;
        System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        // rasie solution

        try {
            c = 8 / 0;
            System.out.println(c);
        }catch (Exception e) {
            throw new Exception("UnsupportedOperationException") ;
        }


    }
}
