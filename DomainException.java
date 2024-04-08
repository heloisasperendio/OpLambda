package org.example;

import java.io.Serializable;

public class DomainException extends Throwable implements Serializable {
private static final long serialVersionUID = 1L;

public DomainException (String msg){
    super(msg);
    //permite que eu possa instanciar a minha DomainException(excecao personalizada) passando uma MENSAGEM pra ela (fica armazenada dentro da excecao)

}

}
