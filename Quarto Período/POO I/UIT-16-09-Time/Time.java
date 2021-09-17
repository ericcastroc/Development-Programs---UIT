/* Crie a classe Time que possua o nome do time, a série que ele joga e o 
número de jogadores. As séries podem ser de A, B, C, D ouE. O números de 
jogadores é no máximo 22. Crie um construtor onde seja obrigatório inserir 
no momento da criação da instância o nome e a série do time. Faça o teste 
em outra classe cadastrando 2 times. */

public class Time {

    private String nome;
    private String serie;
    private int numeroDeJogadores;

    private static int numeroMaximoJogadores = 22;


    public Time(String nome, String serie) {
        this.nome = nome;
        this.setSerie(serie);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        serie=serie.toUpperCase();
        if(serie.charAt(0)>='A' && serie.charAt(0)<='E'){
            this.serie = serie;
        }else{
            System.out.println("Não existe essa Serie. Somente A, B, C, D ou E");
        }
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public void setNumeroDeJogadores(int numeroDeJogadores) {
        if(numeroDeJogadores<=numeroMaximoJogadores){
            this.numeroDeJogadores = numeroDeJogadores;
        }else{
            System.out.println("Quantidade maxima de jogadores e 22");
        }       
    }

    public String imprimeDetalhe(){
        return "\nNome do Time:" +getNome() +
               "\nSerie em que ele joga:" + getSerie() +
               "\nNumero de jogadores:" +getNumeroDeJogadores() + "\n\n";
    }
}
