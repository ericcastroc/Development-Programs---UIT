/* Crie a classe Boleto com os atributos vencimento, valor, desconto, um booleano se está pago e nome do cliente. 
Crie um construtor para que todos dados sejam passados no momento da instanciação dos objetos. 
Crie um método que retorne o valor líquido do boleto. Crie também um método pagar que altera o boleto para pago. */ 

public class Boleto {
    
    private int vencimento;
    private double valor;
    private int desconto;
    private boolean pagamento;
    private String nome;

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getDesconto() {
        return desconto;
    }
    
    public void setDesconto(int desconto) {
        if(desconto>0 && desconto <= 100){
        this.desconto = desconto;
        }
    }

    public Boolean getPagamento() {
        return pagamento;
    }

    public void pagar(int valor){
        if(valor == 1){
            pagamento=true;
        }else if(valor == 0){
            pagamento=false;
        }
        
    }

     public void resultado(){
        if(pagamento==true){
            System.out.println("Estado do pagamento: Pago");
        }else{
            System.out.println("Estado do pagamento: Em Atraso");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String imprimeDetalhe(){
        return "Nome:" + getNome() +
               "\nValor do Boleto: " + getValor() +
               "\nO desconto foi de " + getDesconto() + "%";
    }
}
