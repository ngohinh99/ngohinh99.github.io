public class Main {
    public static void main(String[] args) {
        String[] text= new String[4];
        text[1]= "toi laf java codder";
        text[2]= "toi dang hocj java co ban";
        text[3]= "toi se hocj lap trinh web";
        for (int index= 0; index < text.length; index++){
            System.out.println(text[index]);
        }
        int[][] intNumber= new int[3][4];
        for (int i= 0; i < 3; i++){
            for (int y= 0; y < 4; y++){
                intNumber[i][y]= 1;
            }
        }
        for (int i= 0; i < 3; i++){
            for (int y= 0; y < 4; y++){
                System.out.println(intNumber[i][y]);
            }
        }
        for (String t: text){
            System.out.println(t);
        }
    }
}
