
package petshop;

public class Cliente extends Pessoa{
    Animal animal;
    boolean reserva;
    Servico tipoReserva;
    int horariodeReserva;
    public Cliente(String name, String endereco, String cpf, String numeroCelular) {
        super(name, endereco, cpf, numeroCelular);
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public boolean getReserva() {
        return reserva;
    }
    
    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public int getHorarioDeReserva() {
        return horariodeReserva;
    }

    public void setHorarioDeReserva(int horariodeReserva) {
        this.horariodeReserva = horariodeReserva;
    }

    public String getTipoReserva() {
        return tipoReserva.getTipoDeReserva();
    }

    public void setTipoReserva(String tipoReserva) {
        Servico reser = new Servico(tipoReserva);
        this.tipoReserva = reser;
    }
    
}
