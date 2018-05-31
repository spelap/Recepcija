package message;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

public class Recv {
	private final static String QUEUE_NAME = "P2_Recepcija_pocisti_sobo";
	/*public static void main(String[] args) {*/
	public void pridobi_sporocilo() {
		try {
	/*	
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
	      */
	    } catch (Exception e) {
	    	System.out.println("Pri prejemanju je prišlo do napake!");
		} 

	}

}
