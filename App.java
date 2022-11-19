import java.util.Scanner;


public class App {












private static String nomejogador; // nao sei mas o nome nao está gravando



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
  System.out.println("Rascunho ");
  return opcaomenu;
}

public static int instrucoes (int opcaomenu) {
  System.out.println("Rascunhoinstru ");
  return opcaomenu;
}

public static void sair (int opcaomenu) {
  System.out.println("Saindo... ");
  System.exit(5);

}

public static int caminhos (int opcaomenu) {
  int walk;

  do{

  Scanner input = new Scanner(System.in);
  System.out.println("Escolha um caminhos");
  System.out.println("1 - Taberna");
  System.out.println("2 - Casa");

  walk = input.nextInt();

  } while (walk >= 3 || walk <= 0 ) ;
 
return walk;
  }
  
   


public static int validacoes (int walk,int opcaomenu, String nomejogador) {
  if (walk == 1) {
    taberna0(opcaomenu);
     taberna1(opcaomenu, nomejogador);
    // taberna2(opcaomenu, nomejogador );
    // taberna3(opcaomenu, nomejogador);
    // taberna4(opcaomenu, nomejogador);
    // taberna5(opcaomenu, nomejogador);

    return walk;
  }
  return opcaomenu;
}




     public static String pedirnome() {   


         System.out.println("Informe seu nome ");
         Scanner input = new Scanner (System.in);
        String nomejogador = input.next();
         return nomejogador;


     }

     
             
    static void controle (int opcaomenu, String nomejogador,int walk) { // função de controle q irá chama todas as coisas.
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


   static void taberna0(int opcaomenu) {
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
                  
                  System.out.println("Chimbinha – Olá em que posso ajudar? ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(" Desconhecido ¬– Me dê alguma coisa forte, hoje meu dia foi terrível.");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha – Vamos ver...");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("O balconista vira e procura algo entre vários tipos de bebidas");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha – Aqui está, um bom e velho Licor Luminoso, feito de diversas frutas, ervas e temperos. É tipo um licor comum com uma glândula luminosa de um Besouro de Fogo.");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Desconhecido – Se ela for tão boa que nem sua aparência");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(" O cliente vira a bebida em sua boca e em seguida pede outra e outra, porém continua sóbrio ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha – Me diga, qual é o seu nome? Nunca vi você por aqui e o que te deixa tão desconfortável ao ponto de se embriagar a essas horas ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
   } /// ok
   
   //fazer uma função que pergunta o nome do jogador 
   
      static void taberna1(int opcaomenu, String nomejogador) {
        System.out.println(nomejogador);

        System.out.println("Aperte enter para seguir"); 
        try{System.in.read();}
        catch(Exception e){}
                  System.out.println(" Desconhecido – Me chamo... ");
                   pedirnome();
                    //chamar nomejogador 
                  
                  System.out.println( "e o motivo que estou me entupindo de bebida e porque eu estou falido praticamente");   
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  System.out.println( "Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha – Como assim? ");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println(   "Estava juntando umas pratas para abrir um negócio, contratei uma equipe    de goblins operários e construir minha fábrica de armadura e estava tudo indo bem, tinha meus funcionários e eu seria o gerente e cuidaria das finanças, porém deu tudo errado");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println("Chimbinha - Estava seguindo alguma teoria de administração?");
                  System.out.println("Aperte enter para seguir"); 
                  try{System.in.read();}
                  catch(Exception e){}
                  
                  System.out.println( "– O que seria a teoria da administração");

                  System.out.println(nomejogador);


 }

            

    // (((por a quest perguntando oque é teoria da adm)))
   
      static void taberna2(int opcaomenu, String nomejogador){
        System.out.println(nomejogador);
        try{System.in.read();}
        catch(Exception e){}


        System.out.println(
                    nomejogador + " – Interessante, deveria te pesquisado mais sobre isso antes de ir falar com o agiota enfim, mas acho que esta tarde demais, não sei se isso vai me ajudar agora na minha situação.\n"
                    +"Chimbinha – Bom eu posso te ajudar, talvez você não saiba mais eu tenho várias tabernas, principalmente na capital, estou por aqui pois quero continuar trabalhando, porém gosto da calmaria que tem por aqui. Se quiser vir aqui de manhã podemos ver como reverter a sua situação \n" 
                    +"nomejogador – Certo, irei vir sim, pode deixar, mas antes me ver mais uma aí.\n" 
                    +"Chimbinha – Só mais uma, não quero perder um cliente por causa de um coma alcoólico.\n" 
                    +"A escuridão da noite fica cada vez mais forte, o som da porta se fechando dá início ao eterno silencio da madrugada, você chega em casa, tranca as portas e janelas e sobe em direção ao seu escritório, lá está cheio de livros e papelada dos gastos e dos últimos meses\n" 
                    +"Você se lembra que já passou por muitas dificuldades na vida e por isso deseja mudar e focar em aprender.\n" 
                    +"Umas horas passam. \n" +"O sol passa diante a janela e vai em direção aos seus olhos, você levante e se arruma para mais um dia, antes de sair de seu quarto você lembra Chimbinha disse que iria te ajudar.\n" 
                    +"Você lembra que ele disse algo sobre administração e deseja ir ver se você não tem algum livro disso em seu escritório \n" 
                    +"Você finalmente acha o que estava procurando, dois livros, um com o título, administração clássica e o outro com o nome de administração cientifica  ");
   }
    
    
    //((Perguntar ao jogador qual é o nome dos criadores da adm. clássica e científico))
    
        static void taberna3(int opcaomenu, String nomejogador){
            System.out.println(
                    " Após pegar os livros e ler um pouco você percebe que está quase na hora de ir ver Chimbinha e se arruma para ver seu amigo\n" 
                    +"É uma e vinte da tarde, o movimente esta como sempre esteve, alguns humanos conversando sobre as colheitas, um anão no fundo fumando e alguns orcs fazendo quebra de braça, tudo como sempre foi.\n"
                    +"Você entra pela porta \n"
                            
                    +"nomejogador – Saudação Chimbinha.\n"
                    +"Chimbinha – Até que enfim você veio, pensei que iria sumir de vez depois de tanto beber ontem.\n"
                    +"nomejogador – Estava resolvendo aqueles problemas, vendi alguns dos meus bens e conseguir pagar o que devia, porém terei que começar tudo de novo.\n"
                    +"Chimbinha – Bom, espero que agora siga os meus conselhos pois irei te ensinar como ter um negócio. Primeiro, o que pretender fazer\n"
                    +"nomejogador - quero abrir uma loja de armas, meu pai amava espadas e sempre falava que queria que eu virasse um cavaleiro real, bom, acho que dá para ver que não tenho nem força e estatura de um soldado, então decidir que irei fabricar espadas.\n"
                    +"(nomejogador tem 1,60 de altura)\n"
                    +"Chimbinha – Ter um foco já é um bom começo, fazer isso sozinho é complicado recomendo achar alguém para te ajudar, principalmente na fornalha, é bom ter alguém para trabalhar com você\n"
                    +"nomejogador – posso estar vendo isso.\n"
                    +"Chimbinha - ter um funcionário e capacitar ele treinando e ensinando os movimentos corretos pode aumentar tanto a produção como a qualidade do produto.\n"
                    +"Chimbinha – Eu vi isso nesse livro, (ele tira um livro de baixo da mesa, aparentemente ele tinha deixado ali para te mostrar futuramente).\n"
                    +"Você pega o que você e começa a ler, esse livro que fala sobre capacitação de um trabalhador se refere a qual teoria administrativa?");
        }

    //((Questão sobre capacitação de funcionário))
    
    static void taberna4(int opcaomenu, String nomejogador){
        System.out.println("Chimbinha – Entendeu? \n"
                    +"Antes de ao menos nomejogador pensar em responder você escuta uma confusão nos fundos, aparentemente tem dois homens discutindo, eles se levantam e começam a jogar as bebidas uns nos outros \n"
                +"Chimbinha – Ahh e por esses motivos que eu não me aposento, amo ouvir uma boa briga logo de banham hahaha! pois eles têm que pagar todo o conserto depois e sempre ganho uns moveis novos \n"
                +"Você se assusta, apensar de gostar de beber você não tem costume de frequentar tabernas grandes como essa.\n"
                +"Chimbinha – enfim, acho que já está bom de diversão, vai que eles não tenham dinheiro para pagar por mais estrago do já que fizeram\n"
                +"Você ver que ele sabe muito bem cuidar desses assuntos e enquanto o pal ta comendo lá, você continuar lendo e aprendendo com os livros de adm que você recebeu.\n"
                +"Chimbinha – Enfim e voltando ao assunto. \n"
                +"Chimbinha – Oie ta me ouvindo?\n"
                +"nomejogador – Ah sim, estava concentrado\n"
                +"Chimbinha – Que bom.\n"
                +"Chimbinha – Vamos fazer o seguinte, pegue estes livros e estude – os, quando voltar irei testar seus conhecimentos.\n"
                +"nomejogador – Certo, pode deixar.\n"
                +"passados alguns dias de estudo o você retorna a taberna superanimado e reencontra Chimbinha.\n"
                +"nomejogador – Eu estou pronto para abrir um novo negócio!\n"
                +"Chimbinha – Calma! Calma! meu rapaz, vamos ver o que aprendeu\n"
                +"nomejogador – Claro!\n"
                +"Chimbinha – Antes de mais nada me liste o que já possui para este novo negócio\n"
                +"nomejogador – Não entendi\n"
                +"Chimbinha – E ainda diz que está pronto para um novo negócio rsrssrs, quero que me diga se tem algum dinheiro ou local para abrir a sua forja\n"
                +"nomejogador – Tenho um galpão para a fábrica há uma longa distância da cidade, alguns maquinários e formas para os moldes das espadas, um pequeno cômodo para a loja ao centro do vilarejo."
                + "Chimbinha – Certo, então irei te fazer algumas perguntas de testes, onde as únicas condições é que para cada acerto você mantém todos os seus bens, contudo se errar perderá um por vez, mas terá a chance de recuperar tudo ou não na pergunta final, e aí você topa?\n"
                +"Chimibinha – Mas isso é hipoteticamente, não é?\n"
                +"Chimbinha – Mas é claro meu filho, a não ser que queira começar o negócio já falido!\n"
                +"nomejogador – Então eu aceito!\n"
                +"Chimbinha – Vamos começar!");
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
nomejogador – É parece que me equivoquei, mas vamos lá para a pergunta bônus
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
    
    
    static void taberna5(int opcaomenu, String nomejogador){
        System.out.println(""
                + "Chimbinha – Realmente, você demonstrou conhecimento, meus parabéns.\n"
                +"Chimbinha – Aqui, assine isso.\n"
                +"nomejogador- O que é isso?\n"
                +"Chimbinha – Partir de agora seremos sócios. Eu entro com o dinheiro e você irá administrar tudo, afinal você se demonstrou ser bem capaz. \n"
                +"..... acorde\n"
                +"Você acorda, está em uma cadeira bem confortável, você estava sonhando com lembranças do passado. \n"
                +"Ao se levantar você sai de um quarto que da direto a uma grande loja, a sua loja, e você lembra do seu antigo amigo que te ajudou e que agora não está mais entre as terras vividas, \n"
                +"Você se sente realizado pois conseguiu ter o seu sonho, \n"
                +"Você abre a porta e pouco tempo depois chega alguns clientes.\n"
                +"nomejogador – Bem vindo a forja Chimbinha"
                + " Fim de jogo");
    }

    
    
   public static void main(String[] args) {
    int opcaomenu = menu();  
    controle (opcaomenu, nomejogador, opcaomenu );
   }
  }

