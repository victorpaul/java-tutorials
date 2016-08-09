/**
 * Created by Victor on 09.08.2016.
 */
public class StringExample {

    public static void main(String[] args){
        runStringSample();

        //runloopSample();

        //runArraySample();
    }

    public static void runStringSample(){
        String nameNull = null;
        String name1 = " Carl ";
        String name2 = new String(" Bob ");

        char[] name3Array = { 'S', 'a', 'r', 'a', 'h'};
        String name3 = new String(name3Array);


        System.out.println(nameNull);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);


        if(name3 != null && name3.isEmpty() == false) {
            String sarahConnor = name3 + " Connor ";
            sarahConnor = sarahConnor.trim();
            System.out.println(sarahConnor); // Sarah Connor
            System.out.println(sarahConnor.length()); // 12
        }

        if(name1 != null && name1.isEmpty() == false) {
            String karlMarks = name1.concat(" Marks ");
            System.out.println(karlMarks); // Carl Marks
            System.out.println(karlMarks.length()); // 10
        }



        if(name1.equals(name2)){
            System.out.println("name1 == name2");
        }

        if("Bob".equals(name2)){
            System.out.println("Bob == name2");
        }
    }

    private static void runloopSample() {
        String hello = "Hello world";

        System.out.println("loop for");


        for(int i=0;i<hello.length();i++){// i == 0,1,2,3,4,5,6,7,8,9,10
            System.out.print(hello.charAt(i));
        }


        System.out.println();
        System.out.println("loop while");


        int i = 0; // create new i ????? WTF?
        while(i<hello.length()){ // danger loop
            System.out.print(hello.charAt(i));
            i++;
        }


        System.out.println();
        System.out.println("loop do while");


        i = 0;
        do{ // even more dangerous loop
            System.out.print(hello.charAt(i));
            i++;
        }while(i<hello.length());

        // one more loop is iext tutorial  runArraySample();

    }

    public static void runArraySample(){
        char[] nameArray = new char[5];
        for(int i=0;i<nameArray.length;i++){
            System.out.println("nameArray[" + i + "]=" + nameArray[i]);
        }

        String hello = "Hello World";

        int amountOfLettersToMove = hello.length();
        if(amountOfLettersToMove > nameArray.length){
            amountOfLettersToMove = nameArray.length;
        }
        for(int i=0;i<amountOfLettersToMove;i++){
            nameArray[i] = hello.charAt(i);
            System.out.println("nameArray[" + i + "]=" + nameArray[i]);
        }

        String[] names = new String[]{"Bob","Carl","Sarah"};
        for(String name : names){
            System.out.println(name);
        }

    }
}
