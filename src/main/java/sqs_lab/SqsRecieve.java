package sqs_lab;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;

import java.util.List;

public class SqsRecieve {

    public static void main(String[] args) {
        getMessagesFromQ1();
        getMessagesFromQ2();
        getMessagesFromQ3();
    }

    public static void getMessages(String url){
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        String queueUrl = url;
        // receive messages from the queue
        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();

        for (Message m : messages) {
            System.out.println(m.getBody());
        }
        // delete messages from the queue
        for (Message m : messages) {
            sqs.deleteMessage(queueUrl, m.getReceiptHandle());
        }
    }

    public static void getMessagesFromQ1(){
        String queueUrl1 = System.getenv("QUEUE_URL1");
        getMessages(queueUrl1);

    }

    public static void getMessagesFromQ2(){
        String queueUrl2 = System.getenv("QUEUE_URL2");
        getMessages(queueUrl2);
    }

    public static void getMessagesFromQ3(){
        String queueUrl3 = System.getenv("QUEUE_URL3");
        getMessages(queueUrl3);
    }

}


