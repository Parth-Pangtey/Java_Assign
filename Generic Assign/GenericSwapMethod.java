public class GenericSwapMethod {

     public static final  <T> void swap(T[] array, int i , int j){
         T temp = array[i];
         array[i] = array[j];
         array[j] = temp;
     }

    public static void main(String[] args) {
        Integer [] a = {5,6,5,4,7,4,3,};
        swap(a,5,4);                           // swap Integer array
        for(Integer e : a){
            System.out.print(e +" ");
        }
        System.out.println();
        String [] b = {"hello","how","are","you","?"};
        swap(b,2,4);                                // swap String array
        for (String s: b) {
            System.out.print(s +" ");
        }
    }
}