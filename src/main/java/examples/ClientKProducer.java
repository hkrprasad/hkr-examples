package examples;

import com.sun.security.ntlm.Client;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.FileReader;
import java.util.Properties;

public class ClientKProducer {

    private Properties kafkaProps;
    private KafkaProducer kafkaProd;

    public ClientKProducer(Properties argProp){

        kafkaProps = new Properties();
        kafkaProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, argProp.get("KAFKA_BROKERS"));
        kafkaProps.put(ProducerConfig.CLIENT_ID_CONFIG, argProp.get("CLIENT_ID"));
        kafkaProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
        kafkaProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        kafkaProd = new KafkaProducer(kafkaProps);

    }

    public static void StartUp(){
        try {
            FileReader propFileReader = new FileReader("clientKProducer.properties");
            Properties propList = new Properties();
            propList.load(propFileReader);

            ClientKProducer ckp = new ClientKProducer(propList);



        } catch (Exception exp){
            System.out.print(exp.getMessage());
        }


    }


}
