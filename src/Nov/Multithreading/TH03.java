//package Nov.Multithreading;
//
//public class TH03 {
//    public static void main(String[] args) {
//        //ThreadGroup threadGroup = new ThreadGroup("workers")
//        workerTh03 w1 = new workerTh03();
//        w1.start();
//        workerTh03 w2 = new workerTh03();
//        w2.start();
//    }
//
//}
//
//class workerTh03 extends Thread {
////    workerTh03 (ThreadGroup threadGroup,String name){
////        super(threadGroup,name);
//    }
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//           try{
//               System.out.println(Thread.currentThread().getName());
//               Thread.sleep(2000);
//           }catch (Exception e){
//               e.printStackTrace();
//           }
//        }
//    }
//}
