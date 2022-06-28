public class TestCat {
    public static void main(String[] args) {

        System.out.println(sum(5,8));
        System.out.println(sum(2,5,13));
        System.out.println(sum(7.2,3.9));
        System.out.println(sum(3,4.2));
        System.out.println(sum(7.9,8));
    }
    public static int sum(int num1,int num2){
        return num1 + num2;
    }
    public static int sum(int num1,int num2, int num3){
        return num1 + num2 + num3;
    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }
    public static double sum(int num1, double num2){
        return num1 + num2;
    }


}
