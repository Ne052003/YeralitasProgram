package recursos;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

  private final Properties properties = new Properties();

  private final Session session;

  public Mail() {

    properties.put("mail.smtp.host", "smtp.office365.com");
    properties.setProperty("mail.smtp.starttls.enable", "true");
    properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
    properties.put("mail.smtp.ssl.trust", "smtp.office365.com");
    properties.setProperty("mail.smtp.port", "587");
    properties.setProperty("mail.smtp.password", "");
    properties.setProperty("mail.smtp.user", "");
    properties.setProperty("mail.smtp.auth", "true");

    session = Session.getDefaultInstance(properties);
  }

  public void enviarEmail(String asunto, String mensaje, String receptor)
      throws MessagingException {

    MimeMessage contenedor = new MimeMessage(session);
    contenedor.setFrom(new InternetAddress(this.properties.getProperty("mail.smtp.user")));
    contenedor.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
    contenedor.setSubject(asunto);
    contenedor.setText(mensaje);
    Transport t = session.getTransport("smtp");
    t.connect(
        (String) this.properties.get("mail.smtp.user"),
        (String) this.properties.get("mail.smtp.password"));
    t.sendMessage(contenedor, contenedor.getAllRecipients());
  }
}
