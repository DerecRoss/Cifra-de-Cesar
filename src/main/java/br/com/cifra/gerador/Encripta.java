package br.com.cifra.gerador;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Encripta {
    private static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";
    private static final String ALFABETO_ENCRIPTADO = "defghijklmnopqrstuvwxyzabc";


    @org.jetbrains.annotations.NotNull
    /*private String @NotNull [] guardarTexto(String texto){
        texto.toLowerCase();
        String[] textoArray = texto.split("");
        return textoArray;
    }*/

    // algoritmo antigo.

    public String encriptaTexto(@NotNull String texto){
        texto.toLowerCase();
        StringBuilder msgEncriptado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char msgNaoEncriptado = texto.charAt(i);
            int posicao = ALFABETO.indexOf(msgNaoEncriptado);
            if (posicao != -1){
                char charEncripitado = ALFABETO_ENCRIPTADO.charAt(posicao);
                msgEncriptado.append(charEncripitado);
            }else {
                msgEncriptado.append(msgNaoEncriptado);
            }
        }
        return msgEncriptado.toString();
    }

    public String exibeEncripta(String texto){
        return encriptaTexto(texto);
    }
}
