/**
 * Main
 */
public class Day03 {

    public static void main(String[] args) {
        String text= "toi la coder";
        String[] array= text.split(" ");
        for (int index= 0; index < array.length; index++){
            System.out.println(array[index]);
            String word= array[index];
            if (word.length() > 0){
                if( word.equals("t")){
                    String firstCharator= word.substring(0, 1);
                    firstCharator= firstCharator.toUpperCase();
                    String last= word.substring(1);
                    System.out.println(firstCharator + last);
                }
            }
        }
    }
}