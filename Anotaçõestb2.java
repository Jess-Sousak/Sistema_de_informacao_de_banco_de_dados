/*
   Alterar nome
   alterar id
   alterar nota1 e nota2
   chamar o metodo para imprimir o valor da media
   chamar o metodo para imprimir se o aluno passou ou nao
  
  * 
import java.util.Scanner;
import java.util.ArrayList;
public static void main(String args[]){
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Alunos> alunos = new ArrayList();
    
        System.out.println ("[0] Aluno0");
        System.out.println ("[1] Aluno1");
        System.out.println ("[2] Aluno2");
        System.out.println ("[3] Aluno3");
        System.out.println ("[4] Aluno4");
        System.out.println ("[5] Aluno5");
        System.out.println ("[6] Aluno6");
        System.out.println ("[7] Aluno7");
        System.out.println ("[8] Aluno8");
        System.out.println ("[9] Aluno9");
        String opcao = scanner.nextLine();
        
        switch (opcao) {
            case "1": {
                System.out.println("Gabriel: ");
                break;
        }
            case "2": {
                System.out.println("Ruth: ");

                break;
        }
            case "3":{
                System.out.println("Lucas: ");

                break;   
        }
            case "4":{
                System.out.println("Ester: ");

                break;
        }
            case "5":{
                System.out.println("Caleb: ");

                break;
        }
            case "6":{
                System.out.println("Yuna: ");

                break;
        }
            case "7":{
                System.out.println("Pedro: ");

                break;    
        }
            case "8":{
                System.out.println("Solar: ");

                break;
        }
            case "9":{
                System.out.println("Jackie: ");

                break;
        }*/
      /*
       * 
         
        package SistemasDeAlunos;
import java.util.Scanner;

public class main {

    public static void main (String [] args) {
        int opc, qntNotas;
        float nota = 0;
        String nome, id;
        Scanner teclado;
        Aluno novoAluno = new Aluno();
        Disciplina novaDisciplina = new Disciplina ();
        
        //construindo o teclado
        teclado = new Scanner (System.in);
        
        do { 
            System.out.println("\n------------------");
            System.out.println("        MENU");
            System.out.println("Escolha uma op��o: ");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar de Aluno");
            System.out.println("3 - Situa��es");
            System.out.println("0 - Sair");
        
            opc = teclado.nextInt();
            teclado.nextLine();
        
            switch(opc){
    
               case 1:
                   System.out.println("\nNome: ");
                   nome = teclado.nextLine();
                   System.out.println("\nId");
                   id = teclado.nextLine();
                   
                   novoAluno = new Aluno(nome,id);
                   
                   System.out.println("\nQuantas notas?");
                   qntNotas = teclado.nextInt();
                  
                   for (int i = 0; 1<qntNotas; i ++) {
                        System.out.println("\nNotas " + (i+1));
                        nota = teclado.nextFloat();
                        novoAluno.insereNotas(nota);
                   }
                   novaDisciplina.inserirAluno(novoAluno);
                   break;
               case 2:
                   novaDisciplina.listarAlunos();
                   
                   break;
               case 3:
                   novaDisciplina.listarSituacoes();
                   System.out.println("");
                   break;
                   
               case 0:
                   System.out.println("\nSaindo...");
                   break;
                   
               default:
                   System.out.println("\nOp��o invalida");
    }
        } while (opc !=0);

    }
        
        }
    
    */

            
            
        
    
