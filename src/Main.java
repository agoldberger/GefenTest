public class Main {

    public static void main(String[] args) {
        int[][] array =  {{},{1,2,3},{4,5},{},{},{6},{7,8},{},{9},{10},{}};
        int[][] array1 =  {{1},{2,3},{4,5},{6},{},{7},{8},{},{9},{10},{}};
        question12.printElementArray(array);
        System.out.println();
        question3.twistShout();
        System.out.println(question4.countSpaces("Everyday a grape licks a friendly cow"));
        System.out.println(question4.countSpaces( " Look, a distraction! "));
        System.out.println(question4.countSpaces( " H ey this is fun!  "));
        question12.printElementArray(question12.getIntermediaryArray(array1));
    }
}
