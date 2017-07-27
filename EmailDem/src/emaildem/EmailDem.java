/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emaildem;

import javax.mail.MessagingException;

/**
 *
 * @author Carlos
 */
public class EmailDem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MessagingException {
   String[] to = {"cymcarlos17@gmail.com","admin@snehits.com"};
        
          if (EMail.sedMail
           ("cymcarlos17@gmail.com",
                   "cym171112",
                   "message to reciepents",
                   to))System.out.println("correo correcto");
          else System.out.println("error de correo");
    }
}

                   
        
                
                
                
 
    