import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               
        Scanner EntradaValor = new Scanner(System.in);
        Scanner EntradaTexto = new Scanner(System.in);
        Scanner EntradaEndereco = new Scanner(System.in);
        Scanner EntradaReal = new Scanner(System.in);
        int op = 0;
        ArrayList<Hospede> listaHospede = new ArrayList<>();
        ArrayList<Suite> listaSuite = new ArrayList<>();
        ArrayList<Reserva> listaReserva = new ArrayList<>();
        
        Suite suite;
        Hospede hospede;
        Reserva reserva = new Reserva();
        do{
            menu();
            op = EntradaValor.nextInt();
            System.out.println("\n____________________________________________________");
            switch(op){
                case 1:
                    suite = new Suite();
                    System.out.println("\nCadastro de Suite\n");
                    System.out.print("Informe o numero da Suite: ");
                    suite.setNumero(EntradaValor.nextInt());
                    
                    System.out.print("Informe o Tipo da Suite: ");
                    suite.setTipo(EntradaTexto.next());
                    
                    System.out.print("Informe a Capacidade da Suite: ");
                    suite.setCapacidade(EntradaValor.nextInt());
                    
                    System.out.print("Informe o Valor da Diaria da Suite: ");
                    suite.setValorDiaria(EntradaReal.nextDouble());
                    
                    
                    System.out.println("Suite Cadastrado com Sucesso");
                    listaSuite.add(suite);
                    
                    
                break;
                case 2:
                    hospede = new Hospede();
                    System.out.print("Informe o Código do Hospede: ");
                    hospede.setCodigo(EntradaValor.nextInt());
                    
                    System.out.print("Informe o Nome do Hospede: ");
                    hospede.setNome(EntradaTexto.next());
                    
                    System.out.print("Informe o Endereço do Hospede: ");
                    hospede.setEndereco(EntradaEndereco.nextLine());
                    
                    System.out.print("Informe a idade do Hospede: ");
                    hospede.setIdade(EntradaValor.nextInt());
                    
                    System.out.println("Hospede Cadastrado com Sucesso");
                    listaHospede.add(hospede);
                    
                break;
                case 3:
                    suite = new Suite();
                    hospede = new Hospede();
                    int qtdPessoa = 0, qtdDias, cont = 0;
                    
                    if(listaSuite.size() > 0 && listaHospede.size() > 0){
                        System.out.println("Hospede Cadastrado no Sistemas");
                        System.out.println("===================================");
                        for (int i = 0; i < listaHospede.size(); i++) {
                            listaHospede.get(i).exibir();
                            
                        }
                        System.out.println("===================================");
                        System.out.print("Informe o Código do Hospede: ");
                        hospede.setCodigo(EntradaValor.nextInt());
                        
                         for (int i = 0; i < listaHospede.size(); i++) {
                             if(listaHospede.get(i).getCodigo() == hospede.getCodigo()){
                                 hospede = listaHospede.get(i);
                                 cont = 1;
                             }
                         }
                        if(cont == 1){
                            cont = 0;
                            
                            System.out.println("Suíte Cadastrado no Sistema: ");
                            System.out.println("\n===================================\n");
                            for (int i = 0; i < listaSuite.size(); i++) {

                                listaSuite.get(i).exibir();
                                System.out.println("===================================");
                            }
                            System.out.println("Informe o numero da Suite");
                            suite.setNumero(EntradaValor.nextInt());

                            for (int i = 0; i < listaSuite.size(); i++) {                            
                                if(listaSuite.get(i).getNumero() == suite.getNumero()){
                                     suite = listaSuite.get(i);
                                     cont = 1;
                                 }
                            }

                            if(cont == 1){
                                System.out.println("\n===================================\n");

                                System.out.print("Informe a Quantidade de Pessoa: ");
                                qtdPessoa =  EntradaValor.nextInt();

                                System.out.print("Informe a Quantidade de Dias: ");
                                qtdDias =  EntradaValor.nextInt();

                                reserva.Cadastrar(qtdDias, qtdPessoa, suite, hospede);
                            }else{
                                System.out.println("Numero da Suite Invalido: ");
                            }
                        }else{
                            System.out.println("Código Hospede Invalido: ");
                        }
                        
                        
                    }
                    else{
                        System.out.println("\nPrecisa ter Hospede e suite Cadastrado: ");
                    }
                break;
                default:
                    System.out.println("\nOpção Inválida");
                break;

            }

            
        }while(op != 0);
    }
    public static void menu(){
        System.out.println("\n____________________________________________________");
        System.out.print("1-CADASTRO DE SUITE\n2-CADASTRO DE HOSPEDE\n3-RESERVA\n0-FINALIZAR: ");

    }
}