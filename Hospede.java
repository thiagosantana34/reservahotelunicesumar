public class Hospede {
    private int codigo;
    private String nome;
    private String endereco;
    private int idade;

    public Hospede(int codigo, String nome, String endereco, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public Hospede() {
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void exibir(){
        System.out.println("Código: "+getCodigo() + "\nNome: "+getNome()+"\nEndereço: "+getEndereco() + "\nIdade: "+getIdade());
    }

}