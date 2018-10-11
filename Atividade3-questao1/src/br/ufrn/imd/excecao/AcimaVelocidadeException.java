package br.ufrn.imd.excecao;

public class AcimaVelocidadeException extends Exception{

    public String getMessage(){
        return "Excedeu a velocidade máxima!";
    }

}
