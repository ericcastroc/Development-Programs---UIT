public enum EnumSexo{

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String descricao;

    EnumSexo(String descricao ){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
