public class Main {


    public static void main(String[] args) {

    }


    public static boolean hasTeen(int n, int q, int i){
        if ((n <= 19 && n >= 13) || (q <= 19 && q >= 13) || (i <= 19 && i >= 13)) {
            return true;
        } else return false;
    }

    public static boolean isTeen(int n) {
        if (n <= 19 && n >= 13) {
            return true;
        } else return false;
    }

}
