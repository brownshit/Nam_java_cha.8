import java.io.*;
import java.util.Scanner;

public class ExceptionEx16 {
    public static void main(String[] args) {
        try{
            File f = createFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었음");
        }catch (Exception e){
            System.out.println(e.getMessage()+ " >> 재입력하십시오");
            /**
             * Scanner scanner = new Scanner(System.in);
             *             String filename_buffer = scanner.nextLine();
             *             args[0] = filename_buffer;
             * **/
            //위의 주석코드로 실행하는 방법 다시 생각해보기
        }
    }//main end

    static File createFile(String fileName) throws Exception{
        if(fileName == null||fileName.equals("")){
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);        //file 클래스 객체 생성

        //File 객체의 createNewFile 메서드를 이용해서 실제 파일을 생성한다.

        f.createNewFile();  //이 메서드는 새로운 파일을 만들어 낼때 사용한다.
        return f;
    }


}
