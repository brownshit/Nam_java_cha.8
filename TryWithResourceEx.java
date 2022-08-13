public class TryWithResourceEx {
    public static void main(String[] args) {
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);        //예외가 발생하지 않는다.
        }catch(WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
        System.out.println();

        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);         //예외가 발생한다.
        }catch(WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}

class CloseableResource implements AutoCloseable{
    public void exceptionWork(boolean exception)throws WorkException{
                //예외 발생기1
        /**throws를 통해서 예외를 발생시키는 throw가 코드에 존재함을 나타낸다.**/
        System.out.println("exceptionWork("+exception+") 가 호출됨.");

        if(exception)
            throw new WorkException("WorkException 발생!!");
    }

    public void close() throws CloseException{
            //예외 발생기2
        System.out.println("close( ) 가 호출됨");
        throw new CloseException("CloseException 발생!!");

    }
}

class WorkException extends Exception{
    WorkException(String msg){super(msg);}
}

class CloseException extends Exception{
    CloseException(String msg){ super(msg);}
}