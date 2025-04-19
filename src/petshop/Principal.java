package petshop;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        int varMenu; // variavel do menu
        PetShop petShop = new PetShop(); // cria objeto de PetShop
        Cliente cliente; // cria objeta de Cliente para quando precisar adicionar algum cliente ao bando de dados
        do{
            Scanner leitor = new Scanner(System.in); // cria objeto de Scanner
            // MENU
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar cadastros");
            System.out.println("3 - Buscar");
            System.out.println("4 - Atualizar ou remover cadastro");
            System.out.println("5 - Marcar horarios");
            System.out.println("6 - Listar horarios");
            System.out.println("7 - Vender produto");
            System.out.println("9 - Sair");
            System.out.print("Digite a opção: ");
            varMenu = leitor.nextInt();
            

            switch(varMenu){
                case 1: 
                    int cadastro;
                do{
                    System.out.println("1 - Cadastrar cliente");
                    System.out.println("2 - Cadastrar funcionario");
                    System.out.println("3 - voltar");
                    cadastro = leitor.nextInt();
                        switch(cadastro){
                            case 1:
                            // cadastro do cliente
                                // variaveis do animal
                                String nameAnimal;
                                String raca;
                                String porteDoAnimal;
                                String animal;
    
                                // variaveis do cliente
                                String nameCliente,enderecoCliente,numeroCelularCliente,cpfCliente;
    
                                // cadastrando cliente
                                System.out.println("****************** Registro do cliente ******************");
                                leitor.nextLine();
                                System.out.println("Digite o nome do cliente");
                                nameCliente = leitor.nextLine();
                                System.out.println("Digite o endereço do cliente");
                                enderecoCliente = leitor.nextLine();
                                System.out.println("Digite o CPF do cliente");
                                cpfCliente = leitor.nextLine();
                                System.out.println("Digite o número de celular do cliente");
                                numeroCelularCliente = leitor.nextLine();
    
                                // Cadastrando animal do cliente
                                System.out.println("Digite o tipo do animal");
                                animal = leitor.nextLine();
                                System.out.println("Digite o nome do "+animal);
                                nameAnimal = leitor.nextLine();
                                System.out.println("Digite a raça de "+nameAnimal);
                                raca = leitor.nextLine();
                                System.out.println("Digite o porte do "+nameAnimal);
                                porteDoAnimal = leitor.nextLine();
    
                                Animal anima = new Animal(nameAnimal, raca, porteDoAnimal, animal); // cria um animal
                            
    
                                // adicionando cliente no banco de dados
                                cliente = new Cliente(nameCliente,enderecoCliente,cpfCliente,numeroCelularCliente);
                                cliente.setAnimal(anima);// Adiciona o animal do cliente
                                petShop.cadastrarCliente(cliente);
                                break;
                            case 2:
                            // cadastrar funcionarios
                                // variaveis do funcionario
                                String nameFuncionario,enderecoFuncionario, numeroCelularFuncionario, cargoFuncionario,cpfFuncionario;
    
                                // cadastrando funcionario
                                System.out.println("****************** Registro do funcionario ******************");
                                leitor.nextLine();
                                System.out.println("Digite o nome do funcionario");
                                nameFuncionario = leitor.nextLine();
                                System.out.println("Digite o endereço do funcionario");
                                enderecoFuncionario = leitor.nextLine();
                                System.out.println("Digite o CPF do funcionario");
                                cpfFuncionario = leitor.nextLine();
                                System.out.println("Digite o número de celular do funcionario");
                                numeroCelularFuncionario = leitor.nextLine();
                                System.out.println("Digite o cargo do funcionario");
                                cargoFuncionario = leitor.nextLine();
                                Funcionario funcionario = new Funcionario(cargoFuncionario, nameFuncionario, enderecoFuncionario, cpfFuncionario, numeroCelularFuncionario);
                                petShop.cadastrarFuncionario(funcionario);
                                break;
                            case 3:
                                //Sair
                                break;
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                }while(cadastro != 3);
                    break;

                case 2: 
                    int lista;
                    do{
                    System.out.println("1 - Listar clientes");
                    System.out.println("2 - Listar funcionarios");
                    System.out.println("3 - Voltar");
                    System.out.println("Digite a opção:");
                    lista = leitor.nextInt();
                    switch(lista){
                        case 1:
                        // imprimir lista de clientes
                            petShop.imprimirCliente();
                            break;
                        case 2:
                        // imprimir lista de funcionarios
                            petShop.imprimirFuncionario();
                            break;
                        case 3:
                            //sair
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                }while(lista != 3);
                    break;
                
                case 3:
                    int busca;
                    System.out.println("\n");
                    System.out.println("1 - Nome");
                    System.out.println("2 - CPF");
                    System.out.println("3 - Numero de celular");
                    System.out.println("4 - Voltar");
                    System.out.println("Qual forma de busca: ");
                    busca = leitor.nextInt();
                    switch(busca){
                        case 1:
                            String nome;
                            System.out.println("Digite o nome: ");
                            nome = leitor.nextLine();
                            nome = leitor.nextLine();
                            petShop.buscarNome(nome);
                            break;
                        case 2:
                            String cpf;
                            System.out.println("Digite o CPF: ");
                            cpf = leitor.nextLine();
                            cpf = leitor.nextLine();
                            petShop.buscarCpf(cpf);
                            break;
                        case 3:
                            String numeroCelular;
                            System.out.println("Digite o numero do Celular: ");
                            numeroCelular = leitor.nextLine();
                            numeroCelular = leitor.nextLine();
                            petShop.buscarNumeroCelular(numeroCelular);
                            break;    
                    }
                    break;
                    case 4:
                    
                        boolean attRemove = true;
                        do{
                            int opcao;
                        System.out.println("1 - Atualizar");
                        System.out.println("2 - Remover");
                        System.out.println("3 - Voltar");
                        opcao = leitor.nextInt();
                        switch(opcao){
                            case 1:
                                attRemove = false;
                                int mudar;
                                do{
                                System.out.println("1 - Endereço");
                                System.out.println("2 - Numero celular");
                                System.out.println("3 - Voltar");
                                System.out.println("O que deseja mudar: ");
                                mudar = leitor.nextInt();
                                switch(mudar){
                                    case 1:
                                        String cpfEndereco, endereco;
                                        System.out.println("Digite o CPF de quem deseja mudar: ");
                                        cpfEndereco = leitor.nextLine();
                                        cpfEndereco = leitor.nextLine();
                                        System.out.println("Digite o novo endereço: ");
                                        endereco = leitor.nextLine();
                                        petShop.mudarEndereco(cpfEndereco, endereco);
                                        break;
                                    case 2:
                                        String cpfNCelular, numeroCelular;
                                        System.out.println("Digite o CPF de quem deseja mudar: ");
                                        cpfNCelular = leitor.nextLine();
                                        cpfNCelular = leitor.nextLine();
                                        System.out.println("Digite o novo numero de celular: ");
                                        numeroCelular = leitor.nextLine();
                                        petShop.mudarNumeroCelular(cpfNCelular, numeroCelular);
                                        break;
                                    case 3:
                                        // Sair
                                        break;
                                    default:
                                        System.out.println("Opação inválida");
                                        break;
                                }
                                }while(mudar != 3);
                                break; // opção 1

                            case 2:
                                attRemove = false;
                                String cpf;
                                System.out.println("Digite o CPF de quem deseja remover: ");
                                cpf = leitor.nextLine();
                                cpf = leitor.nextLine();
                                petShop.removerPessoa(cpf);

                                break; // opção 2
                            case 3:
                                // Voltar
                                attRemove = false;
                                break;// opção 3
                            default:
                                System.out.println("Opção Inválida");
                                break;// Default
                            }
                        
                        }while(attRemove);


                    break; // opção 4 do menu
                case 5:
                    //Fazer reservas
                    String cpfReserva;
                    System.out.println("Digite o cpf do cliente");
                    cpfReserva = leitor. nextLine();
                    cpfReserva = leitor. nextLine();
                    petShop.fazerReserva(cpfReserva);
                    break; // opção 5 do menu

                case 6:
                    //Listar reservas
                    petShop.listarReservas();
                    break; // opção 6 do menu

                case 7:
                        petShop.venderProduto();
                    break; // opção 7 do menu







                case 9:break;// encerrar o programa
                default:
                    System.out.println("\nComando inválido\n");
                    break;
            }

        }while(varMenu != 9);
            
    }

}