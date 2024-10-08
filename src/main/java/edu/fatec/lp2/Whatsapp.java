package edu.fatec.lp2;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public void listarContatos()
    {
        for (Contatinho contato : contatos)
            System.out.println(contato.nome);
    }

    public void listarMensagens()
    {
        for (Mensagem mensagem : mensagens)
            System.out.println(mensagem.conteudo);
    }
    
}
