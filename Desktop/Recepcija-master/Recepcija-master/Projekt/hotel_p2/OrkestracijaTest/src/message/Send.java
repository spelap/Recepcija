package message;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

import com.rabbitmq.client.Channel;


public class Send {

	public void poslji_sporocilo_ciscenje(int st_sobe) {
		try {
		String QUEUE_NAME = "P2_Recepcija_pocisti_sobo";	
		ConnectionFactory factory = new ConnectionFactory();
		factory.setVirtualHost("/");
		factory.setUsername("soa");
		factory.setPassword("soasoa");
		factory.setHost("164.8.251.175");
		factory.setPort(5672);
		
		Connection connection;
		connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, true, false, true, null);
		String message = "Potrebno je pocistiti sobo "+st_sobe+"!";
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		System.out.println(" [x] Sent '" + message + "'");
		
		channel.close();
		connection.close();
		
		} catch (Exception e) {
			System.out.println("Pri pošiljanju je prišlo do napake!");
			e.printStackTrace();
		}
	}
	
	public void poslji_sporocilo_emso(String emso) {
		try {
		String QUEUE_NAME = "P2_Recepcija_emso";
		ConnectionFactory factory = new ConnectionFactory();
		factory.setVirtualHost("/");
		factory.setUsername("soa");
		factory.setPassword("soasoa");
		factory.setHost("164.8.251.175");
		factory.setPort(5672);
		
		Connection connection;
		connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, true, false, true, null);
		String message = emso;
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		System.out.println(" [x] Sent '" + message + "'");
		
		channel.close();
		connection.close();
		
		} catch (Exception e) {
			System.out.println("Pri pošiljanju je prišlo do napake!");
			e.printStackTrace();
		}
	}

}
