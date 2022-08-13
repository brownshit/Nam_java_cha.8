import java.io.*;

public class ExceptionEx15 {
    public static void main(String[] args) {
        //command line에서 입력받는 값을 이름으로 갖는 파일을 생성한다.
        File f = createFile(args[0]);       //문자열 배열의 첫번째 요소(주소)
        System.out.println(f.getName() + " file이 성공적으로 생성되었습니다.");
        //getname이 뭐야?
            //어떤 메서드 인지
    }


    //throw 는 예외를 발생시키는 메서드
    //throws는 메서드에서 이러한 예외가 발생할 수 있다는 것을 암시해준다.

    //이제 전역
    static File createFile(String filename){    //보니까 메서드에 throws나 try_catch 둘중 하나는 써줘야 하네. 예외가 발생할때.
        try{
            if(filename == null ||filename.equals("")){
                throw new Exception("파일이름이 유효하지 않습니다.");
            }

        }catch (Exception e){
            filename = "제목없음.txt";
        }finally {
            File f = new File(filename);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile (File f){
        try{
            f.createNewFile();
        }catch (Exception e){
            //createnewFile 메서드의 끝
        }
    }
}

//이 예제는 어떻게 실행시키는지 모르겠다.