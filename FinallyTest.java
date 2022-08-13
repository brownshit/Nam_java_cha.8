public class FinallyTest {
    public static void main(String[] args) {
        try{
            startInstall();
            copyfiles();            //파일들을 복사한다.
            deleteeTempFiles();     //프로그램 설치에 사용도니 임시파일들을 삭제한다.
        }catch (Exception e){
            e.printStackTrace();
            deleteeTempFiles();     //프로그램 설치에 사용도니 임시파일들을 삭제한다.
        }
    }

    static void startInstall(){
        /*프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/
    }
    static void copyfiles(){/*파일들을 복사하는 코드를 적는다.*/}
    static void deleteeTempFiles(){/*임시파일들을 삭제하는 코드를 적는다.*/}

}
