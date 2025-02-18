public class ImprimindoVariaveis {
    public static void main(String[] args){
        // Cometário de uma única linha

        /*
        Comentario mais de uma Linha
         */

        /***
         * Comentario de Documentação
         * @param args paramentro de entrada do metodo main
         */
        System.out.println("Dados impressos");
        /*
        Para criar a variável,
            1º O tipo da variável // ex: int, float, boolean, chat, byte, shor, long
            2º O indentificador / nome da variável // ex: idade
            3º Iniciar uma varável usando o "=" // ex: = 10
         */
        int idade = 10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = '\u0041'; //2 Bytes
        String nome = "Lucas";
        // Para exibir a váriavel
        System.out.println(idade);
        System.out.println(caractere);
    }
}
