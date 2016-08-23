/**
 * Created by Victor on 16.08.2016.
 */
public class PracticeLab1 {

    static String text = "Lorem  ipsum dolor sit amet, consectetur " +
            " adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore  magna aliqua.";

    public static void main(String[] args){
        int r = (int) (2/0.000f);
        System.out.println(r);

    }

    private static void Spaсe() {

        char[] chArray = text.toCharArray();

        int a = 0;

        for(int i = 0; i<chArray.length; i++){

            if(chArray[i] == ' '){

                a++;
            }
        }

        System.out.println("Spaces amount = " + a);

    }

    private static String[] Word() {

        while(text.contains("  ")) {

            text = text.replace("  "," ");

        } // Bonus 3 Замінити подвійні пробіли одинарними

        String[] textParts  = text.split(" ");

        System.out.println("Wolds amount = " + textParts.length);

        return textParts;
    }

    private static void WordWithM() {


        String[] textParts = Word();

        int WordWithM = 0;

        for(int i = 0; i<textParts.length; i++){

            if(textParts[i].contains("m")){

                WordWithM = WordWithM + 1;
            }
        }

        System.out.println("Words with M amount = " + WordWithM);
    }
}
