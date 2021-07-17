public class Fornecedor extends PessoaJuridica {
    private String responsavel;
    private String observacao;

    public Fornecedor(Integer id, String nome, String endereco, String telefone, String cnpj, String incricaoestadual, String cnae) {
        super(id, nome, endereco, telefone, cnpj, incricaoestadual, cnae);
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
