
package petshop;
public class Pessoa {
    private String name;
    private String endereco;
    private String cpf;
    private String numeroCelular;
    private int id = 0;
    
    
    public Pessoa(String name, String endereco, String cpf, String numeroCelular){
        this.name = name;
        this.endereco = endereco;
        this.cpf = cpf;
        this.numeroCelular = numeroCelular;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public String toString() {
        return name+ ", " + endereco+ ", " + cpf+ ", "+ numeroCelular;
    }
    
}
