public class question3 {
    public static void twistShout(){
        for (int i = 1; i < 101; i++){
            boolean printed = false;
            if (i % 3 == 0){
                System.out.println("Twist");
                printed = true;
            }
            if (i % 5 == 0){
                // wasn't sure if on 15 for example it should be the same row or a new line?
                System.out.println("Shout");
                printed = true;
            }
            if (!printed){
                System.out.println(i);
            }
        }
    }
}
