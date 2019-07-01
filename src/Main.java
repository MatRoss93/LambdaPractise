public class Main {

    public static void lambdaTest(String s1, String s2, String s3, StringProcessing strings) {

        System.out.println(strings.go(s1, s2, s3));
    }
    public static void main(String... args) {

        String s1 = "lambda";
        String s2 = "przetwarzanie";
        String s3 = "nauka";
        String s4 = "do git commit problem";

        lambdaTest(s1,s2,s3, (s, ss, sss)-> s.length() < ss.length());
        lambdaTest(s1,s2,s3, (s, ss, sss)-> {
            if(s.length() > ss.length() && s.length() > sss.length())
                return true;
            return false;
        });
        int add = 10 + 20;
        int sum = 0;
        for(int i = 0; i < 10; i ++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("czy będzie konflikt?");
        
    }
}
