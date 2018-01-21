public class question4 {
    public static int countSpaces(String s){
        if (s == null || s.length() == 0){
            return 0;
        }
        char c = s.charAt(0);
        if (' ' != c){
            return countSpaces(s.substring(1));
        }else{
            return countSpaces(s.substring(1)) + 1;
        }
    }
}
