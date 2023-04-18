import java.util.Scanner;

class Main {
  // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
  public static void main(String[] args) {

    // declaração das variáveis 
    Scanner input = new Scanner(System.in);
    double pi = 3.14; 
    

    // informe o raio de um circulo
    String textoUm = "Informe o valor do raio de um circulo (em cm)";
    System.out.print(textoUm);
    double raio = input.nextDouble();

    // fazer o calculo de conversao de raio para area
    double area = pi * (raio * raio); 

    // mostrar o resultado da convesao
    System.out.println("A Area do circulo e igual a (cm):" + area + ("cm"));

    input.close();
  }
}





