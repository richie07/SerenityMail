package net.serenity.bdd.junit.cucumber.model;

public class ComposeData {
    private String usuario;
    private String password;
    private String toEmail;
    private String body;
    private String subject;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAll(String usuario,String password,String toEmail,String subject,String body){
        this.body = body;
        this.password = password;
        this.subject = subject;
        this.usuario = usuario;
        this.toEmail = toEmail;
    }
}
