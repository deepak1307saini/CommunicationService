public class Main {
    public static void main(String[] args) {
         CommunicationServiceFactory CommFactory=new CommunicationServiceFactory();
         CommunicationService emailComm=CommFactory.getCommServiceInstance("Email");
         CommunicationService textComm=CommFactory.getCommServiceInstance("Text");
         CommunicationService callComm=CommFactory.getCommServiceInstance("Call");
         CommunicationService WhatsAppComm=CommFactory.getCommServiceInstance("WhatsApp");

         User emp1=new User("Deepak Saini");
         User emp2=new User("Aman Jain");
         User emp3=new User("Adarsh Gupta");

         emailComm.subscribe(emp1);
         textComm.subscribe(emp1);

         emailComm.subscribe(emp2);
         WhatsAppComm.subscribe(emp2);

         WhatsAppComm.subscribe(emp3);
         textComm.subscribe(emp3);





    }

}