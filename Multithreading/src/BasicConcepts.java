class BasicConcepts {
   public static void main(String[] args) {

 
       /*
        We have 3 drive and we are search for specific files from all these .So,if we found searched files then we
        will display found.Lets understand how multi Threading comes to practice.
        */
       //In this example , I am just going to implement only one default thread i.e main thread
       ScanForDriveC scanForDriveC = new ScanForDriveC();
       ScanForDriveD scanForDriveD = new ScanForDriveD();
       ScanForDriveE scanForDriveE  = new ScanForDriveE();
       scanForDriveC.start();
       scanForDriveD.start();
       scanForDriveE.start();
   }
}

 
class ScanForDriveC extends Thread{
   @Override
   public void run(){
       for (int cDrive=0; cDrive<1000000;cDrive++){
           switch (cDrive){
               case 57:
                   System.out.println("57 file found");
               case 85:
                   System.out.println("85 file found");
               default:
                   System.out.println("Scanning" + cDrive + "cDrive");
           }
       }
   }
}
class ScanForDriveD extends Thread{
   @Override
   public void run(){
       for (int dDrive=0; dDrive<1000000;dDrive++){
           switch (dDrive){
               case 57:
                   System.out.println("57 file found");
               case 85:
                   System.out.println("85 file found");
               default:
                   System.out.println("Scanning" + dDrive + "dDrive");
           }
       }

 
   }
}
class ScanForDriveE extends Thread{
   @Override
   public void run(){
       for (int eDrive=0; eDrive<1000000;eDrive++){
           switch (eDrive){
               case 57:
                   System.out.println("57 file found");
               case 85:
                   System.out.println("85 file found");
               default:
                   System.out.println("Scanning" + eDrive + "eDrive");
           }
       }

 
   }
}

