# Kafka
Springboot projet for Kafka sample test


## Run Kafka server
$ bin/zookeeper-server-start.sh config/zookeeper.properties
$ bin/kafka-server-start.sh config/server.properties

## Create topic
$ bin/kafka-topics.sh --create --topic mytopic --bootstrap-server localhost:9092
