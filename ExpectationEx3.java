public class ExpectationEx3 {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;

        for(int i = 0; i<10; i++){
            try{
                result = num/(int )(Math.random()*10);
                System.out.println(result);
            }catch(ArithmeticException e){
                System.out.println("0");

                /** 근데 이 try - catch는 뭐가 맘에 안들어서 예외가 생기는걸까? **/
                                                    //  ArithmeticException
            }//try-catch의 끝
        }//for의 끝
    }
}
