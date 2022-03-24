import java.util.Scanner;
class Tela {

void tela (){   
Calculo calculo = new Calculo();
Scanner teclado = new Scanner(System.in);
  
    float prova1,prova2,sub,media,exame; 
         
          System.out.print("prova 1...: ");
          prova1 = teclado.nextFloat();
        
          System.out.print("prova 2...: ");
          prova2 = teclado.nextFloat();

          media=calculo.mediaPrimaria(prova1,prova2);
  
          if (media >= 6){
          System.out.println("APROVADO");
          System.out.println("MÉDIA: " + media);
          }
          else{
            System.out.println("NAO APROVADO");
            System.out.print("substitutiva...: ");
            sub = teclado.nextFloat();
            media=calculo.mediaSub(prova1,prova2,sub,media);
            }
            System.out.println("MÉDIA: " + media);
                if (media>=6){
                    System.out.println("APROVADO");
                  
                }else {
                    System.out.println("NAO APROVADO");
                    System.out.print("exame...: ");
                    exame = teclado.nextFloat();
                  media = calculo.mediaExa(exame,media);
                  }
                    System.out.println("MÉDIA: " + media);
                    if (media >= 6){
                        System.out.println("APROVADO"); 
                    }
                    else{
                        System.out.println("NAO APROVADO");
                      
                    }
  
                }
  
           }
        