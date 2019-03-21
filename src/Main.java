public class Main {

    public static void lambdaTest(String s1, String s2, String s3, StringProcessing strings) {

        System.out.println(strings.go(s1, s2, s3));
    }
    public static void main(String... args) {

        String s = "aaaaaa";
      

        int add = 10 + 20;
        int sum = 0;
        for(int i = 0; i < 10; i ++) {
            sum += i;
        }
        System.out.println(sum);
        sum += add;
    }
}
