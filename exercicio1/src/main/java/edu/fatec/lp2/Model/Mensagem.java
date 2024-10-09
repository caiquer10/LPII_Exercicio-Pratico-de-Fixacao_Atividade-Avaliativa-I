package edu.fatec.lp2.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho destinatario, String conteudo)
    {
        this.destinatario = destinatario;
        this.horaEnvio = this.getTime();
        this.conteudo = conteudo;
    }

    private String getTime()
    {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formata = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return now.format(formata);
    }

    public String getConteudo()
    {
        return conteudo;
    }

    public abstract Mensagem sendMessage(String conteudo);

}