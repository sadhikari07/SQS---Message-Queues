# Lab: SQS - Message Queues

## Overview
   For this lab, you will be creating a few Message Queues and Broadcasters and wiring them through code.

## Feature Tasks
   - Create 3 Standard Queues
        - QueueA
        - QueueB
        - QueueC
   - Create command line applications in Java that use these queues
   - Queue Publisher
        - Sends a message to a queue, using its ARN or URL
   - Queue Client
        - Receives messages from a Queue (by ARN) and displays them


## Wiring Instructions

- Create three different queues in AWS SQS console as standard queue.
![Screen Screen](https://raw.githubusercontent.com/sadhikari07/SQS---Message-Queues/master/assets/sqsConfig.png)

- Create a java library sqs_lab
    - For Sender:
        - Create Java class sqsSend.java
        - Write code that will send messages to three different queues
        - [Link to sqsSend.java](https://github.com/sadhikari07/SQS---Message-Queues/blob/master/src/main/java/sqs_lab/SqsSend.java)

    - For Receiver:
        - Create Java class sqsRecieve.java
        - Create methods for three different recievers
        - Write code for each methods to get messages from the queues
        - [Link to sqsRecieve.java](https://github.com/sadhikari07/SQS---Message-Queues/blob/master/src/main/java/sqs_lab/SqsRecieve.java)

    - For both:
        - Get the URLs from SQS
        - Store URLs in environment variables

## For running:
- For sending:
    - On intellij, click on green play button next to the method that sends messages.
    - On terminal: ./gradlew run

- For recieving:
     - On intellij, click on green play button next to the method that recieves messages.
          - On terminal:  ./gradlew run

## Queue-count aftersending messages:
![Screen Screen](https://raw.githubusercontent.com/sadhikari07/SQS---Message-Queues/master/assets/queueWithMessages.png)

## Intellij console showing the recieved messages:
![Screen Screen](https://raw.githubusercontent.com/sadhikari07/SQS---Message-Queues/master/assets/recieve.png)


## References:
- https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-project-gradle.html
- https://javalibs.com/artifact/com.amazonaws/aws-java-sdk-sqs
- https://github.com/awsdocs/aws-doc-sdk-examples/blob/master/java/example_code/sqs/src/main/java/aws/example/sqs/SendReceiveMessages.java
