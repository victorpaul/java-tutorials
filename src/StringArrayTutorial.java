/**
 * Created by victor on 01.08.16.
 */
public class StringArrayTutorial {
    public static void main(String[] args){

        System.out.println("Example 1");
        String s1 ="ab";
        String s2 = new String("ab");
        System.out.println("1"=="1");//true
        System.out.println(s1==s2);//false
        System.out.println(s1=="ab");//true

        System.out.println("Example 2");

        s1 ="ab";
        s2 = s1 + "c";
        System.out.println(s2=="abc");//false
        System.out.println(s1==s2);//false

        System.out.println("Example 3");

        s1 ="ab";
        s2 = s1;
        s2+="c";
        System.out.println(s2.equals("abc"));//true
        System.out.println(s1.equals("abc"));//false
        System.out.println(s1==s2);//false

        System.out.println("Example 4");

        int[] a = new int[]{1,2,3};
        int[] b = a;
        b[2] = 100;
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



    }
}