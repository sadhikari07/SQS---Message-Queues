package sqs_lab;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.*;

import java.util.Date;
import java.util.List;

public class SqsSend {

    public static void main(String[] args)
    {
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        String queueUrl1 = System.getenv("QUEUE_URL1");
        String queueUrl2 = System.getenv("QUEUE_URL2");
        String queueUrl3 = System.getenv("QUEUE_URL3");
        String[] queueURL = {queueUrl1, queueUrl2, queueUrl3};

        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < queueURL.length; j++) {
                SendMessageRequest send_msg_request = new SendMessageRequest()
                        .withQueueUrl(queueURL[j])
                        .withMessageBody("This is an awesome message with your lucky number:" + (int) Math.random()*100)
                        .withDelaySeconds(5);
                sqs.sendMessage(send_msg_request);
            }
        }
    }
}




//https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-project-gradle.html
//https://javalibs.com/artifact/com.amazonaws/aws-java-sdk-sqs
//https://github.com/awsdocs/aws-doc-sdk-examples/blob/master/java/example_code/sqs/src/main/java/aws/example/sqs/SendReceiveMessages.java