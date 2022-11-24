import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;




public class waytosucess {

   public static Random aleatorio2 = new Random();
 public static  int d0010 = aleatorio2.nextInt(11);

   public static Random aleatorio1 = new Random();
 public static  int d010 = aleatorio1.nextInt(11);

   public static Random aleatorio = new Random();
 public static  int d10 = aleatorio.nextInt(11);

public static int contaberna = 0;
public static String nomejogador;



public static int menu(){
        int opcaomenu;
        do{


        Scanner input = new Scanner(System.in);
        System.out.println("\n  ==================================== ");
        System.out.println("");
        System.out.println("                 WAY TO SUCESS       ");
        System.out.println();
        System.out.println("                 1 - Jogar ");
        System.out.println("                 2 - Instruções");
        System.out.println("                 3 - Sinopse");
        System.out.println("                 4 - Créditos ");
        System.out.println("                 5 - Sair ");
        System.out.println("\n  ==================================== ");
        
       opcaomenu = input.nextInt();
            
        }while(opcaomenu <= 0 || opcaomenu >= 6);
        

      return opcaomenu;
    }

public static void creditos (int opcaomenu) {
      System.out.println(" Teste ");
         
    }
     
public static int sinopse (int opcaomenu) {
  System.out.println("Sinopse: \n"
  + "  Duas história. A taberna e a casa, na taberna você será um jovem que por causa da linha do\n"
  + "destino encontra um bom homem em sua taberna que irá ajudar em seu sonho empreendedor \n"
  + "      \n "
  + " Em A casa, você será um caçador de monstro que irá aceitar mais um contrato, porém um \n"
  + "homem que parece não saber como parar de falar, irá te guiar nesse serviço estranhamente \n"
  + "relacionado a administração  ");
  return opcaomenu;
}

public static void instrucoes (int opcaomenu) {
  System.out.println("Instruçoes:\n"
  + "Esse jogo é game -rpg com objetivo de abordar assunto de administração.\n"
  + "Durante a histora terá perguntas relacionada ao tema, o jogador, no caso você tem 3 chances de acertar elas. Bom jogo\n");
  
}

public static void sair (int opcaomenu) {
  System.out.println("Saindo... ");
  System.exit(0);

}

public static void caminhos (int opcaomenu) {
  int walk;

  do{

  Scanner input = new Scanner(System.in);
  System.out.println( "\nDuas historia com o mesmo objetivo, faça sua escolha e siga o seu caminho");
  System.out.println("Escolha uma opção para se aventurar: ");
  System.out.println("1 - Taberna");
  System.out.println("2 - Casa");
  System.out.println("Escolha uma opção: ");



  walk = input.nextInt();

  } while (walk >= 4 || walk <= 0 ) ;
validacoes(walk); // puxando a pergunta para fazer a validações
}

public static void questaoUm(int walk) {

           
        
   Scanner input = new Scanner(System.in);
 
int tentativa = 0;
String resp01;



do {


  System.out.println(" A administração clássica e administração burocrática. ");
  System.out.println(" B administração clássica e administração comportamental.");
  System.out.println(" C administração burocrática e administração cientifica");
  System.out.println(" D administração clássica e administração cientifica");
  System.out.println(" E administração cientifica e administração comportamental \n");
  System.out.println("Qual é a alternativa correta - \n");
  

   resp01 = input.next();
  
  switch(resp01){
  case "D":
  case "d":
   System.out.println(" Resposta certa");
   tentativa = 3;
   break;
   default:
   if (tentativa <= 1){
   System.out.println("Resposta errada");
   
   tentativa++;
   }else{
      gameover(walk);
   tentativa = 2;
   }
   }
  
   } while (tentativa <=2);
} 




public static void questaoDois (int walk) {
   Scanner entrada = new Scanner(System.in);
   boolean acertou02 = false;  
   String pergunta02;
      int tentativa = 0;
      int resp02tb;
      do {
      ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
      alternativa.add("Elton Mayo e Max Weber.");
      alternativa.add("Max Weber e Henri Fayol.");
      alternativa.add("Henri Fayol e Frederick Taylor");// *resposta corrreta */
      alternativa.add("Frederick Taylor e Elton Mayo.");
      alternativa.add("Peter Drucker e Philip Selznick");

      Collections.shuffle(alternativa);// **embaralha as alternativas**//

      pergunta02 = "\nAgora que encontrou esses dois livros, quais os nomes dos criadores das Teorias Classica e Científica-\n"
            + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1) + "\n" + "3) " + alternativa.get(2)
            + "\n" + "4) " + alternativa.get(3)
            + "\n" + "5) " + alternativa.get(4);
      System.out.println(pergunta02);
      resp02tb = entrada.nextInt();
      switch (resp02tb) {
         case 1:
            if (alternativa.get(0).equals("Henri Fayol e Frederick Taylor")) {
               System.out.println("Parabéns! Você deve ter aprendido muito com esses autores");
                acertou02 = true;
            } else {
               System.out.println(
                     "Que pena você errou! Acho que pegou livro errado. Tem certeza que são esses os autores-");
                     System.out.println("\nTente novamente");
                     tentativa++;

            }
            break;
         case 2:
            if (alternativa.get(1).equals("Henri Fayol e Frederick Taylor")) {
               System.out.println("Parabéns! Você deve ter aprendido muito com esses autores");
               
               acertou02 = true;
            } else {
               System.out.println(
                  "Que pena você errou! Acho que pegou livro errado. Tem certeza que são esses os autores-");
                  tentativa++;

               }
            break;
         case 3:
            if (alternativa.get(2).equals("Henri Fayol e Frederick Taylor")) {
               System.out.println("Parabéns! Você deve ter aprendido muito com esses autores");
               
               acertou02 = true;
            } else {
               System.out.println(
                  "Que pena você errou! Acho que pegou livro errado. Tem certeza que são esses os autores-");
                  tentativa++;

            }
            break;
         case 4:
            if (alternativa.get(3).equals("Henri Fayol e Frederick Taylor")) {
               System.out.println("Parabéns! Você deve ter aprendido muito com esses autores");
               

               acertou02 = true;
            } else {
               System.out.println(
                  "Que pena você errou! Acho que pegou livro errado. Tem certeza que são esses os autores-");
                  tentativa++;
            }
            break;
         case 5:
            if (alternativa.get(4).equals("Henri Fayol e Frederick Taylor")) {
               System.out.println("Parabéns! Você deve ter aprendido muito com esses autores");
               
               acertou02 = true;
            } else {
               System.out.println(
                  "Que pena você errou! Acho que pegou livro errado. Tem certeza que são esses os autores-");
            tentativa++;
               }
            break;
         default:
            System.out.println("Opção Inválida");
      } if (tentativa == 3) {
         gameover(walk);
      }
       } while (!acertou02 && tentativa <= 2);
      } 




public static void questaoTres(int walk) {
   Scanner entrada = new Scanner(System.in); 
   boolean acertou03 = false; 
      String pergunta03;
      int tentativa = 0;
      int resp03tb;
      do {
      ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
      alternativa.add("Teoria das Relações Humanas.");
      alternativa.add("Teoria Classica.");
      alternativa.add("Teoria Científica.");// *resposta corrreta */
      alternativa.add("Teoria dos Sistemas.");
      alternativa.add("Teoria Comportamental.");

      Collections.shuffle(alternativa);// **embaralha as alternativas**//

      pergunta03 = "\n Você pega o livro e começa a ler, esse livro fala sobre CAPACITAÇÂO de um trabalhador. "
      +" Qual teoria administrativa refere-se esse livro-:\n"
            + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1) + "\n" + "3) " + alternativa.get(2)
            + "\n" + "4) " + alternativa.get(3)
            + "\n" + "5) " + alternativa.get(4);
      System.out.println(pergunta03);
      resp03tb = entrada.nextInt();
      switch ( resp03tb) {
         case 1:
            if (alternativa.get(0).equals("Teoria Científica.")) {
               System.out.println("Parabéns! Parece que está treinando e capacitando bem seus funcionários");
               acertou03 = true;
               
            } else {
               System.out.println(
                     "Que pena você errou! Você acabou de perder a chance de conhecer este incrível livro."
                     + " Não conseguirá treinar ninguém assim!");
                     tentativa++;
            }
            break;
         case 2:
            if (alternativa.get(1).equals("Teoria Científica.")) {
               System.out.println("Parabéns! Parece que está treinando e capacitando bem seus funcionários");
               acertou03 = true;
            } else {
               System.out.println(
                  "Que pena você errou! Você acabou de perder a chance de conhecer este incrível livro. "
                  + " Não conseguirá treinar ninguém assim!");
                  tentativa++;
            }
            break;
         case 3:
            if (alternativa.get(2).equals("Teoria Científica.")) {
               System.out.println("Parabéns! Parece que está treinando e capacitando bem seus funcionários");
               acertou03 = true;
            } else {
               System.out.println(
                  " Que pena você errou! Você acabou de perder a chance de conhecer este incrível livro. "
                  + " Não conseguirá treinar ninguém assim!");
                  tentativa++;
            }
            break;
         case 4:
            if (alternativa.get(3).equals("Teoria Científica.")) {
               System.out.println("Parabéns! Parece que está treinando e capacitando bem seus funcionários");
               acertou03 = true;
            } else {
               System.out.println(
                  "Que pena você errou! Você acabou de perder a chance de conhecer este incrível livro."  
                  + " Não conseguirá treinar ninguém assim!");
                  tentativa++;
            }
            break;
         case 5:
            if (alternativa.get(4).equals("Teoria Científica.")) {
               System.out.println("Parabéns! Parece que está treinando e capacitando bem seus funcionários");
               acertou03 = true;
            } else {
               System.out.println(
                  "Que pena você errou! Você acabou de perder a chance de conhecer este incrível livro."
                  + " Não conseguirá treinar ninguém assim!");
                  tentativa++;
            }
            break;
         default:
            System.out.println("Opção Inválida");
      }if (tentativa == 3) {
         gameover(walk);
      } 
   } while (!acertou03 && tentativa <= 2);
   }


  
public static int questaoQuatro(int walk) {
   Scanner entrada = new Scanner(System.in);
     String pergunta04tb;
     int resp04tb;
     boolean acertou04 = false;
     ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
     alternativa.add("Administração Científica"); // *resposta correta */
     alternativa.add("Administração Clássica");

      
        Collections.shuffle(alternativa);// **embaralha as alternativas**//

        pergunta04tb = "\nQual teoria se concentrou em melhorar a eficiência de cada indivíduo dentro da organização-\n"
              + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1);
        System.out.println(pergunta04tb);
        resp04tb = entrada.nextInt();
        switch (resp04tb) {         
          case 1:
              if (alternativa.get(0).equals("Administração Científica")) {
                 System.out.println("Parabéns! começou bem os negócios.");
                 acertou04 = true;
                 
  contaberna++;
              } else {
                  System.out.println("Que pena você errou! Acabou de perder as formas de molde de espadas");
              }
              break;
          case 2:
              if (alternativa.get(1).equals("Administração Científica")) {
                 System.out.println("Parabéns! começou bem os negócios.");
                 acertou04 = true;
                 contaberna++;
              } else {
                 System.out.println("Que pena você errou! Acabou de perder as formas de molde de espadas");
              }
              break;
           default:
              System.out.println("\n Opção inválida digite uma pção valida para soma acertos");
            }      return resp04tb;
         }

    
 
