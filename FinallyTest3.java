public class FinallyTest3 {
    public static void main(String[] args) {
        //method1은 static메서드이므로 인스턴스 생성없이 직접호출
        FinallyTest3.method1();
        System.out.println("main 메서드로의 복귀");
    }

    //static메서드인 method1는 인스턴스 생성없이 직접 호출이 가능하다.
    static void method1(){
        try{
            System.out.println("method1이 호출되었습니다.");
            return;
            //현재 실행중인 메서드의 종료
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("method1의 finally블럭이 실행되었습니다.");
        }
    }
}
