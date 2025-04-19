package petshop;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PetShop {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();// lista de clientes
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(); // lista dos funcionasta de clientesrios
    private ArrayList<Integer> reservas = new ArrayList<Integer>(); // lista dos horarios para reservas
    private int caixa;

    public PetShop(){ 
        this.iniciaPessoas();
        this.horarioDisponivel();
    }

    Scanner leitor = new Scanner(System.in); //leitor
    private void iniciaPessoas(){
        // Cadastra automaticamente 7 pessoas no ArrayList de funcionarios
        Funcionario Abigail = new Funcionario("Vendedor", "Abigail", "Boa Vista", "91626680051", "(84)98041-5552");
        Funcionario Renan = new Funcionario("Recepcionista", "Renan", "Dom Pedro II", "13413734016", "(83) 97980-4554");
        Funcionario Zoey = new Funcionario("Administrador", "Zoey", "Duque de Caxias", "67802238080", "(91) 99192-3957");
        Funcionario Marly = new Funcionario("Banhista ", "Marly", "Piauí", "16004941026", "(84)98041-5552");
        Funcionario Inez = new Funcionario("tosador", "Inez", "São Francisco", "75408584003", "(83) 97980-4554");
        Funcionario Katherine = new Funcionario("Banhista", "Katherine", "Santa Catarina", "23185416040", "(63) 97111-3823");
        Funcionario Raphael  = new Funcionario("Veterinário", "Raphael ", "São Francisco", "86129427050", "(49) 98027-8810");
        funcionarios.add(Abigail);
        funcionarios.add(Renan);
        funcionarios.add(Zoey);
        funcionarios.add(Marly);
        funcionarios.add(Inez);
        funcionarios.add(Katherine);
        funcionarios.add(Raphael);


        // Cadastra automaticamente 7 pessoas no ArrayList de Clientes
        Animal Stewie = new Animal("Stewie", "Akita", "Medio", "Cachorro");// registrando animal
        Cliente Nancy = new Cliente("Nancy", "São João","111","(99) 98436-3345"); // registra cliente
        Nancy.setAnimal(Stewie); // adiciona o animal no cadastro do cliente
        Animal Pluto = new Animal("Pluto", "American bully", "Grande", "Cachorro");// registrando animal
        Cliente Eric  = new Cliente("Éric", "São Cristóvão","09663336595","(95) 99614-9071"); // registra cliente
        Eric.setAnimal(Pluto); // adiciona o animal no cadastro do cliente
        Animal Elf = new Animal("Elf", "Siamês", "Pequeno", "Gato");// registrando animal
        Cliente Jia   = new Cliente("Jia ", "Planalto","222","(88) 98447-3434"); // registra cliente
        Jia.setAnimal(Elf); // adiciona o animal no cadastro do cliente
        Animal Fuzzy = new Animal("Fuzzy", "Twister", "Pequeno", "Roedor");// registrando animal
        Cliente Edson    = new Cliente("Edson", "Industrial","333","(33) 99325-1195"); // registra cliente
        Edson.setAnimal(Fuzzy); // adiciona o animal no cadastro do cliente
        Animal Olaf = new Animal("Olaf", "Persa", "Pequeno", "Gato");// registrando animal
        Cliente Nelia = new Cliente("Nélia", "Vila Nova","02146890002","(67) 98385-3110"); // registra cliente
        Nelia.setAnimal(Olaf); // adiciona o animal no cadastro do cliente
        Animal Bingo = new Animal("Bingo", "Arara-vermelha", "pequeno", "Arara");// registrando animal
        Cliente Ayumi   = new Cliente("Ayumi", "Centro","84793724000","(99) 97289-4735"); // registra cliente
        Ayumi.setAnimal(Bingo); // adiciona o animal no cadastro do cliente
        Animal Rex = new Animal("Rex", "Rex", "Médio", "Coelho");// registrando animal
        Cliente Anaisa    = new Cliente("Anaisa", "Santo Antônio","18240768008","(82) 98332-6147"); // registra cliente
        Anaisa.setAnimal(Rex); // adiciona o animal no cadastro do cliente
        clientes.add(Nancy);
        clientes.add(Eric);
        clientes.add(Jia);
        clientes.add(Edson);
        clientes.add(Nelia);
        clientes.add(Ayumi);
        clientes.add(Anaisa);

    }
    private void horarioDisponivel(){
        // Cadastra horarios para reservas
        reservas.add(9);
        reservas.add(10);
        reservas.add(11);
        reservas.add(12);
        reservas.add(13);
        reservas.add(14);
        reservas.add(15);
        reservas.add(16);
        reservas.add(17);
    }

    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cliente registrado com sucesso!! \n");
    }
    public void cadastrarFuncionario(Funcionario funcionario){
        int contaErro =0;
        String senha, senhaADM;
        boolean senhaCerta = true;
        senhaADM = funcionario.getSenhaADM();
        do{
            System.out.println("Digite a senha do administrador: ");
                senha = leitor.nextLine();
            if(senha.equals(senhaADM)){
                System.out.println("\n");
                funcionarios.add(funcionario);
                System.out.println("Funcionario registrado com sucesso!! \n");
                senhaCerta = false;
            }
            else{
                System.out.println("Senha invalida");
                contaErro++;
                if(contaErro == 3){ // conta quantidades de tentativas com senha errada
                    System.out.println("Você excedeu o limite de tentativa");
                    break; // dps de 3 tentativas erradas ele cancela o cadastro
                }
            }
        }while(senhaCerta);



    }
    
    public void imprimirCliente(){
        ArrayList<String> nome = new ArrayList<String>(); // Cria ArrayList dos nomes

        for(int i=0;i<clientes.size();i++){ // pega os nomes dos clientes e adiciona a arraylist
            nome.add(clientes.get(i).getName());
        }
        Collections.sort(nome, Collator.getInstance()); // Ordena os nomes
        for (int i = 0; i < clientes.size(); i++) {
            this.buscarNome(nome.get(i)); // imprime os clientes de forma ordenada
		}
        

    }

    public void imprimirFuncionario(){
        ArrayList<String> nome = new ArrayList<String>(); // Cria ArrayList dos nomes

        for(int i=0;i<funcionarios.size();i++){ // pega os nomes dos funcionarios e adiciona a arraylist
            nome.add(funcionarios.get(i).getName());
        }
        Collections.sort(nome, Collator.getInstance()); // Ordena os nomes
        for (int i = 0; i < funcionarios.size(); i++) {
            this.buscarNome(nome.get(i)); // imprime os funcionarios de forma ordenada
		}

    }

    public void buscarNome(String nome){
        int falha =0;
        for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getName().equals(nome)){
                System.out.println(
                    "\n nome: "+funcionarios.get(i).getName()+ ", "+
                    "Endereço: "+funcionarios.get(i).getEndereco()+ ", "+
                    "Cargo: "+funcionarios.get(i).getCargo()
                );
                falha++;
            }

		}
        for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getName().equals(nome)){
                System.out.println(
                    "\n Nome: "+clientes.get(i).getName()+ ", "+
                    "Endereço: "+clientes.get(i).getEndereco()+" - "+
                    "Nome do animal: "+clientes.get(i).getAnimal().getName()
                );
                falha++;
            }

		}
        if(falha == 0){
            System.out.println("Pessoa não encontrada");
        }
    }

    public void buscarCpf(String cpf){
        int falha =0;
        for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getCpf().equals(cpf)){
                System.out.println(
                    "\n nome: "+funcionarios.get(i).getName()+ ", "+
                    "Endereço: "+funcionarios.get(i).getEndereco()+ ", "+
                    "Cargo: "+funcionarios.get(i).getCargo()
                );
                falha++;
            }

		}
        for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getCpf().equals(cpf)){
                System.out.println(
                    "\n Nome: "+clientes.get(i).getName()+ ", "+
                    "Endereço: "+clientes.get(i).getEndereco()+" - "+
                    "Nome do animal: "+clientes.get(i).getAnimal().getName()
                );
                falha++;
            }

		}
        if(falha == 0){
            System.out.println("Pessoa não encontrada");
        }
    }

    public void removerPessoa(String cpf){
        int falha =0;
        for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getCpf().equals(cpf)){
                int remover;
                boolean confirmacao = true;
                do{
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    System.out.println("Deseja realmente remover o funcionario "+ funcionarios.get(i).getName()+"? ");
                    remover = leitor.nextInt();
                    switch(remover){
                        case 1:
                        funcionarios.remove(funcionarios.get(i));
                            System.out.println("Funcionario removido com sucesso!");
                            confirmacao = false;
                            break; // opção 1
                        case 2:
                            System.out.println("Remoção Cancelada");
                            confirmacao = false;
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    } while(confirmacao);
                falha++;
            }

		}
        for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getCpf().equals(cpf)){
                int remover;
                boolean confirmacao = true;
                do{
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                System.out.println("Deseja realmente remover o cliente "+ clientes.get(i).getName()+"? ");
                remover = leitor.nextInt();
                switch(remover){
                    case 1:
                    clientes.remove(clientes.get(i));
                        System.out.println("Cliente removido com sucesso!");
                        confirmacao = false;
                        break; // opção 1
                    case 2:
                        System.out.println("Remoção Cancelada");
                        confirmacao = false;
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
                } while(confirmacao);
                falha++;
            }

		}
        if(falha == 0){
            System.out.println("Pessoa não encontrada");
        }
    }

    public void buscarNumeroCelular(String numeroCelular){
        int falha =0;
        for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getNumeroCelular().equals(numeroCelular)){
                System.out.println(
                    "\n nome: "+funcionarios.get(i).getName()+ ", "+
                    "Endereço: "+funcionarios.get(i).getEndereco()+ ", "+
                    "Cargo: "+funcionarios.get(i).getCargo()
                );
                falha++;
            }

		}
        for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getNumeroCelular().equals(numeroCelular)){
                System.out.println(
                    "\n Nome: "+clientes.get(i).getName()+ ", "+
                    "Endereço: "+clientes.get(i).getEndereco()+" - "+
                    "Nome do animal: "+clientes.get(i).getAnimal().getName()
                );
                falha++;
            }

		}
        if(falha == 0){
            System.out.println("Pessoa não encontrada");
        }
    }

    public void mudarNumeroCelular(String cpf,String numeroCelular){
        int falha =0;
        for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getCpf().equals(cpf)){
                funcionarios.get(i).setNumeroCelular(numeroCelular);
                falha++;
            }

		}
        for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getCpf().equals(cpf)){
                clientes.get(i).setNumeroCelular(numeroCelular);
                falha++;
            }

		}
        if(falha == 0){
            System.out.println("Pessoa não encontrada");
        }
    }

    public void mudarEndereco(String cpf, String endereco){
        int falha =0;
        for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getCpf().equals(cpf)){
                funcionarios.get(i).setEndereco(endereco);
                falha++;
            }

		}
        for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getCpf().equals(cpf)){
                clientes.get(i).setEndereco(endereco);
                falha++;
            }

		}
        if(falha == 0){
            System.out.println("Pessoa não encontrada");
        }
    }

    public void fazerReserva(String cpf){
        int falha =0;
        int horario;
        int menu;
        for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getCpf().equals(cpf)){
                falha++;
                System.out.println("1 - Banho");
                System.out.println("2 - Tosa");
                System.out.println("3 - veterinario");
                System.out.println("4 - Cancelar");
                System.out.println("Qual serviço gostaria de reservar:");
                menu = leitor.nextInt();
                switch(menu){
                    case 1:
                        System.out.print("Horarios disponiveis: ");
                        for (int j = 0; j < reservas.size(); j++) {
                            if(j == (reservas.size() - 1)){
                                System.out.println(reservas.get(j)+"h");
                            }else{
                                System.out.print(reservas.get(j)+"h , ");
                            }
                        }
                        System.out.print("Qual horario deseja reservar: ");
                        horario = leitor.nextInt();
                        for (int k = 0; k < reservas.size(); k++) {
                            if(horario == reservas.get(k)){
                                clientes.get(i).setHorarioDeReserva(horario);
                                clientes.get(i).setReserva(true);
                                clientes.get(i).setTipoReserva("Banho");
                                reservas.remove(k);
                                System.out.println("Horario reservado");
                            }
                        }
                        if(!clientes.get(i).getReserva()){
                            System.out.println("Horario não disponível");
                        }

                        break;
                    case 2:
                        System.out.print("Horarios disponiveis: ");
                        for (int j = 0; j < reservas.size(); j++) {
                            if(j == (reservas.size() - 1)){
                                System.out.println(reservas.get(j)+"h");
                            }else{
                                System.out.print(reservas.get(j)+"h , ");
                            }
                        }
                        System.out.print("Qual horario deseja reservar: ");
                        horario = leitor.nextInt();
                        for (int k = 0; k < reservas.size(); k++) {
                            if(horario == reservas.get(k)){
                                clientes.get(i).setHorarioDeReserva(horario);
                                clientes.get(i).setReserva(true);
                                clientes.get(i).setTipoReserva("Tosa");
                                reservas.remove(k);
                                System.out.println("Horario reservado");
                            }
                        }
                        if(!clientes.get(i).getReserva()){
                            System.out.println("Horario não disponível");
                        }

                        break;
                    case 3:
                        System.out.print("Horarios disponiveis: ");
                        for (int j = 0; j < reservas.size(); j++) {
                            if(j == (reservas.size() - 1)){
                                System.out.println(reservas.get(j)+"h");
                            }else{
                                System.out.print(reservas.get(j)+"h , ");
                            }
                        }
                        System.out.print("Qual horario deseja reservar: ");
                        horario = leitor.nextInt();
                        for (int k = 0; k < reservas.size(); k++) {
                            if(horario == reservas.get(k)){
                                clientes.get(i).setHorarioDeReserva(horario);
                                clientes.get(i).setReserva(true);
                                clientes.get(i).setTipoReserva("Veterinario");
                                reservas.remove(k);
                                System.out.println("Horario reservado");
                            }
                        }
                        if(!clientes.get(i).getReserva()){
                            System.out.println("Horario não disponível");
                        }

                        break;
                }
            }

		}
        if(falha == 0){
            System.out.println("Cliente não encontrada");
        }
    }
    public void listarReservas(){
        System.out.println("\n");
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getReserva()){
                System.out.println("O animal de "+ clientes.get(i).getName()+ " tem reserva às: "+ clientes.get(i).getHorarioDeReserva() +"h de "+ clientes.get(i).getTipoReserva());
            }
		}
        System.out.println("\n");
    }

    public void venderProduto() {
        Scanner leitor = new Scanner(System.in); //leitor
        String produto;
        int formaPagamento;
        double preco,dinheiro;
        System.out.println("Qual produto vai ser vendido: ");
        produto = leitor.nextLine();
        System.out.println("Qual o preço do produto");
        preco = leitor.nextInt();
        System.out.println("1 - Cartão");
        System.out.println("2 - Pix");
        System.out.println("3 - Dinheiro");
        System.out.println("4 - Cancelar");
        System.out.println("Qual a forma de pagamento:");
        formaPagamento = leitor.nextInt();
        switch (formaPagamento) {
            case 1:
                System.out.println("Compra de "+ produto + " computada");
                System.out.println("\nInsira o cartão na maquininha\n");
                caixa += preco;
                break;
            case 2:
            System.out.println("Compra de "+ produto + " computada");
                caixa += preco;
                break;
            case 3:
                boolean pagamento = true;
                do{
                    System.out.println("Insira o dinheiro recebido");
                    dinheiro = leitor.nextDouble();
                    if(dinheiro >= preco){
                        System.out.println("O troco é de: " + (dinheiro - preco));
                        pagamento = false;
                        caixa += preco;
                        System.out.println("Compra de "+ produto + " computada");
                    }else{
                        System.out.println("Valor insuficiente");
                    }
                }while(pagamento);
            break;
            case 4:
                System.out.println("Compra cancelada");
            default:
                System.out.println("Opção inválida");
                break;
        }
        
    }

    
}