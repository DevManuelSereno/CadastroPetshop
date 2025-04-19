
package petshop;
public class Funcionario extends Pessoa{
    private String cargo;
    private String senhaADM = "123456";

    public Funcionario(String cargo, String name, String endereco, String cpf, String numeroCelular) {
        super(name, endereco, cpf, numeroCelular);
        this.cargo = cargo;

    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenhaADM() {
        return senhaADM;
    }

    public void setsenhaADM(String senhaADM) {
        this.senhaADM = senhaADM;
    }
    
    
}
