public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try{

            }catch (Exception e){

            }
        }catch (Exception e){
            try{

            }catch (Exception e2){   //에러. 변수 e가 중복 선언되었다 e -> e2 변경해주자

            }
        }
        try{

        }catch (Exception e){

        }
    }
}
/**
 * 다중 try_catch 문이 사용될 수 있음을 의미하는 예제이다.
 * **/
