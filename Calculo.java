import java.util.Scanner;

class Calculo{

  float  mediaPrimaria(float prova1,float prova2){
  float media;
  media = (prova1 + prova2)/2;
  return media;
  }

  float mediaSub(float prova1,float prova2,float sub, float media){
    float maior;
    
     if (prova1 > prova2){
            maior = prova1;
              }
              else{
                maior = prova2;
                }
                media = (sub + maior)/2;
    
    return media;
  }
   float mediaExa(float exame,float media){
   media = (exame + media)/2;
   return media;
     
   }

}