public static int questaoCinco(int walk) {
   Scanner entrada = new Scanner(System.in);
     String pergunta05;
   int resp05tb;
     boolean acertou05 = false;
     ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
     alternativa.add("O líder deve ser arbitrário em suas decisões.");
     alternativa.add("As críticas devem ser evitadas.");
     alternativa.add("A equipe deve respeitar as divergências e diversidades.");// *resposta corrreta */
     alternativa.add("As opiniões deverão ser ignoradas");
     alternativa.add("As responsabilidades devem ser delegadas.");

     
        Collections.shuffle(alternativa);// **embaralha as alternativas**//

        pergunta05 = "\nUma equipe alinhada e bem relacionada trará um ambiente de trabalho agradável e mais produtivo,"
              + " pensando nisso é correto afirmar que em relação ao bom desenvolvimento de toda a equipe:\n"
              + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1) + "\n" + "3) " + alternativa.get(2)
              + "\n" + "4) " + alternativa.get(3)
              + "\n" + "5) " + alternativa.get(4);
        System.out.println(pergunta05);
        resp05tb = entrada.nextInt();
        switch (resp05tb) {
           case 1:
              if (alternativa.get(0).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;
                 contaberna++;

              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case 2:
              if (alternativa.get(1).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;
                 contaberna++;
              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case 3:
              if (alternativa.get(2).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;
                 contaberna++;
              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case 4:
              if (alternativa.get(3).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;
                 contaberna++;
              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case 5:
           
              if (alternativa.get(4).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;
                 contaberna++;
              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           default:
              System.out.println("Opção Inválida");
        }
       return resp05tb;
    }

    public static int questaoSeis(int walk) {
      Scanner entrada = new Scanner(System.in);
         String pergunta06;
         int resp06tb;
         ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
         alternativa.add(" Não padronização.");
         alternativa.add(" Customização da produção.");
         alternativa.add(" Produção em Massa.");// *resposta corrreta */
         alternativa.add(" Liberdade de formas de trabalho.");

         Collections.shuffle(alternativa);// **embaralha as alternativas**//

         pergunta06 = "\nAo buscar aumentar sempre a produtividade, a Administração científica voltou-se para a tecnologia de:\n"
               + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1) + "\n" + "3) " + alternativa.get(2)
               + "\n" + "4) " + alternativa.get(3);
         System.out.println(pergunta06);
         resp06tb = entrada.nextInt();
         switch (resp06tb) {
            case 1:
               if (alternativa.get(0).equals(" Produção em Massa.")) {
                  System.out.println("Parabéns! Parece que você está indo bem nos negócios");
contaberna++;
               } else {
                  System.out.println(
                        "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
               }
               break;
            case 2:
               if (alternativa.get(1).equals(" Produção em Massa.")) {
                  System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                  contaberna++;
               } else {
                  System.out.println(
                        "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
               }
               break;
            case 3:
               if (alternativa.get(2).equals(" Produção em Massa.")) {
                  System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                  contaberna++;
               } else {
                  System.out.println(
                        "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
               }
               break;
            case 4:
               if (alternativa.get(3).equals(" Produção em Massa.")) {
                  System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                  contaberna++;
               } else {
                  System.out.println(
                        "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
               }
               break;
            default:
               System.out.println("Opção Inválida");
         } return resp06tb;
      } 

   

   public static int questaoSete(int walk) {
   Scanner entrada = new Scanner(System.in);
         String pergunta07;
         int resp07tb;
         
         ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
         alternativa.add(" Ênfase na estrutura");// *resposta corrreta */
         alternativa.add(" Ênfase nas tarefas");
         alternativa.add(" Ênfase no mercado");
         alternativa.add(" Ênfase na indústria");

         
            Collections.shuffle(alternativa);// **embaralha as alternativas**//

            pergunta07 = "\nAs origens da Abordagem Clássica da Administração remontam às consequências geradas pela Revolução Industrial e podem ser resumidas em dois fatos genéricos:"
                  +
                  "o crescimento acelerado e desorganizado das empresas e a necessidade de aumentar a eficiência e a competência das organizações."
                  +
                  "A Abordagem Clássica da Administração foi desdobrada em Administração Científica (Taylor) e Teoria Clássica (Fayol). Aponte a alternativa que indica a ênfase da Teoria Clássica.\n"
                  + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1) + "\n" + "3) " + alternativa.get(2)
                  + "\n" + "4) " + alternativa.get(3);
            System.out.println(pergunta07);
            resp07tb= entrada.nextInt();
            switch (resp07tb) {
               case 1:
                  if (alternativa.get(0).equals(" Ênfase na estrutura")) {

                  
                    
                  contaberna++;
                  
            } else {
                     System.out.println( // mudar o texto-
                           "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
                  }

                  break;
               case 2:

                  if (alternativa.get(1).equals(" Ênfase na estrutura")) {
                                          
                  }
                  else {
                     System.out.println( // mudar o texto-
                           "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
                  }
                  break;
               case 3:

                  if (alternativa.get(2).equals(" Ênfase na estrutura")) {
                     contaberna++;
                     
                  }
                  else {
                     System.out.println( // mudar o texto-
                           "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
                  }

                  break;
               case 4:
                  if (alternativa.get(3).equals(" Ênfase na estrutura")) {
                     contaberna++;
                     
                  }
                  else {
                     System.out.println( // mudar o texto-
                           "Que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!");
                  }
                  break;
               default:
                  System.out.println("Opção Inválida");
                 

            } return resp07tb;
         } 
         


         public static void questaoDoisCasa (int walk) {
            Scanner entrada = new Scanner(System.in);
            boolean acertou02 = false;
            String pergunta02;
               int tentativa = 0;
               int resp02tb;
               do {
               ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
               alternativa.add("Nome, cpf,  número da casa e estado civil, formação, Experiencia. ");
               alternativa.add("Endereço completo, nome, trabalhos anteriores, formação Qualidades, Experiencia.");
               alternativa.add("Nome, Idade, Formação, Qualidade, Experiencia ");
               alternativa.add("Nome, E-mail, Telefone de contato Cidade onde mora Idade ou data de nascimento  Área  de atuação, Formação, Qualidades, Experiencia");//resposta corrreta */
               alternativa.add("Sexualidade, Estado Civil, Número de telefone, Experiencia, Telefone.");
         
               Collections.shuffle(alternativa);// embaralha as alternativas//
         
               pergunta02 = "\nQual Alternativa se encaixa melhor em dados que deve ter em um curriculo\n"
                     + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1) + "\n" + "3) " + alternativa.get(2)
                     + "\n" + "4) " + alternativa.get(3)
                     + "\n" + "5) " + alternativa.get(4);
               System.out.println(pergunta02);
               resp02tb = entrada.nextInt();
               switch (resp02tb) {
                  case 1:
                     if (alternativa.get(0).equals("Nome, E-mail, Telefone de contato Cidade onde mora Idade ou data de nascimento  Área  de atuação, Formação, Qualidades, Experiencia")) {
                        System.out.println("Jasquim : Boa, você realmente não e um caçador burro");
                         acertou02 = true;
                     } else {
                        System.out.println(
                              "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
                              System.out.println("\nTente novamente");
                              tentativa++;
         
                     }
                     break;
                     case 2:
            if (alternativa.get(1).equals("Nome, E-mail, Telefone de contato Cidade onde mora Idade ou data de nascimento  Área  de atuação, Formação, Qualidades, Experiencia")) {
               System.out.println("Jasquim : Boa, você realmente não e um caçador burro");

               acertou02 = true;
            } else {
               System.out.println(
                  "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente ");
                  tentativa++;

               }
            break;
         case 3:
            if (alternativa.get(2).equals("Nome, E-mail, Telefone de contato Cidade onde mora Idade ou data de nascimento  Área  de atuação, Formação, Qualidades, Experiencia")) {
               System.out.println("Jasquim : Boa, você realmente não e um caçador burro");

               acertou02 = true;
            } else {
               System.out.println(
                  "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
                  tentativa++;

            }
            break;
            case 4:
            if (alternativa.get(3).equals("Nome, E-mail, Telefone de contato Cidade onde mora Idade ou data de nascimento  Área  de atuação, Formação, Qualidades, Experiencia")) {
               System.out.println("Jasquim : Boa, você realmente não e um caçador burro");


               acertou02 = true;
            } else {
               System.out.println(
                  "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
                  tentativa++;
            }
            break;
         case 5:
            if (alternativa.get(4).equals("Nome, E-mail, Telefone de contato Cidade onde mora Idade ou data de nascimento  Área  de atuação, Formação, Qualidades, Experiencia")) {
               System.out.println("Jasquim : Boa, você realmente não e um caçador burro");

               acertou02 = true;
            } else {
               System.out.println(
                  "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
            tentativa++;
               }
            break;
default:
            System.out.println("Opção Inválida");
      } if (tentativa == 3) {
         gameover2(walk);
      }
       } while (!acertou02 && tentativa <= 2);
      }
         
      public static void questaoTresCasa  (int walk) {
         Scanner entrada = new Scanner(System.in);
         boolean acertou03 = false;
         String pergunta03;
            int tentativa = 0;
            int resp03cs;
            do {
            ArrayList<String> alternativa = new ArrayList<String>();// criação da lista //
            alternativa.add("Administração clássica e administração cientifica");//resposta corrreta 
            alternativa.add("Administração clássica e administração comportamental");
            alternativa.add("Administração clássica e administração burocrática");
            alternativa.add("Administração cientifica e administração comportamental");
            alternativa.add("Administração burocrática e administração cientifica");
      
            Collections.shuffle(alternativa);// embaralha as alternativas//
      
            pergunta03 = "\nVocê tenta procurar nos montes dos livros algo que tenha relação sobre a informação obtida na carta, seguindo o que ela diz, qual  seria o livro que você deve achar a resposta  \n"
                  + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1) + "\n" + "3) " + alternativa.get(2)
                  + "\n" + "4) " + alternativa.get(3)
                  + "\n" + "5) " + alternativa.get(4);
            System.out.println(pergunta03);
            resp03cs = entrada.nextInt();
            switch (resp03cs) {
               case 1:
                  if (alternativa.get(0).equals("Administração clássica e administração cientifica")) {
                     System.out.println("Você acerta em cheio e pega o livro");
                      acertou03 = true;
                  } else {
                     System.out.println(
                           "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
                           System.out.println("\nTente novamente");
                           tentativa++;
      
                  }
                  break;
      case 2:
                  if (alternativa.get(1).equals("Administração clássica e administração cientifica")) {
                     System.out.println("Você acerta em cheio e pega o livro");
      
                     acertou03 = true;
                  } else {
                     System.out.println(
                        "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente ");
                        tentativa++;
      
                     }
                  break;
               case 3:
                  if (alternativa.get(2).equals("Administração clássica e administração cientifica")) {
                     System.out.println("Você acerta em cheio e pega o livro");
      
                     acertou03 = true;
                  } else {
                     System.out.println(
                        "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
                        tentativa++;
      
                  }
                  break;
      case 4:
                  if (alternativa.get(3).equals("Administração clássica e administração cientifica")) {
                     System.out.println("Você acerta em cheio e pega o livro");
      
      
                     acertou03 = true;
                  } else {
                     System.out.println(
                        "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
                        tentativa++;
                  }
                  break;
               case 5:
                  if (alternativa.get(4).equals("Administração clássica e administração cientifica")) {
                     System.out.println("Você acerta em cheio e pega o livro");
      
                     acertou03 = true;
                  } else {
                     System.out.println(
                        "Você errou a pergunta, Jasquim  rir de você e te pergunta novamente");
                  tentativa++;
                     }
                  break;
      default:
                  System.out.println("Opção Inválida");
            } if (tentativa == 3) {
              gameover2(walk);
            }
             } while (!acertou03 && tentativa <= 2);
            }




   

public static void gameover (int walk) {
   System.out.println("\n" + nomejogador + " Infelizmente não foi dessa vez meu nobre tente novamente. \n");
   caminhos(walk);
}

public static void gameover2 (int walk) {
   System.out.println("\n Você erra as perguntas, fica de saco cheio de ouvir sobre esse assuntos você deixa esse contrato de lado e  desiste de terminar essa missão. \n");
   caminhos(walk);
}




public static void gameover3 (int walk) {
   System.out.println("\n Você sofreu muito dano pelo fantasma, sem força você larga a espada no chão e cai sobre os pés do Jasquim, infelizmente esse é o seu infeliz fim. Fim de jogo. \n");
   caminhos(walk);
}





 public static void validacoes (int walk) {
   if (walk == 1){
   taberna0(walk);
   taberna1(walk, nomejogador);
   taberna2(walk);
    taberna3(walk,nomejogador);
    taberna4(walk,nomejogador, nomejogador,nomejogador, nomejogador);
    if (contaberna >= 3) {
      taberna5(contaberna);
   } else {
      gameover(contaberna);
   }
   }
   if (walk == 2) {
    casa0(walk);
    casa1(walk);
 if (d10 <= 3) {
   gameover3(walk);
 } else {
    casa2(walk);
    casa3(walk);
 }
    if (d010 <= 4) {
      gameover3(walk);
    } else {
    casa4(walk);
    casa5(walk);
   }
   if (d0010 <= 5) {
      gameover3(walk);
    }else {    
      casa6(walk);
    }


   } 
  
}




     public static void pedirnome() {   


         System.out.println("Informe seu nome ");
         Scanner input = new Scanner (System.in);
       nomejogador = input.next();
         


     }

     
             
    static void controle (int opcaomenu ,int walk) { // função de controle q irá chama todas as coisas.
      switch (opcaomenu) {
        case 1:
        caminhos(walk);

       
break;
        case 2:
        instrucoes(opcaomenu);
break;
        case 3:
        sinopse(opcaomenu);
break;
        case 4:
        creditos(opcaomenu);
break;
        case 5:
        sair(opcaomenu);
break;
        default :
      } 
    }


   static void taberna0(int walk) {
                  System.out.println(
                  "\n Um humano simples que após anos trabalhando como ajudante de cozinha, decidiu que iria abrir sua própria taberna "
                  + " e então, decidiu estudar meios de abrir seu próprio negócio e como administrar. Anos se passaram "
                  + " e agora ele é um homem bem-sucedido com várias tabernas espalhadas pela cidade de vento forte e agora vive humildemente em uma taberna simples aproveitando a vida.");
      
                   System.out.println("Aperte enter para seguir\n"); // codigo usado para pular linha 
                   try{System.in.read();}
                   catch(Exception e){}
            
              
                  System.out.println(" A história começa em uma noite calma e chuvosa, o som de uma porta abrindo se propaga no ar e com esse som que começa a nossa aventura.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                  System.out.println("Era em torno das 10 horas da noite, e um homem entra em uma taberna que está bem afastada da cidade dos ventos, ele vai ao balcão, porém não vê ninguém, bate na mesa e escuta no fundo.");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("- Já vai!");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("No fundo da estalagem vem um homem, bem-vestido e aparentemente de bem com a vida e ele se aproxima do novo cliente.");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Olá em que posso ajudar- ");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(" Desconhecido ¬... Me dê alguma coisa forte, hoje meu dia foi terrível.");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Vamos ver...");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("O balconista vira e procura algo entre vários tipos de bebidas");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Aqui está, um bom e velho Licor Luminoso, feito de diversas frutas, ervas e temperos. É tipo um licor comum com uma glândula luminosa de um Besouro de Fogo.");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Desconhecido ... Se ela for tão boa que nem sua aparência");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(" O cliente vira a bebida em sua boca e em seguida pede outra e outra, porém continua sóbrio ");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Me diga, qual é o seu nome- Nunca vi você por aqui e o que te deixa tão desconfortável ao ponto de se embriagar a essas horas ");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
   } /// ok
   
   
      static void taberna1(int walk, String resp01tb) {

                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  System.out.println(" Desconhecido ... Me chamo... ");
                  pedirnome();
                    //chamar nomejogador 
                  
                  System.out.println( "e o motivo que estou me entupindo de bebida e porque eu estou falido praticamente");   
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}

                  System.out.println( "Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Como assim- ");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(  "Estava juntando umas pratas para abrir um negócio, contratei uma equipe    de goblins operários e construir minha fábrica de armadura e estava tudo indo bem, tinha meus funcionários e eu seria o gerente e cuidaria das finanças, porém deu tudo errado");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha - Estava seguindo alguma teoria de administração-");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                 questaoUm(walk);
              

 }


    
      static void taberna2(int walk){

                  System.out.println( nomejogador + " ... Interessante, deveria te pesquisado mais sobre isso antes de ir falar com o agiota enfim, mas acho que esta tarde demais, não sei se isso vai me ajudar agora na minha situação.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                
                  System.out.println("Chimbinha ... Bom eu posso te ajudar, talvez você não saiba mais eu tenho várias tabernas, principalmente na capital, estou por aqui pois quero continuar trabalhando, porém gosto da calmaria que tem por aqui. Se quiser vir aqui de manhã podemos ver como reverter a sua situação \n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  

                  System.out.println( nomejogador +" ... Certo, irei vir sim, pode deixar, mas antes me ver mais uma aí.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){} 
                
                  System.out.println("Chimbinha ... Só mais uma, não quero perder um cliente por causa de um coma alcoólico.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                
                  System.out.println("A escuridão da noite fica cada vez mais forte, o som da porta se fechando dá início ao eterno silencio da madrugada, você chega em casa, tranca as portas e janelas e sobe em direção ao seu escritório, lá está cheio de livros e papelada dos gastos e dos últimos meses\n" 
                 +"Você se lembra que já passou por muitas dificuldades na vida e por isso deseja mudar e focar em aprender.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){} 
                
                 System.out.println("Umas horas passam. \n" 
                 +"O sol passa diante a janela e vai em direção aos seus olhos, você levante e se arruma para mais um dia, antes de sair de seu quarto você lembra Chimbinha disse que iria te ajudar.\n" 
                 +"Você lembra que ele disse algo sobre administração e deseja ir ver se você não tem algum livro disso em seu escritório \n" 
                 +"Você finalmente acha o que estava procurando. dois livros, um com o título, administração clássica e o outro com o nome de administração cientifica ");

                    questaoDois(walk);
   }
    
    //nome dos criadores
    
    
        static void taberna3(int walk, String resp03tb){

         

                
                  System.out.println("Após pegar os livros e ler um pouco você percebe que está quase na hora de ir ver Chimbinha, você se arruma para ver seu amigo\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                    
                  System.out.println("É uma e vinte da tarde, o movimente esta como sempre esteve, alguns humanos conversando sobre as colheitas, um anão no fundo fumando e alguns orcs fazendo quebra de braça, tudo como sempre foi.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}                     
                    
                  System.out.println("Você entra pela porta \n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                            
                  System.out.println(nomejogador +" ... Saudação Chimbinha.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Até que enfim você veio, pensei que iria sumir de vez depois de tanto beber ontem.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println(nomejogador +" - Estava resolvendo aqueles problemas, vendi alguns dos meus bens e conseguir pagar o que devia, porém terei que começar tudo de novo.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Bom, espero que agora siga os meus conselhos pois irei te ensinar como ter um negócio. Primeiro, o que pretender fazer\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println(nomejogador + " - quero abrir uma loja de armas, meu pai amava espadas e sempre falava que queria que eu virasse um cavaleiro real, bom, acho que dá para ver que não tenho nem força e estatura de um soldado, então decidir que irei fabricar espadas.\n");
                  System.out.println(" você tem 1,60 de altura ..\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Ter um foco já é um bom começo, fazer isso sozinho é complicado recomendo achar alguém para te ajudar, principalmente na fornalha, é bom ter alguém para trabalhar com você\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println(nomejogador + " ... posso estar vendo isso.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}       
                         
                  System.out.println("Chimbinha - ter um funcionário e capacitar ele treinando e ensinando os movimentos corretos pode aumentar tanto a produção como a qualidade do produto.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Eu vi isso nesse livro, (ele tira um livro de baixo da mesa, aparentemente ele tinha deixado ali para te mostrar futuramente).\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Você pega o que você e começa a ler, esse livro que fala sobre capacitação de um trabalhador se refere a qual teoria administrativa-");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}

                  questaoTres(walk);
                
                
        }

    
    static void taberna4(int walk, String resp04tb, String resp05tb, String resp06tb, String resp07tb) {
            
            
                 System.out.println("Chimbinha ... Entendeu- \n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                 System.out.println("Antes de ao menos nomejogador pensar em responder você escuta uma confusão nos fundos, aparentemente tem dois homens discutindo, eles se levantam e começam a jogar as bebidas uns nos outros \n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                 System.out.println("Chimbinha ... Ahh e por esses motivos que eu não me aposento, amo ouvir uma boa briga logo de banham hahaha! pois eles têm que pagar todo o conserto depois e sempre ganho uns moveis novos \n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                 System.out.println("Você se assusta,  apensar de gostar de beber você não tem costume de frequentar tabernas grandes como essa.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                System.out.println("Chimbinha ... enfim, acho que já está bom de diversão, vai que eles não tenham dinheiro para pagar por mais estrago do já que fizeram\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println(" Você ver que ele sabe muito bem cuidar desses assuntos e enquanto o pal ta comendo lá, você continuar lendo e aprendendo com os livros de adm que você recebeu.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Enfim e voltando ao assunto. \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Oie ta me ouvindo-\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println(nomejogador + " ... Ah sim, estava concentrado\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Que bom.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Vamos fazer o seguinte, pegue estes livros e estude ... os, quando voltar irei testar seus conhecimentos.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}   
                         
                System.out.println(nomejogador + " - Certo, pode deixar.\n");System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("passados alguns dias de estudo o você retorna a taberna superanimado e reencontra Chimbinha.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println(nomejogador + "... Eu estou pronto para abrir um novo negócio!\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Calma! Calma! meu rapaz, vamos ver o que aprendeu\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println(nomejogador + "... Claro!\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Antes de mais nada me liste o que já possui para este novo negócio\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
               System.out.println(nomejogador +" ... Não entendi\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
               System.out.println("Chimbinha ... E ainda diz que está pronto para um novo negócio rsrssrs, quero que me diga se tem algum dinheiro ou local para abrir a sua forja\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}     
                         
                         
                System.out.println(nomejogador + " ... Tenho um galpão para a fábrica há uma longa distância da cidade, alguns maquinários e formas para os moldes das espadas, um pequeno cômodo para a loja ao centro do vilarejo.");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Certo, então irei te fazer algumas perguntas de testes, onde as únicas condições é que para cada acerto você mantém todos os seus bens, contudo se errar perderá um por vez, mas terá a chance de recuperar tudo ou não na pergunta final, e aí você topa-\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println( nomejogador + " ... Mas isso é hipoteticamente, não é-\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Mas é claro meu filho, a não ser que queira começar o negócio já falido!\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println( nomejogador + " - Então eu aceito!\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
               
                System.out.println("Chimbinha ... Vamos começar!");
                System.out.println("Você tem que acerta todas as questões para passar!");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 questaoQuatro(walk);
                 questaoCinco(walk);
                 questaoSeis(walk);
                 questaoSete(walk);
                         
         }
         
    

    
    
    static void taberna5(int walk){
            
                System.out.println("Chimbinha ... Realmente, você demonstrou conhecimento, meus parabéns.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}   
            
                System.out.println(" Chimbinha ... Aqui, assine isso.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(nomejogador + "- O que é isso-\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(" Chimbinha ... Partir de agora seremos sócios. Eu entro com o dinheiro e você irá administrar tudo, afinal você se demonstrou ser bem capaz. \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println("Uma escurudão toma conta de tudo e sua mente começa a da uma bagunçada");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println("..... acorde\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(" Você acorda, está em uma cadeira bem confortável, você estava sonhando com lembranças do passado. \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(" Ao se levantar você sai de um quarto que da direto a uma grande loja, a sua loja, e você lembra do seu antigo amigo que te ajudou e que agora não está mais entre as terras vividas, \n"
                 +"Você se sente realizado pois conseguiu ter o seu sonho, \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
             
                System.out.println("Você abre a porta e pouco tempo depois chega alguns clientes.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println(nomejogador  + " - Bem vindo a forja Chimbinha");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         System.out.println("all teste " + contaberna);
                System.out.println( "Fim de jogo");
          
                         
             
    }
      static void casa0 (int walk){
                
                 System.out.println("Era de noite, um homem montado a cavalo passava pela uma estrada cheia de nevoas, indo em direção a uma grande vila chamada Vila do Corvo\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("O homem passa pela entrada da vila e vai em direção a um estabulo, lá ele deixa seu cavalo e parte em direção a uma estalagem\n" +
                 "La dentro está cheio de pessoas, conversando, bebendo e até jogando uns jogos de carta.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}    
                 
                 System.out.println("ELe vai até um mural onde são colocados contratos, algo como contrato de segurança, caçador de monstros ou de pessoas em alguns casos.\n" +
                 "Ele olha e pega um e começa ler;\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Contrate-se caçador de monstros para livra uma casa de fantasma e outros seres do tipo, recompensa 6000 po (peça de outro), caso alguém se interessar ir falar com Jasquim no cruzamento da feira dos altares, número 0.\n"); 
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Após pegar a folha o homem vai em direção ao balcão e pergunta ao taberneiro se ele o poderia informar onde encontrar o local do contrato\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro – Olha só, faz tempo que não vejo um caçador de monstro por aqui, você esta todo bem equipado com essas poções e tem uma bela espada em suas consta, como se chama-\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Sim, esse é você, um caçador de monstro que está indo em direção a mais um contrato, agora diga o seu nome \n");
                 pedirnome();
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 
                 System.out.println( nomejogador + " – Me chamo " + nomejogador + " e sim, hoje em dia os números de caçadores estão cada vez menor, é uma profissão difícil.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println(nomejogador + " - Agora pode me informar onde fica esse local ou nao -");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Você entrega o papel ao Taberneiro e ele começa a ler.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro –   A sim, conheço o lugar e conheço o Jasquim hahaha.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println(" Você percebe que ele rir, porém não entende o motivo\n" );
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro – Espero que esteja preparado para esse contrato jogador, pois Jasquim e pior que qualquer monstro que você já enfrentou, eu aposto haha.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println( nomejogador + " – por quê- \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro – Digamos que ele e o tipo de pessoa que você não gostaria de começar a conversar, enfim tenho clientes para cuidar, se quiser ir para lá e só seguir esse caminho.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("O taberneiro fala o local e você parte em direção.\n" );
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Passa alguns minutos e você está lá, bem em frente o endereço indicado no contrato, você bate na porta e escuda alguém vindo abri-la.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
         
                 System.out.println( nomejogador + " – Olá eu vi o ...\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Sem ao menos terminar de falar Jasquim o interrompe \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jasquim - AA então finalmente alguém aceito o contrato, olá eu sou Jasquim seja bem-vindo entre entre.\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Você entra.\n");
                  System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jasquim – É tão bom ver um caçador por aqui, estou precisando muito me livrar das quelas aberrações, quando mais rápido for mais rápido irei ter meu negócio e serei rico hahaha!\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println( nomejogador + " - Seria aqui a casa onde estão as assombrações-\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 

                 System.out.println("Jasquim – Não não, a casa fica mais no centro, é uma casa simples irei te levar lá\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Vocês saem e vão em direção ao local onde está amaldiçoado,\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Ao chegar você se depara com uma casa toda velha e aparentemente esta abandonada a alguns bons anos  \n" );
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println(" Jasquim – Aqui estamos, bonita não- Essa vai ser a mais famosa loja de poções dessa vila, pode apostar. É claro, se você conseguir eliminar esses seres que vivem assombrando o local \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println( nomejogador + " - certo, irei entrar\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Você entra, mas logo atras está o Jasquim\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jasquim – Eu e meus irmãos queremos abrir uma loja de poção aqui, estudamos muito para isso sabe, até vimos meios de administrar \n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println( nomejogador + " - legal, mas pode ser perigoso aqui, e melhor você ficar lá fora\n");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jacks o do meio, falou sobre algumas teorias de administração, sabe o que é-");
                 System.out.println("Aperte enter para seguir\n"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 questaoUm(walk);

               }
        
       
        
        static void casa1(int walk){
          System.out.println("Jasquim – Isso mesmo, até que um selvagem como você e bem esperto.");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Você apenas o ignora e segue em frente.");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Do nada um calafrio surge em seu corpo e você começa a ouvir o vento ficar mais forte \n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Uma voz surge do além\n" +
         "Voz desconhecida - Vocês não irão tomar oque é meu \n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
                  
          System.out.println("Um fantasma aparece, com uma aparência de um homem velho, porém aterrorizante ele parte em sua direção para atacá-lo"
                  + "  --                                                                          \n" +
"                                                                                                                              ++                                                                        \n" +
"                                                                                                                              MMMM                                                                      \n" +
"                                                                                                                                ++..                                                                    \n" +
"                                                                                                                        ....--....@@      ::++--                                                        \n" +
"                                                                                                  ....                --++++++::::mmmm::--mm::mm--                                                      \n" +
"                                                                                              --      mm              ::MM::::..MM++@@--@@++mm@@mm::..                                                  \n" +
"                                                                                            ......--..++          ..::mmMM@@@@@@##mm@@mm::mmmmmmMMmm::..                                                \n" +
"                                                                                ..          --    ::::mm----    ..::mmMM@@########MMMMMM@@##@@mm@@MMmm--                                                \n" +
"                                                                                  --..    --..  ..::mmMMmm@@..  ++++@@##@@######################@@##@@mm--                                              \n" +
"                                                                                  ..--..  --------++MMMM@@MM@@++mm++@@################################MM++                                              \n" +
"                                                                              ..--::    ..mm::::++MM##@@@@@@MMMMMM####################################@@++--                                            \n" +
"                                                                                    --::++mmMMMMMM@@####@@@@MM@@######################################@@++::                                            \n" +
"                                                                                ..--::++MMmmmmMM@@MM######@@MM++@@######################################mmmm                                            \n" +
"                                                                            --  --  ::++++::mmmm##########@@@@@@####################################MM@@++mm                                            \n" +
"                                                                        ..      ......::mm++::::::######@@MMMM##@@##################################++@@MMMM                                            \n" +
"                                                                      ..        ..--mm++##MM########@@@@##MMMM######################################..@@mm                                              \n" +
"                                                                            ..  ..++MM##################mm##MM####@@############################MM##MM##mm                                              \n" +
"                                                                            --  ++++##MM############@@@@####@@mm##..####  ################@@--..##MM##@@mm                                              \n" +
"                                                                          ..  ::mm##################MM@@############MM##MM  ..MM##########  ..##@@mm##MM::                                              \n" +
"                                                                            @@######################MM##########@@############MMmm##--##::##@@####::##@@                                                \n" +
"                                                                        ..MM######@@################MM@@##############::##########MM  ##########::++MM                                                  \n" +
"                                                                      --::######@@####################################@@::########..  MM####MM++::@@##                                                  \n" +
"                                                                    ....mm############################################@@::::######--MMMM@@##  ..####::                                                  \n" +
"                                                                  --  mm##############################MM####@@mm########@@  ..##MM######....  MM####..                                                  \n" +
"                                                                    mmMM##############################mm##################mm::....mm  ::..  MM####mm                                                    \n" +
"                                                                  ++################@@################::@@####################++          mm@@####++::                                                  \n" +
"                                                                --mm##MM##############################++####@@##################....  ::@@######MMmmmm                                                  \n" +
"                                                            ..--++##################################@@mm##@@MM##@@##MM##########################mmmmmm::                                                \n" +
"                                                            ..MM####################################@@mm########@@##############################MMMM++MM                                                \n" +
"                                                      --..::++MM####################################MM@@####MM############@@##############@@####@@@@mm++                                                \n" +
"                                                ..::....mmMMMM####################MM################mm########++################################@@@@MM++mm                                              \n" +
"                                              ::::----@@mm@@##############@@######++################MMMM################@@######################@@####MM--                                              \n" +
"                                            ....  @@@@mmmm@@####################++mm@@##############@@############MM##################################mm::--                                            \n" +
"                                            ..::mmMMMM++@@MM@@##################::####################################################################MM::mm                                            \n" +
"                                    ..--++--::++MMMMMM##@@####################@@++####################@@############################################@@##mm::..                                          \n" +
"                                    ::++::##MM####MM##########################@@MM######################################################################mm++mm                                          \n" +
"                                ----@@++@@##mm--@@############################mmMM####################@@############################@@####################++mm::                                        \n" +
"                            ....--::mm++####@@MM################################@@####@@##############@@##########################::@@@@##########@@########++++                                        \n" +
"                        ........::MM::######@@####################################@@##@@################################@@####@@##  ..mm@@##@@##############mm++--                                      \n" +
"                      ..  ::::--MMmm####MM############################################mm################################..    ##mmMM    MM##@@####@@##########++                                        \n" +
"                          ::mm++mm####@@@@############################################mm################################      mm::MM    ++######################::                                      \n" +
"                        ..++mm##@@####mm##############################@@MM############@@################################          MM++  MM##mm####################++                                    \n" +
"                        ++MM##MM####@@################################mm@@############@@########@@####################MM          ..++  mm##MM################--@@--                                    \n" +
"                      ::##mm######@@##################################@@##############mm##############################                mm::##MM####################MM                                    \n" +
"                    --mmMM######MM##############::####################@@@@############++##############################                --..@@##@@################mm@@::                                  \n" +
"                    ++MM######MMMM############@@######################MM@@############++############################..                    ####MMMM##########MM    ::..                                  \n" +
"                  ..##@@####@@########################################################mm############MM##############                      mm##  @@##########mm++    ::                                  \n" +
"                ..mm######@@##############@@##########################################++##############@@##########--                      ..MM  mm##########@@MM      ..                                \n" +
"                ..@@@@@@@@@@############################################@@############mm@@####################MM@@                          ++..@@::##########mm      --                                \n" +
"              --++##MM@@MM##############@@############################################++mm##################MM##@@                          --  ++############++..                                      \n" +
"                MMMM::MMMM@@##########@@@@##################MM########################mm++##################@@@@mm..                              ##@@########++MM                                      \n" +
"            ----mm::--::@@@@@@######@@MMMM@@################MM##########################MMMM++####################MMmm                            ##@@########@@mm                                      \n" +
"            --++++  ----MMMM@@####@@@@mm@@MM################@@############################MMMM##################@@@@MMmm--                        @@::########MMmm                                      \n" +
"            ..mmMM      ++MM@@@@@@@@@@mm--  ##@@############MM################################MM########################MMMM                      --mm@@######@@mm                                      \n" +
"          ----mm        ++@@@@@@@@MMmm--  ..MM@@##@@########::##################################MM####################@@@@@@mm::                    ##@@########mm++                                    \n" +
"          --::          ++MMMM@@MM--      ::::@@##@@########MM##::################################@@########################@@@@MM::--              ::++########mmMM                                    \n" +
"        ..--::        ..mmmmMMmmmm      ::  mm@@##@@######@@@@@@mm####################################MM######################@@MMMMmmMMmm          ::--########@@MM..                                  \n" +
"        ::          ....++mmMM++            MM@@@@@@################################################################################@@MMmmmmMM        ::mm######MMmm                                    \n" +
"        --            --mmmmmm              MM@@##@@##########@@##########################################@@MM##############################@@@@mmmm..++MM########MMmm                                  \n" +
"        ..--          ::mmmm--            mmMM@@@@########@@@@mm############################################@@MM##########################@@####mm--    mmMM######MMmm                                  \n" +
"      --..            mmmmmm            ++mmMM@@@@##########@@MM################################################mm################@@##############MM::--mmMM######@@mm++::                              \n" +
"      ..            --mmmmMM  ::        mm@@@@##################mm################@@############################MM####@@@@############################MM--##########mmmm--                              \n" +
"      ..          ....mmmm..++::--  ..--mmMM######################################################################::@@@@##@@########@@MMmm######@@######@@##++######mmmmmm                              \n" +
"      ..        ....mmmmmmmmmmmm++--mmMMMMMM######################@@################################################@@@@####MMMM####@@MM@@    --mm############::::##@@MM++mm                            \n" +
"      ..        ..::++mmMMmmMMMMMMmmmmMM@@@@@@##################MM################@@################################MM++######@@########mmMM          ::##MM####MM##..mmMM::..                          \n" +
"      --      ..  ++mmMMMM@@MMMM@@MM@@@@##@@################@@##@@####################################################MM############@@##MMMMMM            ..######@@@@++mmMM                            \n" +
"      ::        ::++++MMMMMMMMMMMM@@@@####@@@@################@@@@####################################################################@@MMMMMMmm          --####@@####@@::mm++                          \n" +
"      ++      ::--mmMMMMMM@@MMMM@@##@@####@@##################MM##########################################################################@@####..          ##############  --                          \n" +
"    --++        ..++MMMM@@@@MM@@########################################################################################@@################MMmm@@##::        MM##############++                          \n" +
"    ..        ..--mmMMMM@@@@MM##############################MM############################################################@@##############MMmm..  ++::    ::++################MM                        \n" +
"    --        ....MMMM@@##@@@@########@@##@@##################@@##########################################################################@@mm++    --    ::++########@@########mm                      \n" +
"    --    --....--MM@@@@@@@@########@@@@@@@@##############@@@@################################################################@@############MM::::        ::MM##########@@########::                    \n" +
"    --    ------++MMMM@@MMMM##########@@@@##############MM####################################################################################++++      --  ########################MM                  \n" +
"    ::    ----..MMMMMMmm@@@@##@@##  ..mm##########MM######mm######MM##########################++##########################mm####################mm::      ::####@@########MM##MM######++                \n" +
"    ::    --..--mmmmmm  MM@@##MMmm    MM##########@@##@@mm##########MM##########################MM@@######################mmMMmm################@@++..    --##################@@@@##MM####              \n" +
"        ::..::::mmmm    mmMM##      mm@@@@@@########::@@MM######::@@############################::  MM######################--::@@################@@++    ++##############--######MMMM@@##mm            \n" +
"  ..    --..::++++mm    ++MM..      --MM##@@####mmmmMMMM@@##@@@@mm##############################MM--  ##mm@@MM@@##mm####@@MM##--mmMM##############MMmm    ++####@@########..@@####MM##mmMM@@--          \n" +
"          ++++mm..    --++MM          MM@@##@@MMMM@@::MM##@@mm@@########++####################@@    mmMM  mm  @@++MM########MM##  ::MM############@@mmmm--##--############..@@  ##@@@@@@  MM++          \n" +
"      ::  ::++mm      --MM          ..MMMM@@@@MMmm@@::MM@@mmMM######..########################mm..    ..--mm..  MM@@mm##@@@@MM@@..  --mm@@##########@@::..##mm############MM::  MMMM  ##    @@mm        \n" +
"      ....::::++    ----            ::MMMM@@MM++MM::mmMMmm@@##MM####  ##++##################@@mm..    ..++  ++::mm    ##MMMMmm@@MM    --++@@##########++..##--########@@@@@@    mmmm  ##mm    MM::      \n" +
"      ....++..++    ..              mm##@@@@MMmm++++++::MM##--@@MM@@::    @@@@############@@##MMmm            ::++    ##@@::MMmm@@      ::::@@########@@::    ##MM######@@      mm@@  ##mm    mmmm      \n" +
"      --..++        --            ..mm@@mmMMmmmm::--##::####MM##MM##      --@@################@@++              ::    ::  @@  ::++++    ::++@@##########MM++  ##MM######MM        mm  ::MM      mm      \n" +
"    ..--..mmmm                    ::mmMM  mm++++++::mmmm##@@@@mmmm++        mm@@##############@@mm              --    ..          MM--    ++mm############mm..  ######@@          @@    MM      ##      \n" +
"    ..::..::..    ..                  MMmmmm++++mm  --++@@##  ..++..        ::@@@@##########@@@@mm                                @@::    --##############MM@@  ##MM##@@          @@..  ##..    ..++    \n" +
"  ..  --..++      ..              mmMMMMmmmmmm++--  ++mmMMMM    mm          ::@@@@##############mm                                ++    ::MMMMmm##########@@@@  ######@@          ::    ##--      ##    \n" +
"  ----  ..mm      ..            ++mmMMmmmmmm++mm..MM++mm  mm    MM            MM@@############@@@@                                      ++MMMM############MM##  ########          ....  --mm      ::    \n" +
"      ----      ..              ++mm++mmmm++++::..::      mm    mm            ::@@##############MM            ..::                    ::##mm##@@############@@  @@@@MM##          ....    MM            \n" +
"    ::----                    ::mmmm++mm  ++++  ..        --    ++            --mm##############@@::              ++  mmmm++++mmmm::mm##MM@@##############@@##  ########          ....    mm        ::  \n" +
"    ----                        ++mm++..  ++..            ++                    ++##############@@@@                  mmMMMMMM@@mm@@MM@@@@##############MM++  MM####@@##          ..      ++        --  \n" +
"    --::                    --  mmmm++  ++::              MM                    ++##############@@mm                    ..++    mm@@@@################@@mm    ########MM          ..      ..            \n" +
"    --::                      ::++++mm  --..  mm          --                    MM@@##############MM                      ::  MMMM######################  --############                                \n" +
"    ::++                      ::::++  ..      ..          --                    MM::##############MM::                    ++MM####@@################@@      ############                                \n" +
"  ..::mm                    ++::::::  mm                                          ++##############MMmm        ..@@@@######@@####@@##################@@    --############                                \n" +
"    ::++                    ::++mm    --                                          mm++############@@++                  ++MM##################@@@@@@        ############                                \n" +
"    ::--                  ::::::    ::                                            mmmm############MMMM                ++MM::mm####@@##@@####@@@@@@##      mm######@@####                                \n" +
"    ::                      ++++                                                  ++##MM############mm                --    ################mm##MMMM      ######MM######                                \n" +
"    ::                      ::                                                  ++++++############MMmm            ##      @@############@@MM++..@@--    --####@@########--                              \n" +
"    ++                  --::::                                                  ::::##@@##########mm--          ++##    @@@@MM@@########mm  MM##        ##########@@##@@@@                              \n" +
"    ++                    ::++                                                ::--mm####@@########mm          @@####..--MM######@@####::  ....          --##########MMMM                                \n" +
"    mm                    --::                                                mmmm##############MM++      --######mmMMmmMM@@######mm..                  mm@@####mm####mm                                \n" +
"    ++                    ::..                                            ..@@@@################mm    ..++@@@@######mm########@@++                          ####mm####mmMM                              \n" +
"  --++                  ----                                            ..    @@##############MMMM    ##mm@@##################--                          ##MM######@@MM##..                            \n" +
"  --::                  ::--                                              MM--++##############mm@@    ::mm@@################::                            --++######++######                            \n" +
"  ----                    --                                                mm##################MM    ++@@################..                                  ##..      ####MM                          \n" +
"  ..--                    ::                                              @@##################@@mm      @@##############--                                    @@..        ####MMmm                      \n" +
"    ::..                  ++                                            MM@@##################@@mm      ################                                      ..--        ++######@@MM                  \n" +
"    ::                    ++                                          mmMM##################@@@@::      ################                                                      @@########mm              \n" +
"    ::                    ::                                        @@MM##mm################@@@@++--    ################                                                        ..######@@@@--          \n" +
"    ::..                  ++                                ##++@@######..##################@@MM++..    ################++                                                          @@######MM--        \n" +
"    ::--                  ++                              --  ##..MM  ##MM####################MM::      ##################                                                              ##MM@@@@::      \n" +
"    ::::                  ++                                ::..  mm  MM####################MMMM..    ::################++                                                                ####@@##::    \n" +
"    mm++                                                    @@      --##@@@@MM##############++MM::    MM##################                                                                  ######@@..  \n" +
"    ++++                                                  ++        ######..################MMMM::    ############----####..                                                                  ######@@  \n" +
"    ::::                                                          @@@@@@MM@@############@@@@  ::      ############    @@@@mm                                                                  ++######  \n" +
"    ::::                                                      @@##--  ::MM##############@@          @@##########mm      ##..                                                                  --######@@\n" +
"    ..::                                                    MM          @@##MM##########mm  MM      ############        ::++                                                                  ..########\n" +
"      ::--                                                              @@..mm##########            MM########                                                                                  ########\n" +
"      ::--                                                            @@@@mm::MM##@@##@@            @@######MM                                                                                ..####MM##\n" +
"      ::                                                              ::@@  MM@@######MM            ########                                                                                  ++####mm##\n" +
"      ::                                                            ##mm    ++########..          mm######--                                                                                  ########mm\n" +
"        --                                                        mm::++    MMmm####MM            MM######                                                                                    ######@@  \n" +
"        --                                                        ..        mm####@@@@            ######                                                                                    ####@@##@@  \n" +
"        --                                                      mm  ++    ++##MM####              @@##MM                                                                                  @@######@@    \n" +
"        ..                                                    ::          mm########            MM####                                                                                  ######MM@@      \n" +
"          ++                                                ..            ######@@##            @@####                                                                                ######@@@@        \n" +
"          --..                                                          mm@@######mm          --####                                                                    --      ..++##MM##@@..          \n" +
"            ::                                                    @@##@@########@@            @@####                                                                        @@MM@@MMmm@@                \n" +
"              ..                                                ..::##############            MM@@                                                                          --                          \n" +
"                                                              ..MM##############mm            ##                                                                                                        \n" +
"                                                            ##mmMM##############            MMMM                                                                                                        \n" +
"                                                            mmmm################            ##                                                                                                          \n" +
"                                                            MMMM@@##############          @@                                                                                                            \n" +
"                                                            ##@@################          ..                                                                                                            \n" +
"                                                              ################@@                                                                                                                        \n" +
"                                                              ##MM##############                                                                                                                        \n" +
"                                                              ##MM################..                                                                                                                    \n" +
"                                                              ##MM################  ..                                                                                                                  \n" +
"                                                              ##mm################mm                                                                                                                    \n" +
"                                                              ++@@##########@@++@@MM                                                                                                                    \n" +
"                                                              ::############--    MM                                                                                                                    \n" +
"                                                              ..############::                                                                                                                          \n" +
"                                                                ############--      mm                                                                                                                  \n" +
"                                                                ############MM                                                                                                                          \n" +
"                                                              ::##@@##########                                                                                                                          \n" +
"                                                              ++MM##########@@                                                                                                                          \n" +
"                                                              ::MMMMMM########@@::                                                                                                                      \n" +
"                                                              ++MMMMmm##############                                                                                                                    \n" +
"                                                        ..--::++MM##MMmmmm####@@####mmMMmm::..::::::----....                                                                                            \n" +
"                    ..--++++++++++++++::++++++++++MMmmMMmm++++::++++@@@@@@@@MMmmmmMMMMmm++mmMMmmMM@@@@MM++++::..                                                                                        \n" +
"                  --++++mmmmMMMMMMmmmmMMmm++++MMmm@@++::--::mmMM::@@++MMmm@@@@MM@@MM@@MMMMMMmmMMMM##@@MM@@MMMMMMMMMMMMMMMMmmmmmmmmmm++++::--..        \n"
                  + "");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
System.out.println(d10);
           // chamar função de combate
      }
        
        // Sistema de combate
//O jogador irá jogar um d10(dado de 10 lados) caso o valor for maior que 5 ele defende e contra-ataca
//Caso o valor for menor que 5 ele toma 5 de dano, 
//Ele tem que contra-atacar duas vezes, ou seja, tirar duas vezes no dado um número maior que 5
//Caso ele morra
//Você sofreu muito dano pelo fantasma, sem força você larga a espada no chão e cai sobre os pés do Jasquim, infelizmente esse é o seu infeliz fim. Fim de jogo.
//Caso ele contra-ataca 2 vezes segue a história.
        
        static void casa2(int walk){
          
          System.out.println("Você o ataca com sua espada e ele some, você sabe que ele ainda está pela casa \n ");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Jasquim – Isso aí, agora finalmente irei poder tomar conta desse lugar.\n"); 
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println( nomejogador + " – Ainda não, ele não se foi, ele parece estar ligado a essa casa, precisamos encontrar oque o prende aqui, quem era o antigo morador desse lugar-\n"); 
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Jasquim – Então, essa casa era uma loja antiga de itens mágicos, o antigo dono era um velho muito chato, quando éramos crianças eu e meus irmos víamos aqui espiar as coisas estranha que ele vendia, porém em um certo dia ele desapareceu e nunca mais vimos eles.\n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println( nomejogador + " – Hum.\n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Jasquim – Vamos terminar com isso logo, tenho muitos currículos ainda para vê, se a gente terminar com isso erei precisa de uma balconista e alguém de segurança, caso você canse dessa vida de monstro pode trabalhar para min.\n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println( nomejogador + " – hum.\n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Vocês continuam andando em direção ao fundo da casa, você tenta observar cada canto para ver se acha algo que possa ajudar a sumir com o espírito.\n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println( nomejogador + " – Tem duas belas damas que estou pensando em contratar,\n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println( nomejogador + " – hummm.\n");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}
          
          System.out.println("Jasquim – Elas são belas, será muito bom ter alguém assim para a minha loja de poções, porém ainda terei que ver os currículos delas, sabe quais são as informações mais importantes em um currículo-");
          System.out.println("Aperte enter para seguir\n"); 
          try{System.in.read();}
          catch(Exception e){}

          questaoDoisCasa(walk);
      }
 
        static void casa3(int walk){ 
         
         System.out.println("Jasquim – Isso mesmo, mas acho que vou escolher a Cary, ela é mais bonita.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println("De repente um vento ocorre dentro da casa, e o espírito aparece novamente  \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Fantasmas - Vocês não tomar essa casa de min AAAHHH.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
                 
         System.out.println("Novamente ele parte para cima de você \n "
                 + "  --                                                                          \n" +
"                                                                                                                              ++                                                                        \n" +
"                                                                                                                              MMMM                                                                      \n" +
"                                                                                                                                ++..                                                                    \n" +
"                                                                                                                        ....--....@@      ::++--                                                        \n" +
"                                                                                                  ....                --++++++::::mmmm::--mm::mm--                                                      \n" +
"                                                                                              --      mm              ::MM::::..MM++@@--@@++mm@@mm::..                                                  \n" +
"                                                                                            ......--..++          ..::mmMM@@@@@@##mm@@mm::mmmmmmMMmm::..                                                \n" +
"                                                                                ..          --    ::::mm----    ..::mmMM@@########MMMMMM@@##@@mm@@MMmm--                                                \n" +
"                                                                                  --..    --..  ..::mmMMmm@@..  ++++@@##@@######################@@##@@mm--                                              \n" +
"                                                                                  ..--..  --------++MMMM@@MM@@++mm++@@################################MM++                                              \n" +
"                                                                              ..--::    ..mm::::++MM##@@@@@@MMMMMM####################################@@++--                                            \n" +
"                                                                                    --::++mmMMMMMM@@####@@@@MM@@######################################@@++::                                            \n" +
"                                                                                ..--::++MMmmmmMM@@MM######@@MM++@@######################################mmmm                                            \n" +
"                                                                            --  --  ::++++::mmmm##########@@@@@@####################################MM@@++mm                                            \n" +
"                                                                        ..      ......::mm++::::::######@@MMMM##@@##################################++@@MMMM                                            \n" +
"                                                                      ..        ..--mm++##MM########@@@@##MMMM######################################..@@mm                                              \n" +
"                                                                            ..  ..++MM##################mm##MM####@@############################MM##MM##mm                                              \n" +
"                                                                            --  ++++##MM############@@@@####@@mm##..####  ################@@--..##MM##@@mm                                              \n" +
"                                                                          ..  ::mm##################MM@@############MM##MM  ..MM##########  ..##@@mm##MM::                                              \n" +
"                                                                            @@######################MM##########@@############MMmm##--##::##@@####::##@@                                                \n" +
"                                                                        ..MM######@@################MM@@##############::##########MM  ##########::++MM                                                  \n" +
"                                                                      --::######@@####################################@@::########..  MM####MM++::@@##                                                  \n" +
"                                                                    ....mm############################################@@::::######--MMMM@@##  ..####::                                                  \n" +
"                                                                  --  mm##############################MM####@@mm########@@  ..##MM######....  MM####..                                                  \n" +
"                                                                    mmMM##############################mm##################mm::....mm  ::..  MM####mm                                                    \n" +
"                                                                  ++################@@################::@@####################++          mm@@####++::                                                  \n" +
"                                                                --mm##MM##############################++####@@##################....  ::@@######MMmmmm                                                  \n" +
"                                                            ..--++##################################@@mm##@@MM##@@##MM##########################mmmmmm::                                                \n" +
"                                                            ..MM####################################@@mm########@@##############################MMMM++MM                                                \n" +
"                                                      --..::++MM####################################MM@@####MM############@@##############@@####@@@@mm++                                                \n" +
"                                                ..::....mmMMMM####################MM################mm########++################################@@@@MM++mm                                              \n" +
"                                              ::::----@@mm@@##############@@######++################MMMM################@@######################@@####MM--                                              \n" +
"                                            ....  @@@@mmmm@@####################++mm@@##############@@############MM##################################mm::--                                            \n" +
"                                            ..::mmMMMM++@@MM@@##################::####################################################################MM::mm                                            \n" +
"                                    ..--++--::++MMMMMM##@@####################@@++####################@@############################################@@##mm::..                                          \n" +
"                                    ::++::##MM####MM##########################@@MM######################################################################mm++mm                                          \n" +
"                                ----@@++@@##mm--@@############################mmMM####################@@############################@@####################++mm::                                        \n" +
"                            ....--::mm++####@@MM################################@@####@@##############@@##########################::@@@@##########@@########++++                                        \n" +
"                        ........::MM::######@@####################################@@##@@################################@@####@@##  ..mm@@##@@##############mm++--                                      \n" +
"                      ..  ::::--MMmm####MM############################################mm################################..    ##mmMM    MM##@@####@@##########++                                        \n" +
"                          ::mm++mm####@@@@############################################mm################################      mm::MM    ++######################::                                      \n" +
"                        ..++mm##@@####mm##############################@@MM############@@################################          MM++  MM##mm####################++                                    \n" +
"                        ++MM##MM####@@################################mm@@############@@########@@####################MM          ..++  mm##MM################--@@--                                    \n" +
"                      ::##mm######@@##################################@@##############mm##############################                mm::##MM####################MM                                    \n" +
"                    --mmMM######MM##############::####################@@@@############++##############################                --..@@##@@################mm@@::                                  \n" +
"                    ++MM######MMMM############@@######################MM@@############++############################..                    ####MMMM##########MM    ::..                                  \n" +
"                  ..##@@####@@########################################################mm############MM##############                      mm##  @@##########mm++    ::                                  \n" +
"                ..mm######@@##############@@##########################################++##############@@##########--                      ..MM  mm##########@@MM      ..                                \n" +
"                ..@@@@@@@@@@############################################@@############mm@@####################MM@@                          ++..@@::##########mm      --                                \n" +
"              --++##MM@@MM##############@@############################################++mm##################MM##@@                          --  ++############++..                                      \n" +
"                MMMM::MMMM@@##########@@@@##################MM########################mm++##################@@@@mm..                              ##@@########++MM                                      \n" +
"            ----mm::--::@@@@@@######@@MMMM@@################MM##########################MMMM++####################MMmm                            ##@@########@@mm                                      \n" +
"            --++++  ----MMMM@@####@@@@mm@@MM################@@############################MMMM##################@@@@MMmm--                        @@::########MMmm                                      \n" +
"            ..mmMM      ++MM@@@@@@@@@@mm--  ##@@############MM################################MM########################MMMM                      --mm@@######@@mm                                      \n" +
"          ----mm        ++@@@@@@@@MMmm--  ..MM@@##@@########::##################################MM####################@@@@@@mm::                    ##@@########mm++                                    \n" +
"          --::          ++MMMM@@MM--      ::::@@##@@########MM##::################################@@########################@@@@MM::--              ::++########mmMM                                    \n" +
"        ..--::        ..mmmmMMmmmm      ::  mm@@##@@######@@@@@@mm####################################MM######################@@MMMMmmMMmm          ::--########@@MM..                                  \n" +
"        ::          ....++mmMM++            MM@@@@@@################################################################################@@MMmmmmMM        ::mm######MMmm                                    \n" +
"        --            --mmmmmm              MM@@##@@##########@@##########################################@@MM##############################@@@@mmmm..++MM########MMmm                                  \n" +
"        ..--          ::mmmm--            mmMM@@@@########@@@@mm############################################@@MM##########################@@####mm--    mmMM######MMmm                                  \n" +
"      --..            mmmmmm            ++mmMM@@@@##########@@MM################################################mm################@@##############MM::--mmMM######@@mm++::                              \n" +
"      ..            --mmmmMM  ::        mm@@@@##################mm################@@############################MM####@@@@############################MM--##########mmmm--                              \n" +
"      ..          ....mmmm..++::--  ..--mmMM######################################################################::@@@@##@@########@@MMmm######@@######@@##++######mmmmmm                              \n" +
"      ..        ....mmmmmmmmmmmm++--mmMMMMMM######################@@################################################@@@@####MMMM####@@MM@@    --mm############::::##@@MM++mm                            \n" +
"      ..        ..::++mmMMmmMMMMMMmmmmMM@@@@@@##################MM################@@################################MM++######@@########mmMM          ::##MM####MM##..mmMM::..                          \n" +
"      --      ..  ++mmMMMM@@MMMM@@MM@@@@##@@################@@##@@####################################################MM############@@##MMMMMM            ..######@@@@++mmMM                            \n" +
"      ::        ::++++MMMMMMMMMMMM@@@@####@@@@################@@@@####################################################################@@MMMMMMmm          --####@@####@@::mm++                          \n" +
"      ++      ::--mmMMMMMM@@MMMM@@##@@####@@##################MM##########################################################################@@####..          ##############  --                          \n" +
"    --++        ..++MMMM@@@@MM@@########################################################################################@@################MMmm@@##::        MM##############++                          \n" +
"    ..        ..--mmMMMM@@@@MM##############################MM############################################################@@##############MMmm..  ++::    ::++################MM                        \n" +
"    --        ....MMMM@@##@@@@########@@##@@##################@@##########################################################################@@mm++    --    ::++########@@########mm                      \n" +
"    --    --....--MM@@@@@@@@########@@@@@@@@##############@@@@################################################################@@############MM::::        ::MM##########@@########::                    \n" +
"    --    ------++MMMM@@MMMM##########@@@@##############MM####################################################################################++++      --  ########################MM                  \n" +
"    ::    ----..MMMMMMmm@@@@##@@##  ..mm##########MM######mm######MM##########################++##########################mm####################mm::      ::####@@########MM##MM######++                \n" +
"    ::    --..--mmmmmm  MM@@##MMmm    MM##########@@##@@mm##########MM##########################MM@@######################mmMMmm################@@++..    --##################@@@@##MM####              \n" +
"        ::..::::mmmm    mmMM##      mm@@@@@@########::@@MM######::@@############################::  MM######################--::@@################@@++    ++##############--######MMMM@@##mm            \n" +
"  ..    --..::++++mm    ++MM..      --MM##@@####mmmmMMMM@@##@@@@mm##############################MM--  ##mm@@MM@@##mm####@@MM##--mmMM##############MMmm    ++####@@########..@@####MM##mmMM@@--          \n" +
"          ++++mm..    --++MM          MM@@##@@MMMM@@::MM##@@mm@@########++####################@@    mmMM  mm  @@++MM########MM##  ::MM############@@mmmm--##--############..@@  ##@@@@@@  MM++          \n" +
"      ::  ::++mm      --MM          ..MMMM@@@@MMmm@@::MM@@mmMM######..########################mm..    ..--mm..  MM@@mm##@@@@MM@@..  --mm@@##########@@::..##mm############MM::  MMMM  ##    @@mm        \n" +
"      ....::::++    ----            ::MMMM@@MM++MM::mmMMmm@@##MM####  ##++##################@@mm..    ..++  ++::mm    ##MMMMmm@@MM    --++@@##########++..##--########@@@@@@    mmmm  ##mm    MM::      \n" +
"      ....++..++    ..              mm##@@@@MMmm++++++::MM##--@@MM@@::    @@@@############@@##MMmm            ::++    ##@@::MMmm@@      ::::@@########@@::    ##MM######@@      mm@@  ##mm    mmmm      \n" +
"      --..++        --            ..mm@@mmMMmmmm::--##::####MM##MM##      --@@################@@++              ::    ::  @@  ::++++    ::++@@##########MM++  ##MM######MM        mm  ::MM      mm      \n" +
"    ..--..mmmm                    ::mmMM  mm++++++::mmmm##@@@@mmmm++        mm@@##############@@mm              --    ..          MM--    ++mm############mm..  ######@@          @@    MM      ##      \n" +
"    ..::..::..    ..                  MMmmmm++++mm  --++@@##  ..++..        ::@@@@##########@@@@mm                                @@::    --##############MM@@  ##MM##@@          @@..  ##..    ..++    \n" +
"  ..  --..++      ..              mmMMMMmmmmmm++--  ++mmMMMM    mm          ::@@@@##############mm                                ++    ::MMMMmm##########@@@@  ######@@          ::    ##--      ##    \n" +
"  ----  ..mm      ..            ++mmMMmmmmmm++mm..MM++mm  mm    MM            MM@@############@@@@                                      ++MMMM############MM##  ########          ....  --mm      ::    \n" +
"      ----      ..              ++mm++mmmm++++::..::      mm    mm            ::@@##############MM            ..::                    ::##mm##@@############@@  @@@@MM##          ....    MM            \n" +
"    ::----                    ::mmmm++mm  ++++  ..        --    ++            --mm##############@@::              ++  mmmm++++mmmm::mm##MM@@##############@@##  ########          ....    mm        ::  \n" +
"    ----                        ++mm++..  ++..            ++                    ++##############@@@@                  mmMMMMMM@@mm@@MM@@@@##############MM++  MM####@@##          ..      ++        --  \n" +
"    --::                    --  mmmm++  ++::              MM                    ++##############@@mm                    ..++    mm@@@@################@@mm    ########MM          ..      ..            \n" +
"    --::                      ::++++mm  --..  mm          --                    MM@@##############MM                      ::  MMMM######################  --############                                \n" +
"    ::++                      ::::++  ..      ..          --                    MM::##############MM::                    ++MM####@@################@@      ############                                \n" +
"  ..::mm                    ++::::::  mm                                          ++##############MMmm        ..@@@@######@@####@@##################@@    --############                                \n" +
"    ::++                    ::++mm    --                                          mm++############@@++                  ++MM##################@@@@@@        ############                                \n" +
"    ::--                  ::::::    ::                                            mmmm############MMMM                ++MM::mm####@@##@@####@@@@@@##      mm######@@####                                \n" +
"    ::                      ++++                                                  ++##MM############mm                --    ################mm##MMMM      ######MM######                                \n" +
"    ::                      ::                                                  ++++++############MMmm            ##      @@############@@MM++..@@--    --####@@########--                              \n" +
"    ++                  --::::                                                  ::::##@@##########mm--          ++##    @@@@MM@@########mm  MM##        ##########@@##@@@@                              \n" +
"    ++                    ::++                                                ::--mm####@@########mm          @@####..--MM######@@####::  ....          --##########MMMM                                \n" +
"    mm                    --::                                                mmmm##############MM++      --######mmMMmmMM@@######mm..                  mm@@####mm####mm                                \n" +
"    ++                    ::..                                            ..@@@@################mm    ..++@@@@######mm########@@++                          ####mm####mmMM                              \n" +
"  --++                  ----                                            ..    @@##############MMMM    ##mm@@##################--                          ##MM######@@MM##..                            \n" +
"  --::                  ::--                                              MM--++##############mm@@    ::mm@@################::                            --++######++######                            \n" +
"  ----                    --                                                mm##################MM    ++@@################..                                  ##..      ####MM                          \n" +
"  ..--                    ::                                              @@##################@@mm      @@##############--                                    @@..        ####MMmm                      \n" +
"    ::..                  ++                                            MM@@##################@@mm      ################                                      ..--        ++######@@MM                  \n" +
"    ::                    ++                                          mmMM##################@@@@::      ################                                                      @@########mm              \n" +
"    ::                    ::                                        @@MM##mm################@@@@++--    ################                                                        ..######@@@@--          \n" +
"    ::..                  ++                                ##++@@######..##################@@MM++..    ################++                                                          @@######MM--        \n" +
"    ::--                  ++                              --  ##..MM  ##MM####################MM::      ##################                                                              ##MM@@@@::      \n" +
"    ::::                  ++                                ::..  mm  MM####################MMMM..    ::################++                                                                ####@@##::    \n" +
"    mm++                                                    @@      --##@@@@MM##############++MM::    MM##################                                                                  ######@@..  \n" +
"    ++++                                                  ++        ######..################MMMM::    ############----####..                                                                  ######@@  \n" +
"    ::::                                                          @@@@@@MM@@############@@@@  ::      ############    @@@@mm                                                                  ++######  \n" +
"    ::::                                                      @@##--  ::MM##############@@          @@##########mm      ##..                                                                  --######@@\n" +
"    ..::                                                    MM          @@##MM##########mm  MM      ############        ::++                                                                  ..########\n" +
"      ::--                                                              @@..mm##########            MM########                                                                                  ########\n" +
"      ::--                                                            @@@@mm::MM##@@##@@            @@######MM                                                                                ..####MM##\n" +
"      ::                                                              ::@@  MM@@######MM            ########                                                                                  ++####mm##\n" +
"      ::                                                            ##mm    ++########..          mm######--                                                                                  ########mm\n" +
"        --                                                        mm::++    MMmm####MM            MM######                                                                                    ######@@  \n" +
"        --                                                        ..        mm####@@@@            ######                                                                                    ####@@##@@  \n" +
"        --                                                      mm  ++    ++##MM####              @@##MM                                                                                  @@######@@    \n" +
"        ..                                                    ::          mm########            MM####                                                                                  ######MM@@      \n" +
"          ++                                                ..            ######@@##            @@####                                                                                ######@@@@        \n" +
"          --..                                                          mm@@######mm          --####                                                                    --      ..++##MM##@@..          \n" +
"            ::                                                    @@##@@########@@            @@####                                                                        @@MM@@MMmm@@                \n" +
"              ..                                                ..::##############            MM@@                                                                          --                          \n" +
"                                                              ..MM##############mm            ##                                                                                                        \n" +
"                                                            ##mmMM##############            MMMM                                                                                                        \n" +
"                                                            mmmm################            ##                                                                                                          \n" +
"                                                            MMMM@@##############          @@                                                                                                            \n" +
"                                                            ##@@################          ..                                                                                                            \n" +
"                                                              ################@@                                                                                                                        \n" +
"                                                              ##MM##############                                                                                                                        \n" +
"                                                              ##MM################..                                                                                                                    \n" +
"                                                              ##MM################  ..                                                                                                                  \n" +
"                                                              ##mm################mm                                                                                                                    \n" +
"                                                              ++@@##########@@++@@MM                                                                                                                    \n" +
"                                                              ::############--    MM                                                                                                                    \n" +
"                                                              ..############::                                                                                                                          \n" +
"                                                                ############--      mm                                                                                                                  \n" +
"                                                                ############MM                                                                                                                          \n" +
"                                                              ::##@@##########                                                                                                                          \n" +
"                                                              ++MM##########@@                                                                                                                          \n" +
"                                                              ::MMMMMM########@@::                                                                                                                      \n" +
"                                                              ++MMMMmm##############                                                                                                                    \n" +
"                                                        ..--::++MM##MMmmmm####@@####mmMMmm::..::::::----....                                                                                            \n" +
"                    ..--++++++++++++++::++++++++++MMmmMMmm++++::++++@@@@@@@@MMmmmmMMMMmm++mmMMmmMM@@@@MM++++::..                                                                                        \n" +
"                  --++++mmmmMMMMMMmmmmMMmm++++MMmm@@++::--::mmMM::@@++MMmm@@@@MM@@MM@@MMMMMMmmMMMM##@@MM@@MMMMMMMMMMMMMMMMmmmmmmmmmm++++::--..        \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
System.out.println(d010);
 // chamar função de combate
         
     }
        
        //     Sistema de combate
//O jogador irá jogar um d10(dado de 10 lados) caso o valor for maior que 5 ele defende e contra-ataca
//Caso o valor for menor que 5 ele toma 5 de dano, 
//Ele tem que contra-atacar duas vezes, ou seja, tirar duas vezes no dado um número maior que 5
//Caso ele morra
//Você sofreu muito dano pelo fantasma, sem força você larga a espada no chão e cai sobre os pés do Jasquim, infelizmente esse é o seu infeliz fim. Fim de jogo.
//Caso ele contra-ataca 2 vezes segue a história.
        
     static void casa4(int walk){ 
          
         System.out.println("E mais uma vez ele e derrotado, porém você sente que ele não sumiu de novo\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
          
         System.out.println( nomejogador + " – Deve te algo o prendendo aqui, vamos procurar qualquer coisa que pode estar ligado a ele \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
        
         System.out.println(" Passa alguns minutos e vocês acham uma espécie de escritório e lá dento está tudo bagunçado e ainda resta vários livros e papeis pelo chão \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println("Jasquim – Olha herói Jogador, uma carta.\n" );
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Você pega o a carta e começa a ler.\n" );
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Eu sei que tenho que pagar para eles, porém não vou da um tostão meu, vou me esconder por um tempo e eles vão parar de me seguir uma hora ou outra, quando você ler esse bilhete peço que me encontre no esconderijo, você sabe que para vim para cá deve achar aquilo que fala sobre; \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Existem várias porem duas são as principais para me achar, siga as teorias  principais \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println("Jasquim – Oque será que isso quer dizer\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Você pelo chão vários livros, alguns de histórias e outros didáticos.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println( nomejogador +" – Acho que eu sei.\n" );
          System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Você tenta procurar nos montes dos livros algo que tenha relação sobre a informação obtida na carta, seguindo oque ela diz, qual  seria o livro que você deve achar a resposta ");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         questaoTresCasa(walk);
          
      }
        

        
        static void casa5(int walk){ 
   
         System.out.println("Você olha para frente e ver uma estante com alguns livros, você tira o livro que fala sobre ADM Clássica e Cientifica e ouve um som, ao olha para traz o piso se abre e revela uma passagem ao subsolo  \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println( nomejogador + " – Acho que estamos quase acabando \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println("Jasquim – Espero \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
        
         System.out.println("Ao descer a escadas vocês veem em uma cama um cadáver.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println( nomejogador +" -  achei, esse deve ser o corpo do espírito que assombra essa casa, devo queimá-lo o quanto antes, e só assim ele estará livre\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Quando você se aproxima o espírito aparece mais uma vez\n" );
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         
         System.out.println(" Espírito – Não!!\n" );
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println(" Ele parte para cima de você mais uma vez\n"
                 + "  --                                                                          \n" +
"                                                                                                                              ++                                                                        \n" +
"                                                                                                                              MMMM                                                                      \n" +
"                                                                                                                                ++..                                                                    \n" +
"                                                                                                                        ....--....@@      ::++--                                                        \n" +
"                                                                                                  ....                --++++++::::mmmm::--mm::mm--                                                      \n" +
"                                                                                              --      mm              ::MM::::..MM++@@--@@++mm@@mm::..                                                  \n" +
"                                                                                            ......--..++          ..::mmMM@@@@@@##mm@@mm::mmmmmmMMmm::..                                                \n" +
"                                                                                ..          --    ::::mm----    ..::mmMM@@########MMMMMM@@##@@mm@@MMmm--                                                \n" +
"                                                                                  --..    --..  ..::mmMMmm@@..  ++++@@##@@######################@@##@@mm--                                              \n" +
"                                                                                  ..--..  --------++MMMM@@MM@@++mm++@@################################MM++                                              \n" +
"                                                                              ..--::    ..mm::::++MM##@@@@@@MMMMMM####################################@@++--                                            \n" +
"                                                                                    --::++mmMMMMMM@@####@@@@MM@@######################################@@++::                                            \n" +
"                                                                                ..--::++MMmmmmMM@@MM######@@MM++@@######################################mmmm                                            \n" +
"                                                                            --  --  ::++++::mmmm##########@@@@@@####################################MM@@++mm                                            \n" +
"                                                                        ..      ......::mm++::::::######@@MMMM##@@##################################++@@MMMM                                            \n" +
"                                                                      ..        ..--mm++##MM########@@@@##MMMM######################################..@@mm                                              \n" +
"                                                                            ..  ..++MM##################mm##MM####@@############################MM##MM##mm                                              \n" +
"                                                                            --  ++++##MM############@@@@####@@mm##..####  ################@@--..##MM##@@mm                                              \n" +
"                                                                          ..  ::mm##################MM@@############MM##MM  ..MM##########  ..##@@mm##MM::                                              \n" +
"                                                                            @@######################MM##########@@############MMmm##--##::##@@####::##@@                                                \n" +
"                                                                        ..MM######@@################MM@@##############::##########MM  ##########::++MM                                                  \n" +
"                                                                      --::######@@####################################@@::########..  MM####MM++::@@##                                                  \n" +
"                                                                    ....mm############################################@@::::######--MMMM@@##  ..####::                                                  \n" +
"                                                                  --  mm##############################MM####@@mm########@@  ..##MM######....  MM####..                                                  \n" +
"                                                                    mmMM##############################mm##################mm::....mm  ::..  MM####mm                                                    \n" +
"                                                                  ++################@@################::@@####################++          mm@@####++::                                                  \n" +
"                                                                --mm##MM##############################++####@@##################....  ::@@######MMmmmm                                                  \n" +
"                                                            ..--++##################################@@mm##@@MM##@@##MM##########################mmmmmm::                                                \n" +
"                                                            ..MM####################################@@mm########@@##############################MMMM++MM                                                \n" +
"                                                      --..::++MM####################################MM@@####MM############@@##############@@####@@@@mm++                                                \n" +
"                                                ..::....mmMMMM####################MM################mm########++################################@@@@MM++mm                                              \n" +
"                                              ::::----@@mm@@##############@@######++################MMMM################@@######################@@####MM--                                              \n" +
"                                            ....  @@@@mmmm@@####################++mm@@##############@@############MM##################################mm::--                                            \n" +
"                                            ..::mmMMMM++@@MM@@##################::####################################################################MM::mm                                            \n" +
"                                    ..--++--::++MMMMMM##@@####################@@++####################@@############################################@@##mm::..                                          \n" +
"                                    ::++::##MM####MM##########################@@MM######################################################################mm++mm                                          \n" +
"                                ----@@++@@##mm--@@############################mmMM####################@@############################@@####################++mm::                                        \n" +
"                            ....--::mm++####@@MM################################@@####@@##############@@##########################::@@@@##########@@########++++                                        \n" +
"                        ........::MM::######@@####################################@@##@@################################@@####@@##  ..mm@@##@@##############mm++--                                      \n" +
"                      ..  ::::--MMmm####MM############################################mm################################..    ##mmMM    MM##@@####@@##########++                                        \n" +
"                          ::mm++mm####@@@@############################################mm################################      mm::MM    ++######################::                                      \n" +
"                        ..++mm##@@####mm##############################@@MM############@@################################          MM++  MM##mm####################++                                    \n" +
"                        ++MM##MM####@@################################mm@@############@@########@@####################MM          ..++  mm##MM################--@@--                                    \n" +
"                      ::##mm######@@##################################@@##############mm##############################                mm::##MM####################MM                                    \n" +
"                    --mmMM######MM##############::####################@@@@############++##############################                --..@@##@@################mm@@::                                  \n" +
"                    ++MM######MMMM############@@######################MM@@############++############################..                    ####MMMM##########MM    ::..                                  \n" +
"                  ..##@@####@@########################################################mm############MM##############                      mm##  @@##########mm++    ::                                  \n" +
"                ..mm######@@##############@@##########################################++##############@@##########--                      ..MM  mm##########@@MM      ..                                \n" +
"                ..@@@@@@@@@@############################################@@############mm@@####################MM@@                          ++..@@::##########mm      --                                \n" +
"              --++##MM@@MM##############@@############################################++mm##################MM##@@                          --  ++############++..                                      \n" +
"                MMMM::MMMM@@##########@@@@##################MM########################mm++##################@@@@mm..                              ##@@########++MM                                      \n" +
"            ----mm::--::@@@@@@######@@MMMM@@################MM##########################MMMM++####################MMmm                            ##@@########@@mm                                      \n" +
"            --++++  ----MMMM@@####@@@@mm@@MM################@@############################MMMM##################@@@@MMmm--                        @@::########MMmm                                      \n" +
"            ..mmMM      ++MM@@@@@@@@@@mm--  ##@@############MM################################MM########################MMMM                      --mm@@######@@mm                                      \n" +
"          ----mm        ++@@@@@@@@MMmm--  ..MM@@##@@########::##################################MM####################@@@@@@mm::                    ##@@########mm++                                    \n" +
"          --::          ++MMMM@@MM--      ::::@@##@@########MM##::################################@@########################@@@@MM::--              ::++########mmMM                                    \n" +
"        ..--::        ..mmmmMMmmmm      ::  mm@@##@@######@@@@@@mm####################################MM######################@@MMMMmmMMmm          ::--########@@MM..                                  \n" +
"        ::          ....++mmMM++            MM@@@@@@################################################################################@@MMmmmmMM        ::mm######MMmm                                    \n" +
"        --            --mmmmmm              MM@@##@@##########@@##########################################@@MM##############################@@@@mmmm..++MM########MMmm                                  \n" +
"        ..--          ::mmmm--            mmMM@@@@########@@@@mm############################################@@MM##########################@@####mm--    mmMM######MMmm                                  \n" +
"      --..            mmmmmm            ++mmMM@@@@##########@@MM################################################mm################@@##############MM::--mmMM######@@mm++::                              \n" +
"      ..            --mmmmMM  ::        mm@@@@##################mm################@@############################MM####@@@@############################MM--##########mmmm--                              \n" +
"      ..          ....mmmm..++::--  ..--mmMM######################################################################::@@@@##@@########@@MMmm######@@######@@##++######mmmmmm                              \n" +
"      ..        ....mmmmmmmmmmmm++--mmMMMMMM######################@@################################################@@@@####MMMM####@@MM@@    --mm############::::##@@MM++mm                            \n" +
"      ..        ..::++mmMMmmMMMMMMmmmmMM@@@@@@##################MM################@@################################MM++######@@########mmMM          ::##MM####MM##..mmMM::..                          \n" +
"      --      ..  ++mmMMMM@@MMMM@@MM@@@@##@@################@@##@@####################################################MM############@@##MMMMMM            ..######@@@@++mmMM                            \n" +
"      ::        ::++++MMMMMMMMMMMM@@@@####@@@@################@@@@####################################################################@@MMMMMMmm          --####@@####@@::mm++                          \n" +
"      ++      ::--mmMMMMMM@@MMMM@@##@@####@@##################MM##########################################################################@@####..          ##############  --                          \n" +
"    --++        ..++MMMM@@@@MM@@########################################################################################@@################MMmm@@##::        MM##############++                          \n" +
"    ..        ..--mmMMMM@@@@MM##############################MM############################################################@@##############MMmm..  ++::    ::++################MM                        \n" +
"    --        ....MMMM@@##@@@@########@@##@@##################@@##########################################################################@@mm++    --    ::++########@@########mm                      \n" +
"    --    --....--MM@@@@@@@@########@@@@@@@@##############@@@@################################################################@@############MM::::        ::MM##########@@########::                    \n" +
"    --    ------++MMMM@@MMMM##########@@@@##############MM####################################################################################++++      --  ########################MM                  \n" +
"    ::    ----..MMMMMMmm@@@@##@@##  ..mm##########MM######mm######MM##########################++##########################mm####################mm::      ::####@@########MM##MM######++                \n" +
"    ::    --..--mmmmmm  MM@@##MMmm    MM##########@@##@@mm##########MM##########################MM@@######################mmMMmm################@@++..    --##################@@@@##MM####              \n" +
"        ::..::::mmmm    mmMM##      mm@@@@@@########::@@MM######::@@############################::  MM######################--::@@################@@++    ++##############--######MMMM@@##mm            \n" +
"  ..    --..::++++mm    ++MM..      --MM##@@####mmmmMMMM@@##@@@@mm##############################MM--  ##mm@@MM@@##mm####@@MM##--mmMM##############MMmm    ++####@@########..@@####MM##mmMM@@--          \n" +
"          ++++mm..    --++MM          MM@@##@@MMMM@@::MM##@@mm@@########++####################@@    mmMM  mm  @@++MM########MM##  ::MM############@@mmmm--##--############..@@  ##@@@@@@  MM++          \n" +
"      ::  ::++mm      --MM          ..MMMM@@@@MMmm@@::MM@@mmMM######..########################mm..    ..--mm..  MM@@mm##@@@@MM@@..  --mm@@##########@@::..##mm############MM::  MMMM  ##    @@mm        \n" +
"      ....::::++    ----            ::MMMM@@MM++MM::mmMMmm@@##MM####  ##++##################@@mm..    ..++  ++::mm    ##MMMMmm@@MM    --++@@##########++..##--########@@@@@@    mmmm  ##mm    MM::      \n" +
"      ....++..++    ..              mm##@@@@MMmm++++++::MM##--@@MM@@::    @@@@############@@##MMmm            ::++    ##@@::MMmm@@      ::::@@########@@::    ##MM######@@      mm@@  ##mm    mmmm      \n" +
"      --..++        --            ..mm@@mmMMmmmm::--##::####MM##MM##      --@@################@@++              ::    ::  @@  ::++++    ::++@@##########MM++  ##MM######MM        mm  ::MM      mm      \n" +
"    ..--..mmmm                    ::mmMM  mm++++++::mmmm##@@@@mmmm++        mm@@##############@@mm              --    ..          MM--    ++mm############mm..  ######@@          @@    MM      ##      \n" +
"    ..::..::..    ..                  MMmmmm++++mm  --++@@##  ..++..        ::@@@@##########@@@@mm                                @@::    --##############MM@@  ##MM##@@          @@..  ##..    ..++    \n" +
"  ..  --..++      ..              mmMMMMmmmmmm++--  ++mmMMMM    mm          ::@@@@##############mm                                ++    ::MMMMmm##########@@@@  ######@@          ::    ##--      ##    \n" +
"  ----  ..mm      ..            ++mmMMmmmmmm++mm..MM++mm  mm    MM            MM@@############@@@@                                      ++MMMM############MM##  ########          ....  --mm      ::    \n" +
"      ----      ..              ++mm++mmmm++++::..::      mm    mm            ::@@##############MM            ..::                    ::##mm##@@############@@  @@@@MM##          ....    MM            \n" +
"    ::----                    ::mmmm++mm  ++++  ..        --    ++            --mm##############@@::              ++  mmmm++++mmmm::mm##MM@@##############@@##  ########          ....    mm        ::  \n" +
"    ----                        ++mm++..  ++..            ++                    ++##############@@@@                  mmMMMMMM@@mm@@MM@@@@##############MM++  MM####@@##          ..      ++        --  \n" +
"    --::                    --  mmmm++  ++::              MM                    ++##############@@mm                    ..++    mm@@@@################@@mm    ########MM          ..      ..            \n" +
"    --::                      ::++++mm  --..  mm          --                    MM@@##############MM                      ::  MMMM######################  --############                                \n" +
"    ::++                      ::::++  ..      ..          --                    MM::##############MM::                    ++MM####@@################@@      ############                                \n" +
"  ..::mm                    ++::::::  mm                                          ++##############MMmm        ..@@@@######@@####@@##################@@    --############                                \n" +
"    ::++                    ::++mm    --                                          mm++############@@++                  ++MM##################@@@@@@        ############                                \n" +
"    ::--                  ::::::    ::                                            mmmm############MMMM                ++MM::mm####@@##@@####@@@@@@##      mm######@@####                                \n" +
"    ::                      ++++                                                  ++##MM############mm                --    ################mm##MMMM      ######MM######                                \n" +
"    ::                      ::                                                  ++++++############MMmm            ##      @@############@@MM++..@@--    --####@@########--                              \n" +
"    ++                  --::::                                                  ::::##@@##########mm--          ++##    @@@@MM@@########mm  MM##        ##########@@##@@@@                              \n" +
"    ++                    ::++                                                ::--mm####@@########mm          @@####..--MM######@@####::  ....          --##########MMMM                                \n" +
"    mm                    --::                                                mmmm##############MM++      --######mmMMmmMM@@######mm..                  mm@@####mm####mm                                \n" +
"    ++                    ::..                                            ..@@@@################mm    ..++@@@@######mm########@@++                          ####mm####mmMM                              \n" +
"  --++                  ----                                            ..    @@##############MMMM    ##mm@@##################--                          ##MM######@@MM##..                            \n" +
"  --::                  ::--                                              MM--++##############mm@@    ::mm@@################::                            --++######++######                            \n" +
"  ----                    --                                                mm##################MM    ++@@################..                                  ##..      ####MM                          \n" +
"  ..--                    ::                                              @@##################@@mm      @@##############--                                    @@..        ####MMmm                      \n" +
"    ::..                  ++                                            MM@@##################@@mm      ################                                      ..--        ++######@@MM                  \n" +
"    ::                    ++                                          mmMM##################@@@@::      ################                                                      @@########mm              \n" +
"    ::                    ::                                        @@MM##mm################@@@@++--    ################                                                        ..######@@@@--          \n" +
"    ::..                  ++                                ##++@@######..##################@@MM++..    ################++                                                          @@######MM--        \n" +
"    ::--                  ++                              --  ##..MM  ##MM####################MM::      ##################                                                              ##MM@@@@::      \n" +
"    ::::                  ++                                ::..  mm  MM####################MMMM..    ::################++                                                                ####@@##::    \n" +
"    mm++                                                    @@      --##@@@@MM##############++MM::    MM##################                                                                  ######@@..  \n" +
"    ++++                                                  ++        ######..################MMMM::    ############----####..                                                                  ######@@  \n" +
"    ::::                                                          @@@@@@MM@@############@@@@  ::      ############    @@@@mm                                                                  ++######  \n" +
"    ::::                                                      @@##--  ::MM##############@@          @@##########mm      ##..                                                                  --######@@\n" +
"    ..::                                                    MM          @@##MM##########mm  MM      ############        ::++                                                                  ..########\n" +
"      ::--                                                              @@..mm##########            MM########                                                                                  ########\n" +
"      ::--                                                            @@@@mm::MM##@@##@@            @@######MM                                                                                ..####MM##\n" +
"      ::                                                              ::@@  MM@@######MM            ########                                                                                  ++####mm##\n" +
"      ::                                                            ##mm    ++########..          mm######--                                                                                  ########mm\n" +
"        --                                                        mm::++    MMmm####MM            MM######                                                                                    ######@@  \n" +
"        --                                                        ..        mm####@@@@            ######                                                                                    ####@@##@@  \n" +
"        --                                                      mm  ++    ++##MM####              @@##MM                                                                                  @@######@@    \n" +
"        ..                                                    ::          mm########            MM####                                                                                  ######MM@@      \n" +
"          ++                                                ..            ######@@##            @@####                                                                                ######@@@@        \n" +
"          --..                                                          mm@@######mm          --####                                                                    --      ..++##MM##@@..          \n" +
"            ::                                                    @@##@@########@@            @@####                                                                        @@MM@@MMmm@@                \n" +
"              ..                                                ..::##############            MM@@                                                                          --                          \n" +
"                                                              ..MM##############mm            ##                                                                                                        \n" +
"                                                            ##mmMM##############            MMMM                                                                                                        \n" +
"                                                            mmmm################            ##                                                                                                          \n" +
"                                                            MMMM@@##############          @@                                                                                                            \n" +
"                                                            ##@@################          ..                                                                                                            \n" +
"                                                              ################@@                                                                                                                        \n" +
"                                                              ##MM##############                                                                                                                        \n" +
"                                                              ##MM################..                                                                                                                    \n" +
"                                                              ##MM################  ..                                                                                                                  \n" +
"                                                              ##mm################mm                                                                                                                    \n" +
"                                                              ++@@##########@@++@@MM                                                                                                                    \n" +
"                                                              ::############--    MM                                                                                                                    \n" +
"                                                              ..############::                                                                                                                          \n" +
"                                                                ############--      mm                                                                                                                  \n" +
"                                                                ############MM                                                                                                                          \n" +
"                                                              ::##@@##########                                                                                                                          \n" +
"                                                              ++MM##########@@                                                                                                                          \n" +
"                                                              ::MMMMMM########@@::                                                                                                                      \n" +
"                                                              ++MMMMmm##############                                                                                                                    \n" +
"                                                        ..--::++MM##MMmmmm####@@####mmMMmm::..::::::----....                                                                                            \n" +
"                    ..--++++++++++++++::++++++++++MMmmMMmm++++::++++@@@@@@@@MMmmmmMMMMmm++mmMMmmMM@@@@MM++++::..                                                                                        \n" +
"                  --++++mmmmMMMMMMmmmmMMmm++++MMmm@@++::--::mmMM::@@++MMmm@@@@MM@@MM@@MMMMMMmmMMMM##@@MM@@MMMMMMMMMMMMMMMMmmmmmmmmmm++++::--..        \n " );
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println(d0010);
         // chamar função de combate
        }
        
        //Sistema de combate
//O jogador irá jogar um d10(dado de 10 lados) caso o valor for maior que 5 ele defende e contra-ataca
//Caso o valor for menor que 5 ele toma 5 de dano, 
//Ele tem que contra-atacar duas vezes, ou seja, tirar duas vezes no dado um número maior que 5
//Caso ele morra
//Você sofreu muito dano pelo fantasma, sem força você larga a espada no chão e cai sobre os pés do Jasquim, infelizmente esse é o seu infeliz fim. Fim de jogo.
//Caso ele contra-ataca 2 vezes segue a história.
//Finalmente o combate acaba, você corre em direção do corpo e o incinera 
        
        static void casa6(int walk) { 
         System.out.println("Finalmente o combate acaba, você corre em direção do corpo e o incinera \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("O ar fica mais leve e você sabe que finalmente aquele espírito irá descansar em pás \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Jasquim – Acabou -\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
       
         System.out.println( nomejogador + " – Sim.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Jasquim – Finalmente, agora meu negócio irá se tonar realidade, tenho que limpar esse lugar e tirar esse corpo da aqui, mas como será que ele morreu coitado.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
         

         System.out.println(" Você observa o lugar secreto, e vê que parece uma espécie de abrigo, aparentemente era confortável, porém ao tentar procurar algum motivo dele ter morrido ali \n "
         + "você se depara com a entrada e vê que do lado tem uma espécie de alavanca quebrada e entende que ele deve te ficado preso ali pois a alavanca que abre a porta secreta quebrou ele deve ter morrido aqui de fome ou cede. \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Você explica isso ao Jasquim \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Jasquim -  Coitado. Enfim, aqui poderia ser um bom armazém, irei adicionar isso em meu caderno. A falando nisso quer saber como eu conseguir essa casa- \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println( nomejogador + " – Não, me pague.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Jasquim – Certo, certo.  \n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Ele tira um saco cheio de pó (peças de ouro) e o entrega.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println(" Você nem se da o trabalho de contar as moedas, apenas pega o saco e deseja sair de lá o mais rápido possível   \n" );
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Jasquim -  Obrigado pelo sérvio, pode deixar que irei criar uma poção em sua homenagem, enfim agora pode ir, terei muito trabalho de agora em diante restaurando essa casa, principalmente no...\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

         System.out.println("Jasquim está falando sozinho, nesse momento você esta em caminho ao estabulo onde deixou de repouso a sua bela montaria, você guarda o saco de moedas, arruma a sela, e faz um carinho leve no cavalo, e parte em direção  a uma nova cidade para fazer mais trabalhos.\n");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}

     
         System.out.println("E assim termina essa aventura. Fim");
         System.out.println("Aperte enter para seguir\n"); 
         try{System.in.read();}
         catch(Exception e){}
        }
        
    
   public static void main(String[] args) {
    int opcaomenu = menu();  
    controle (opcaomenu, opcaomenu);
   }
  }


