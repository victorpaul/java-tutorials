package tutorial0;

/**
 * Created by Victor on 18.08.2016.
 */
public class PracticeLab2 {
    public static void main(String[] args){
        int[] numbersArray = new int[]{5,4,3,2,3,4,5,2,1};

        // lets sort it out

        for(int r : numbersArray) {

            for (int i = 0; i < numbersArray.length; i=i+1) {
                if (numbersArray[i] < numbersArray[i + 1]) {
                    int temp = numbersArray[i];
                    numbersArray[i] = numbersArray[i + 1];
                    numbersArray[i + 1] = temp;
                }
            }

            showArray(numbersArray);
        }

        //lets do some geometry

        // s = 1/2*a*h // Через основание и высоту
        // s = 1/2*a*b*sin(alpha) // Через две стороны и угол
        // S = 1/2*a*b // Площадь прямоугольного треугольника
        // Формула Герона
        // Формула Герона для прямоугольного треугольника


    }

    public static void showArray(int[] array){
        System.out.println();
        for(int r:array) {
            System.out.print(r+",");
        }
        System.out.println();
    }
}
