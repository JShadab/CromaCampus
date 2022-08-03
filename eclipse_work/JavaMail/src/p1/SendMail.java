package p1;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void sendEmail(String subject, String msg, String to) throws Exception {
		
		Runnable runnable = () -> {};
		
		String host = "smtp.gmail.com";
		String from = "javatrainer2022@gmail.com";
		Properties props = System.getProperties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", "Musa@2022");
		props.put("mail.smtp.port", "587"); // 587 is the port number of yahoo mail
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, null);
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));

		InternetAddress to_address = new InternetAddress(to);

		System.out.println(Message.RecipientType.TO);

		message.addRecipient(Message.RecipientType.TO, to_address);

		message.setSubject("sending in a group");
		message.setText("Welcome to JavaMail");
		// alternately, to send HTML mail:
		// message.setContent("<p>Welcome to JavaMail</p>", "text/html");
		Transport transport = session.getTransport("smtp");
		transport.connect("smtp.mail.yahoo.co.in", "user name", "asdfgh");
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}

	public static void main(String[] args) throws Exception {
		sendEmail("hii", "hello", "coolshad12@gmail.com");
	}

}
