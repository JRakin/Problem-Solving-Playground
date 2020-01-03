public class Solution extends Thread {
    @Override
    public void run() {
        for (int i  = 0; i < 10; i++ ){
            System.out.println("Do something!!!");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
