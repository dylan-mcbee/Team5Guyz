package com.cinema.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Mail {
	  private static final String username = "team5guyz@gmail.com";
	    private static final String password = "ClassicLi2017";

	    public static boolean sendMail(String recipientEmail, String subject, String body) {
	        boolean result = false;

	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props,
	                new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(username, password);
	                    }
	                });

	        try {
	            InternetAddress fromAddr = new InternetAddress(username);
	            InternetAddress toAddr = new InternetAddress(recipientEmail);

	            MimeMessage message = new MimeMessage(session);
	            message.setFrom(fromAddr);
	            message.addRecipient(Message.RecipientType.TO, toAddr);
	            message.setSubject(subject);
	            message.setText(body);

	            Transport.send(message);

	            result = true;
	        } catch (MessagingException mex) {
	            mex.printStackTrace();
	        }

	        return result;
	    }
}
