public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);    //오류가 발생한다.
            System.out.println(4);
        }catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException){  //ArithmeticException가 처리된다면 true를 출력한다.
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        }catch (Exception e){   //ArithmeticException을 제외한 모든 예외가 처리된다.
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
