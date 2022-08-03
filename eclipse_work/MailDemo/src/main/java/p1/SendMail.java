package p1;

import org.simplejavamail.api.email.Email;
import org.simplejavamail.api.mailer.Mailer;
import org.simplejavamail.api.mailer.config.TransportStrategy;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;

public class SendMail {

	public static void sendEmail(String subject, String msg, String to) {
		Email email = EmailBuilder.startingBlank().from("From", "javatrainer2022@gmail.com")
				.to("1 st Receiver", "coolshad12@gmail.com").withSubject("Email Subject").withPlainText("Email Body")
				.buildEmail();

		Mailer mailer = MailerBuilder.withSMTPServer("smtp.mailtrap.io", 2525, "javatrainer2022@gmail.com", "Musa@2022")
				.withTransportStrategy(TransportStrategy.SMTPS).buildMailer();

		mailer.sendMail(email);
	}

	public static void main(String[] args) {
		sendEmail("hii", "hello", "coolshad12@gmail.com");
	}

}
