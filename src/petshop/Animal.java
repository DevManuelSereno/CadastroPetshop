package petshop;

public class Animal {
    private String name;
    private String raca;
    private String porteDoAnimal;
    private String animal;

    public Animal(String name, String raca, String porteDoAnimal, String animal) {
        this.name = name;
        this.raca = raca;
        this.porteDoAnimal = porteDoAnimal;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorteDoAnimal() {
        return porteDoAnimal;
    }

    public void setPorteDoAnimal(String porteDoAnimal) {
        this.porteDoAnimal = porteDoAnimal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
    
    @Override // Retornar animal
    public String toString() {
        return name+ ", " + raca+ ", " + porteDoAnimal+ ", "+ animal;
    }
}
