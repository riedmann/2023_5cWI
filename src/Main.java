public class Main {

        static int x = 7;
        public static void main(String[] args) {
            System.out.println("starting...");
            int result = calculate(4, 11);
            System.out.println("Result:" + result);


            while (result<0){
                System.out.println("inside" + result);
                result +=4;
            }
        }

        public static int calculate(int a, int b){
            System.out.println("calculating");
            return a - b;
        }


}