/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;




/**
 *
 * @author Guacha
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MessagingException {
        String nepe = "nepe";
        String[] nepe2 = nepe.split("aeiou");
        for (String string : nepe2) {
            System.out.println(string);
        }

//        String para = "ruthder46@gmail.com";
//        String de = "olakasepruevita@gmail.com";
//        String pass = "tuPutaMadre1409";
//        String host = "smtp.gmail.com";
//        
//        Properties props = new Properties();
//        
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.auth", true);
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.port", "465");
//        
//        Session sesion = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(de, pass);
//            }
//        });
        
//        try {
//            
//            
//            for (int i = 0; i < 10; i++) {
//                MimeMessage mensaje = new MimeMessage(sesion);
//                mensaje.setFrom(new InternetAddress(de));
//                mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(para));
//                mensaje.setSubject("OlaKase C masturba o k ase no. " + i);
//                mensaje.setText("Esto es una prueba xdxdxdxdxdxdxdxd, sufriras por " + (9-i) + "mensajes");
//                Transport.send(mensaje);
//            }
//            
//            
//            
//            System.out.println("Correo Enviado!");
//        } catch (MessagingException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }

        TestFrame tf = new TestFrame();
        tf.setVisible(true);
        
        tf.getJbutton1().addActionListener((ActionEvent ae) -> {
            //System.out.println("NEPE!");
        });
        
    }
    
}
