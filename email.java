System.out.println("Start");
        final String username = "myemail@gmail.com";
        final String password = "************";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

         Session session = Session.getInstance(props,
                  new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                  });


        try {
            Transport transport=session.getTransport();
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("myemail@gmail.com"));//formBean.getString("fromEmail")
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("myemail@gmail.com"));
            message.setSubject("subject");//formBean.getString(
            message.setText("mailBody");
            transport.connect();
            transport.send(message, InternetAddress.parse("myemail@gmail.com"));//(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            System.out.println("e="+e);
            e.printStackTrace();
            throw new RuntimeException(e);

        }