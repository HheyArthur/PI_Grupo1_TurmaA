import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class App {




public static int contaberna;
public static String nomejogador;



public static int menu(){
        int opcaomenu;
        do{


            System.out.println("Título do jogo");
        Scanner input = new Scanner(System.in);
        System.out.println("\n  ==================================== ");
        System.out.println("");
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

public static int creditos (int opcaomenu) {
      System.out.println(" Teste ");
      menu(); // retorna pro menu 1x
      return opcaomenu;
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

public static int instrucoes (int opcaomenu) {
  System.out.println("I2nstruçoes:\n"
  + "Esse jogo é game -rpg com objetivo de abordar assunto de administração.\n"
  + "Durante a histora terá perguntas relacionada ao tema, o jogador, no caso você tem 3 chances de acertar elas. Bom jogo\n");
  return opcaomenu;
}

public static void sair (int opcaomenu) {
  System.out.println("Saindo... ");
  System.exit(0);

}

public static void caminhos (int opcaomenu) {
  int walk;

  do{

  Scanner input = new Scanner(System.in);
  System.out.println( "Duas historia com o mesmo objetivo, faça sua escolha e siga o seu caminho");
  System.out.println("Escolha uma opção para se aventurar: ");
  System.out.println("1 - Taberna");
  System.out.println("2 - Casa");

  walk = input.nextInt();

  } while (walk >= 3 || walk <= 0 ) ;
validacoes(walk); // fazer a pergunta com a mesma logica
}
  
private static int questaoQuatro(int walk) {
   Scanner entrada = new Scanner(System.in);
     String pergunta04tb;
     int resp04tb;
     boolean acertou04 = false;
     ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
     alternativa.add("Administração Científica"); // *resposta correta */
     alternativa.add("Administração Clássica");

      //do {

        Collections.shuffle(alternativa);// **embaralha as alternativas**//

        pergunta04tb = "\nQual teoria se concentrou em melhorar a eficiência de cada indivíduo dentro da organização?\n"
              + "\n1) " + alternativa.get(0) + "\n" + "2) " + alternativa.get(1);
        System.out.println(pergunta04tb);
        resp04tb = entrada.nextInt();
        switch (resp04tb) {
          //  case "a":
          //  case "A":
          case 1:
              if (alternativa.get(0).equals("Administração Científica")) {
                 System.out.println("Parabéns! começou bem os negócios.");
                 acertou04 = true;
                 
  contaberna++;
              } else {
                  System.out.println("Que pena você errou! Acabou de perder as formas de molde de espadas");
              }
              break;
          //  case "b":
          //  case "B":
          case 2:
              if (alternativa.get(1).equals("Administração Científica")) {
                 System.out.println("Parabéns! começou bem os negócios.");
                 acertou04 = true;

              } else {
                 System.out.println("Que pena você errou! Acabou de perder as formas de molde de espadas");
              }
              break;
           default:
              System.out.println("\n Opção inválida digite uma pção valida para soma acertos");
            }      return resp04tb;
         }

    //}   //tem que achar um jeito de conta com o while        } while (resp04tb <= 0 && resp04tb >= 3 );
 
public static String questaoCinco(int walk) {
   Scanner entrada = new Scanner(System.in);
     String pergunta05, resp05tb;
     boolean acertou05 = false;
     ArrayList<String> alternativa = new ArrayList<String>();/* criação da lista */
     alternativa.add("O líder deve ser arbitrário em suas decisões.");
     alternativa.add("As críticas devem ser evitadas.");
     alternativa.add("A equipe deve respeitar as divergências e diversidades.");// *resposta corrreta */
     alternativa.add("As opiniões deverão ser ignoradas");
     alternativa.add("As responsabilidades devem ser delegadas.");

     do {

        Collections.shuffle(alternativa);// **embaralha as alternativas**//

        pergunta05 = "\nUma equipe alinhada e bem relacionada trará um ambiente de trabalho agradável e mais produtivo,"
              + " pensando nisso é correto afirmar que em relação ao bom desenvolvimento de toda a equipe:\n"
              + "\na) " + alternativa.get(0) + "\n" + "b) " + alternativa.get(1) + "\n" + "c) " + alternativa.get(2)
              + "\n" + "d) " + alternativa.get(3)
              + "\n" + "e) " + alternativa.get(4);
        System.out.println(pergunta05);
        resp05tb = entrada.next();
        switch (resp05tb) {
           case "a":
           case "A":
              if (alternativa.get(0).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;
                 contaberna++;

              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case "b":
           case "B":
              if (alternativa.get(1).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;

              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case "c":
           case "C":
              if (alternativa.get(2).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;

              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case "d":
           case "D":
              if (alternativa.get(3).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;

              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           case "e":
           case "E":
              if (alternativa.get(4).equals("A equipe deve respeitar as divergências e diversidades.")) {
                 System.out.println("Parabéns! Parece que você está indo bem nos negócios");
                 acertou05 = true;

              } else {
                 System.out.println(
                       "Que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!");
              }
              break;
           default:
              System.out.println("Opção Inválida");
        }

     } while (!acertou05);
   return resp05tb;
    }





 // public static void validperguntas

 public static void validacoes (int walk) {
   if (walk == 1){
    taberna0(walk);
    taberna1(walk, nomejogador);
    taberna2(walk, nomejogador);
    taberna3(walk);
    taberna4(walk);
    taberna5(walk);
   }
   if (walk == 2) {
    System.out.println("x");
    casa0(walk);
    // casa1(walk);
    // casa2(walk);
    // casa3(walk);
    // casa4(walk);
    // casa5(walk);


   } 
  //  else{ 
  //   System.out.println("Opção invalida tente novamente ");
  //  }
}

// Meio um teste para saber oomo usar array

/* public static String perguntas () {
  String  alternativas = [{1:""},{B:""}] 
  alternativas [0]
} */


     public static void pedirnome() {   


         System.out.println("Informe seu nome ");
         Scanner input = new Scanner (System.in);
       nomejogador = input.next();
         


     }

     
             
    static void controle (int opcaomenu ,int walk) { // função de controle q irá chama todas as coisas.
      switch (opcaomenu) {
        case 1:
        caminhos(walk);
        // validacoes(walk);


       
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
      
                   System.out.println("Aperte enter para seguir"); // codigo usado para pular linha 
                   try{System.in.read();}
                   catch(Exception e){}
            
              
                  System.out.println(" A história começa em uma noite calma e chuvosa, o som de uma porta abrindo se propaga no ar e com esse som que começa a nossa aventura.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                  System.out.println("Era em torno das 10 horas da noite, e um homem entra em uma taberna que está bem afastada da cidade dos ventos, ele vai ao balcão, porém não vê ninguém, bate na mesa e escuta no fundo.");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("- Já vai!");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("No fundo da estalagem vem um homem, bem-vestido e aparentemente de bem com a vida e ele se aproxima do novo cliente.");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Olá em que posso ajudar? ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(" Desconhecido ¬... Me dê alguma coisa forte, hoje meu dia foi terrível.");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Vamos ver...");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("O balconista vira e procura algo entre vários tipos de bebidas");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Aqui está, um bom e velho Licor Luminoso, feito de diversas frutas, ervas e temperos. É tipo um licor comum com uma glândula luminosa de um Besouro de Fogo.");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Desconhecido ... Se ela for tão boa que nem sua aparência");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(" O cliente vira a bebida em sua boca e em seguida pede outra e outra, porém continua sóbrio ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Me diga, qual é o seu nome? Nunca vi você por aqui e o que te deixa tão desconfortável ao ponto de se embriagar a essas horas ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
   } /// ok
   
   //fazer uma função que pergunta o nome do jogador 
   
      static void taberna1(int walk, String resp04tb) {

                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  System.out.println(" Desconhecido ... Me chamo... ");
                  pedirnome();
                    //chamar nomejogador 
                  
                  System.out.println( "e o motivo que estou me entupindo de bebida e porque eu estou falido praticamente");   
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}

                  System.out.println( "Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha ... Como assim? ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(  "Estava juntando umas pratas para abrir um negócio, contratei uma equipe    de goblins operários e construir minha fábrica de armadura e estava tudo indo bem, tinha meus funcionários e eu seria o gerente e cuidaria das finanças, porém deu tudo errado");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha - Estava seguindo alguma teoria de administração?");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  questaoQuatro(walk);

                 // System.out.println( "... O que seria a teoria da administração");

                 System.out.println("Teste " + contaberna);
              
              // (((por a quest perguntando oque é teoria da adm)))
   




 }

            

    
      static void taberna2(int walk, String resp04tb){

                  System.out.println( nomejogador + " ... Interessante, deveria te pesquisado mais sobre isso antes de ir falar com o agiota enfim, mas acho que esta tarde demais, não sei se isso vai me ajudar agora na minha situação.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                
                  System.out.println("Chimbinha ... Bom eu posso te ajudar, talvez você não saiba mais eu tenho várias tabernas, principalmente na capital, estou por aqui pois quero continuar trabalhando, porém gosto da calmaria que tem por aqui. Se quiser vir aqui de manhã podemos ver como reverter a sua situação \n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  

                  System.out.println( nomejogador +" ... Certo, irei vir sim, pode deixar, mas antes me ver mais uma aí.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){} 
                
                  System.out.println("Chimbinha ... Só mais uma, não quero perder um cliente por causa de um coma alcoólico.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                
                  System.out.println("A escuridão da noite fica cada vez mais forte, o som da porta se fechando dá início ao eterno silencio da madrugada, você chega em casa, tranca as portas e janelas e sobe em direção ao seu escritório, lá está cheio de livros e papelada dos gastos e dos últimos meses\n" 
                 +"Você se lembra que já passou por muitas dificuldades na vida e por isso deseja mudar e focar em aprender.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){} 
                
                 System.out.println("Umas horas passam. \n" 
                 +"O sol passa diante a janela e vai em direção aos seus olhos, você levante e se arruma para mais um dia, antes de sair de seu quarto você lembra Chimbinha disse que iria te ajudar.\n" 
                 +"Você lembra que ele disse algo sobre administração e deseja ir ver se você não tem algum livro disso em seu escritório \n" 
                 +"Você finalmente acha o que estava procurando. dois livros, um com o título, administração clássica e o outro com o nome de administração cientifica ");
                    questaoCinco(walk);
   }
    
    
    
    
        static void taberna3(int walk){

          System.out.println("Teste " + contaberna);

                
                  System.out.println("Após pegar os livros e ler um pouco você percebe que está quase na hora de ir ver Chimbinha, você se arruma para ver seu amigo\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                    
                  System.out.println("É uma e vinte da tarde, o movimente esta como sempre esteve, alguns humanos conversando sobre as colheitas, um anão no fundo fumando e alguns orcs fazendo quebra de braça, tudo como sempre foi.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}                     
                    
                  System.out.println("Você entra pela porta \n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                            
                  System.out.println(nomejogador +" ... Saudação Chimbinha.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Até que enfim você veio, pensei que iria sumir de vez depois de tanto beber ontem.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println(nomejogador +" - Estava resolvendo aqueles problemas, vendi alguns dos meus bens e conseguir pagar o que devia, porém terei que começar tudo de novo.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Bom, espero que agora siga os meus conselhos pois irei te ensinar como ter um negócio. Primeiro, o que pretender fazer\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println(nomejogador + " - quero abrir uma loja de armas, meu pai amava espadas e sempre falava que queria que eu virasse um cavaleiro real, bom, acho que dá para ver que não tenho nem força e estatura de um soldado, então decidir que irei fabricar espadas.\n");
                  System.out.println(" você tem 1,60 de altura ..\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Ter um foco já é um bom começo, fazer isso sozinho é complicado recomendo achar alguém para te ajudar, principalmente na fornalha, é bom ter alguém para trabalhar com você\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println(nomejogador + " ... posso estar vendo isso.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}       
                         
                  System.out.println("Chimbinha - ter um funcionário e capacitar ele treinando e ensinando os movimentos corretos pode aumentar tanto a produção como a qualidade do produto.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Chimbinha ... Eu vi isso nesse livro, (ele tira um livro de baixo da mesa, aparentemente ele tinha deixado ali para te mostrar futuramente).\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                  System.out.println("Você pega o que você e começa a ler, esse livro que fala sobre capacitação de um trabalhador se refere a qual teoria administrativa?");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                
                
        }

    //((Questão sobre capacitação de funcionário))
    
    static void taberna4(int walk) {
            
            
                 System.out.println("Chimbinha ... Entendeu? \n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                 System.out.println("Antes de ao menos nomejogador pensar em responder você escuta uma confusão nos fundos, aparentemente tem dois homens discutindo, eles se levantam e começam a jogar as bebidas uns nos outros \n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                 System.out.println("Chimbinha ... Ahh e por esses motivos que eu não me aposento, amo ouvir uma boa briga logo de banham hahaha! pois eles têm que pagar todo o conserto depois e sempre ganho uns moveis novos \n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
            
                 System.out.println("Você se assusta,  apensar de gostar de beber você não tem costume de frequentar tabernas grandes como essa.\n");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                         
                System.out.println("Chimbinha ... enfim, acho que já está bom de diversão, vai que eles não tenham dinheiro para pagar por mais estrago do já que fizeram\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println(" Você ver que ele sabe muito bem cuidar desses assuntos e enquanto o pal ta comendo lá, você continuar lendo e aprendendo com os livros de adm que você recebeu.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Enfim e voltando ao assunto. \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Oie ta me ouvindo?\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println(nomejogador + " ... Ah sim, estava concentrado\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Que bom.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                          
                System.out.println("Chimbinha ... Vamos fazer o seguinte, pegue estes livros e estude ... os, quando voltar irei testar seus conhecimentos.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}   
                         
                System.out.println(nomejogador + " - Certo, pode deixar.\n");System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("passados alguns dias de estudo o você retorna a taberna superanimado e reencontra Chimbinha.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println(nomejogador + "... Eu estou pronto para abrir um novo negócio!\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Calma! Calma! meu rapaz, vamos ver o que aprendeu\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println(nomejogador + "... Claro!\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Antes de mais nada me liste o que já possui para este novo negócio\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
               System.out.println(nomejogador +" ... Não entendi\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
               System.out.println("Chimbinha ... E ainda diz que está pronto para um novo negócio rsrssrs, quero que me diga se tem algum dinheiro ou local para abrir a sua forja\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}     
                         
                         
                System.out.println(nomejogador + " ... Tenho um galpão para a fábrica há uma longa distância da cidade, alguns maquinários e formas para os moldes das espadas, um pequeno cômodo para a loja ao centro do vilarejo.");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Certo, então irei te fazer algumas perguntas de testes, onde as únicas condições é que para cada acerto você mantém todos os seus bens, contudo se errar perderá um por vez, mas terá a chance de recuperar tudo ou não na pergunta final, e aí você topa?\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println( nomejogador + " ... Mas isso é hipoteticamente, não é?\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Mas é claro meu filho, a não ser que queira começar o negócio já falido!\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println( nomejogador + " - Então eu aceito!\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println("Chimbinha ... Vamos começar!");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
         }
         
    
    // criar uma função de bens materiais//
    //a ideia é que ele não tenha chances de voltar para acertar nas primeiras questões então errou perdeu algo
    
    
    /*Chimbinha - Qual teoria se concentrou em melhorar a eficiência de cada indivíduo dentro da organização?

a)	Administração Científica
b)	Administração Clássica


nomejogador errar
(aparecer a msg que pena você errou! Você acabou de perder as formas de molde de espada) 
nomejogador acertou
(aparecer a msg Parabéns! Começou bem os negócios)
 acredito que dá para seguir com as perguntas e elaborar um pequeno diálogo somente antes da última pergunta//**
Então continua as perguntas...
Chimbinha - Uma equipe alinhada e bem relacionada trará um ambiente de trabalho agradável e mais produtivo, pensando nisso é correto afirmar que em relação ao bom desenvolvimento de toda a equipe:
a)	O líder deve ser arbitrário em suas decisões.
b)	As críticas devem ser evitadas.
c)	A equipe deve respeitar as divergências e diversidades.
d)	As opiniões deverão ser ignoradas
e)	As responsabilidades devem ser delegadas.

nomejogador errar
(aparecer a msg que pena você errou! Você acabou de perder o galpão, desse jeito vai se dá mal hein!) 
nomejogador acertou
(aparecer a msg Parabéns! Parece que você está indo bem nos negócios)

Chimbinha - Ao buscar aumentar sempre a produtividade, a Administração científica voltou-se para a tecnologia de:
a)	não padronização
b)	customização da produção
c)	produção em massa
d)	liberdade de formas de trabalho

nomejogador errar
(aparecer a msg que pena você errou! Você acabou de perder o cômodo para a loja, bom parece que você perdeu tudo!!) 
Diálogo
Chimbinha - Meu caro parece que os conceitos não ficaram muito claros para você, te farei uma pergunta bônus para tentarmos recuperar tudo, se errar precisará revisar os seus estudos e retornaremos ao questionário o que acha?
nomejogador ... É parece que me equivoquei, mas vamos lá para a pergunta bônus
 a pergunta abaixo só aparecerá se ele errar todas as 3 questões anteriores//**
Chimbinha - As origens da Abordagem Clássica da Administração remontam às consequências geradas pela Revolução Industrial e podem ser resumidas em dois fatos genéricos: o crescimento acelerado e desorganizado das empresas e a necessidade de aumentar a eficiência e a competência das organizações. A Abordagem Clássica da Administração foi desdobrada em Administração Científica (Taylor) e Teoria Clássica (Fayol). Aponte a alternativa que indica a ênfase da Teoria Clássica.
a)	Ênfase na estrutura.
b)	Ênfase nas tarefas.
c)	Ênfase no mercado.
d)	Ênfase na indústria.

nomejogador errar
(aparecer msg que pena! Você perdeu tudo! Que tal revisarmos o conteúdo) 

nomejogador acertou
(aparecer a msg Parabéns! Você será um sucesso como empreendedor)
 bom a ideia é basicamente responder 3 questões corretas finaliza o jogo, caso contrário retorna o jogo*/
    
    
    static void taberna5(int walk){
            
                System.out.println("Chimbinha ... Realmente, você demonstrou conhecimento, meus parabéns.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}   
            
                System.out.println(" Chimbinha ... Aqui, assine isso.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(nomejogador + "- O que é isso?\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(" Chimbinha ... Partir de agora seremos sócios. Eu entro com o dinheiro e você irá administrar tudo, afinal você se demonstrou ser bem capaz. \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println("Uma escurudão toma conta de tudo e sua mente começa a da uma bagunçada");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println("..... acorde\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(" Você acorda, está em uma cadeira bem confortável, você estava sonhando com lembranças do passado. \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
            
                System.out.println(" Ao se levantar você sai de um quarto que da direto a uma grande loja, a sua loja, e você lembra do seu antigo amigo que te ajudou e que agora não está mais entre as terras vividas, \n"
                 +"Você se sente realizado pois conseguiu ter o seu sonho, \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
             
                System.out.println("Você abre a porta e pouco tempo depois chega alguns clientes.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println(nomejogador  + " - Bem vindo a forja Chimbinha");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                         
                System.out.println( "Fim de jogo");
          
                         
             
    }

            static void casa0 (int walk){
        
                 System.out.println("Era de noite, um homem montado a cavalo passava pela uma estrada cheia de nevoas, indo em direção a uma grande vila chamada Vila do Corvo\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("O homem passa pela entrada da vila e vai em direção a um estabulo, lá ele deixa seu cavalo e parte em direção a uma estalagem\n" +
                 "La dentro está cheio de pessoas, conversando, bebendo e até jogando uns jogos de carta.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}    
                 
                 System.out.println("ELe vai até um mural onde são colocados contratos, algo como contrato de segurança, caçador de monstros ou de pessoas em alguns casos.\n" +
                 "Ele olha e pega um e começa ler;\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Contrate-se caçador de monstros para livra uma casa de fantasma e outros seres do tipo, recompensa 6000 po (peça de outro), caso alguém se interessar ir falar com Jasquim no cruzamento da feira dos altares, número 0.\n"); 
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Após pegar a folha o homem vai em direção ao balcão e pergunta ao taberneiro se ele o poderia informar onde encontrar o local do contrato\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro ... Olha só, faz tempo que não vejo um caçador de monstro por aqui, você esta todo bem equipado com essas poções e tem uma bela espada em suas consta, como se chama?\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Sim, esse é você, um caçador de monstro que está indo em direção a mais um contrato, agora diga o seu nome \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 
                 System.out.println(nomejogador + " ... Me chamo " + nomejogador + " e sim, hoje em dia os números de caçadores estão cada vez menor, é uma profissão difícil.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println(nomejogador + " - Agora pode me informar onde fica esse local ou nao ?");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Você entrega o papel ao Taberneiro e ele começa a ler.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro ...   A sim, conheço o lugar e conheço o Jasquim hahaha.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println(" Você percebe que ele rir, porém não entende o motivo\n" );
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro ... Espero que esteja preparado para esse contrato jogador, pois Jasquim e pior que qualquer monstro que você já enfrentou, eu aposto haha.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println(nomejogador + " ... por quê? \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Taberneiro ... Digamos que ele e o tipo de pessoa que você não gostaria de começar a conversar, enfim tenho clientes para cuidar, se quiser ir para lá e só seguir esse caminho.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("O taberneiro fala o local e você parte em direção.\n" );
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Passa alguns minutos e você está lá, bem em frente o endereço indicado no contrato, você bate na porta e escuda alguém vindo abri-la.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
         
                 System.out.println(nomejogador + " ... Olá eu vi o ...\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Sem ao menos terminar de falar Jasquim o interrompe \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jasquim - AA então finalmente alguém aceito o contrato, olá eu sou Jasquim seja bem-vindo entre entre.\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Você entra.\n");
                  System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jasquim ... É tão bom ver um caçador por aqui, estou precisando muito me livrar das quelas aberrações, quando mais rápido for mais rápido irei ter meu negócio e serei rico hahaha!\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jogador - Seria aqui a casa onde estão as assombrações?\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 

                 System.out.println("Jasquim ... Não não, a casa fica mais no centro, é uma casa simples irei te levar lá\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Vocês saem e vão em direção ao local onde está amaldiçoado,\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Ao chegar você se depara com uma casa toda velha e aparentemente esta abandonada a alguns bons anos  \n" );
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println(" Jasquim ... Aqui estamos, bonita não? Essa vai ser a mais famosa loja de poções dessa vila, pode apostar. É claro, se você conseguir eliminar esses seres que vivem assombrando o local \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Jogador certo, irei entrar\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Você entra, mas logo atras está o Jasquim\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jasquim ... Eu e meus irmãos queremos abrir uma loja de poção aqui, estudamos muito para isso sabe, até vimos meios de administrar \n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}

                 System.out.println("Jogador- legal, mas pode ser perigoso aqui, e melhor você ficar lá fora\n");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                 
                 System.out.println("Jacks o do meio, falou sobre algumas teorias de administração, sabe o que é?");
                 System.out.println("Aperte enter para seguir"); 
                 try{System.in.read();}
                 catch(Exception e){}
                    
                    
        /*  ((pergunta sobre oque e a teoria de adm.))
                 
       Caso errar 
     (aparecer uma mensagem falando que está errada e dá uma dica)
                 
     Caso errar 3 vezes 
     (aparecer isso; você não soube responder, fico de saco cheio de ouvir sobre isso e decide ir embora, fim de jogo, voltar ao menu)
                 
     Caso acertar
     Continua a historia*/
                    
            }
    
   public static void main(String[] args) {
    int opcaomenu = menu();  
    controle (opcaomenu, opcaomenu);
   }
  }


