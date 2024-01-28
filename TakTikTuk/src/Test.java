public class Test {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            try{
                timer();
                System.out.println(i);
            }catch(Exception e){
                System.out.println();
            }
        }
    }
    public static void timer() throws InterruptedException{
        Thread.sleep(1000);
    }
}

