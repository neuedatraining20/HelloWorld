public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i <10; i++){
            System.out.println(i);
        }
        int[] numbers = {12, 16, 9, 4, 22, 104, 66, 8, 222};
        for ( int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int counter = 0;
        while(counter < 10){
            System.out.println("hello");
        }
        int[] selectedNumbers = {1,2,3,4,5,6,7,8,9,10};
        int counter2 = 0;
        while (selectedNumbers[counter2] < 7) {
            System.out.println(selectedNumbers[counter2]);
            counter2++;
        }
    }
}