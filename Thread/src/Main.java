public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.start();

        for (int i = 0; i < 10; i++){
            System.out.println(1);

            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
