package message;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Recv {
	private final static String QUEUE_NAME = "P8_OdpovedPrevoza";
	private final static String QUEUE_NAME1 = "P1_NovaRezervacija";
	
	public void pridobi_sporocilo_odpoved() {
		try {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setVirtualHost("/");
		factory.setUsername("soa");
		factory.setPassword("soasoa");
		factory.setHost("164.8.251.175");
		factory.setPort(5672);
		factory.setConnectionTimeout(20);
		
	    Connection connection;
		connection = factory.newConnection();
	    Channel channel = connection.createChannel();
	    
	    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
	    
	    Consumer consumer = new DefaultConsumer(channel) {
	        @Override
	        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
	            throws IOException {
	          String message = new String(body, "UTF-8");
	         System.out.println(" [x] Received '" + message + "'");
	        }
	      };
	      channel.basicConsume(QUEUE_NAME, true, consumer);
	      
	    } catch (Exception e) {
	    	System.out.println("Ni novih sporo�il!");
		} 

	}
	public void pridobi_sporocilo_emso() {
		try {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setVirtualHost("/");
		factory.setUsername("soa");
		factory.setPassword("soasoa");
		factory.setHost("164.8.251.175");
		factory.setPort(5672);
		factory.setConnectionTimeout(20);
		
	    Connection connection;
		connection = factory.newConnection();
	    Channel channel = connection.createChannel();
	    
	    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
	    
	    Consumer consumer = new DefaultConsumer(channel) {
	        @Override
	        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
	            throws IOException {
	          String message = new String(body, "UTF-8");
	         System.out.println(" [x] Received '" + message + "'");
	        }
	      };
	      channel.basicConsume("P2_Recepcija_emso", true, consumer);
	      
	    } catch (Exception e) {
	    	System.out.println("Ni novih sporo�il!");
		} 

	}
	public void pridobi_sporocilo_rezervacijska() {
		try {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setVirtualHost("/");
		factory.setUsername("soa");
		factory.setPassword("soasoa");
		factory.setHost("164.8.251.175");
		factory.setPort(5672);
		factory.setConnectionTimeout(20);
		
	    Connection connection;
		connection = factory.newConnection();
	    Channel channel = connection.createChannel();
	    
	    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
	    
	    Consumer consumer = new DefaultConsumer(channel) {
	        @Override
	        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
	            throws IOException {
	          String message = new String(body, "UTF-8");
	         System.out.println(" [x] Received '" + message + "'");
	        }
	      };
	      channel.basicConsume(QUEUE_NAME1, true, consumer);
	      
	    } catch (Exception e) {
	    	System.out.println("Ni novih sporo�il!");
		} 

	}


}
