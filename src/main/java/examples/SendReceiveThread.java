package examples;

import com.sun.org.apache.regexp.internal.RE;

import javax.management.relation.RelationNotFoundException;
import javax.xml.crypto.Data;
import java.util.concurrent.ThreadLocalRandom;

public class SendReceiveThread {
    private static class DataObject {
        private String packet;
        private boolean isInTransit;

        public DataObject(boolean arg) {
            isInTransit = arg;
        }


        public synchronized void sendData(String argPacket) {
            while (isInTransit) {
                try {
                    wait();
                } catch (InterruptedException iexp) {
                    Thread.currentThread().interrupt();
                    System.out.print("Sender Thread interrupted " + iexp.getMessage());
                }
            }
            isInTransit = true;
            this.packet = argPacket;
        //    notifyAll();

        }

        public synchronized String receiveData() {
            while (!isInTransit) {
                try {
                    wait();

                } catch (InterruptedException iExp) {
                    Thread.currentThread().interrupt();
                    System.out.println("Receiver thread interrupted " + iExp.getMessage());
                }
            }
            isInTransit = false;
            String recivedPacket = this.packet;
            notifyAll();
            return recivedPacket;
        }
    }

    private class Sender extends Thread {
        private DataObject dataObject;

        public Sender(DataObject argObj) {
            dataObject = argObj;
        }

        private String packets[] = {
                "First Object",
                "Second Object",
                "Third Object",
                "Fourth Objects",
                ""
        };

        public void run() {
            for (String packet : packets) {
                dataObject.sendData(packet);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 2000));
                } catch (InterruptedException iExp) {
                    System.out.println("Exception in sender " + iExp.getMessage());

                }

            }

        }
    }

    private class Receiver extends Thread {

        DataObject dataObject;

        public Receiver(DataObject argObj) {
            dataObject = argObj;
        }

        public void run() {

            String receivedObject;
            do {
                receivedObject = dataObject.receiveData();
                System.out.println("Object received is " + receivedObject);
            } while (!receivedObject.equals(""));

        }
    }


    public void InvokeSendReceiveThread() {
        DataObject transporter = new DataObject(false);
        Thread sender = new Sender(transporter);
        Thread receiver = new Receiver(transporter);

        sender.start();
        receiver.start();



    }
}
