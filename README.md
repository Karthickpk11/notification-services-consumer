![image](https://github.com/user-attachments/assets/ce8b3073-ff98-4cdf-b803-408128e6fd7b)

https://kafka.apache.org/quickstart

Project Required:

1. Java 17
2. SpringBoot (dependency: _spring-boot-starter-web_ and _spring-kafka_) 
3. Download and extract ZooKeeper  [Latest version]
4. Download and extract Kafka [Latest version]

Commands need to run:
1. Open a command prompt and navigate to the zookeeper directory.
  **.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties**

2. Open a command prompt and navigate to the kafka directory.
  **.\bin\windows\kafka-server-start.bat .\config\server.properties**
   
3. Creating a Kafka Topic. Open a command prompt and navigate to the kafka directory.
  **.\bin\windows\kafka-topics.bat --create --topic _notification-topic_ --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1**

4. Producing Messages to a Kafka Topic: Test the below API URL:
  **localhost:8081/message-sending/Hello Karthick, How are you?**

And the Result is:

Postman:
![image](https://github.com/user-attachments/assets/b34889f7-9b9c-43d2-989e-bd948d7743b6)

Read a Message from Kafka Topic:
![image](https://github.com/user-attachments/assets/54837118-4907-4578-a140-08d752e80e93)
