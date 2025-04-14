import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Digite o primeiro parametro: ");
            int parametroUm = sc.nextInt();

            System.out.print("Digite o segundo parametro: ");
            int parametroDois = sc.nextInt();
        
            contar(parametroUm, parametroDois);
        }
        catch(ParametroInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }
        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException{
        if(parametroUm > parametroDois)
            throw new ParametroInvalidosException();
        
        int contagem = parametroDois - parametroUm;
        
        for(int i=parametroUm; i<=parametroDois; i++){
            System.out.println("Imprimindo o numero " + i);
        }
        System.out.println();
        System.out.println("A ocorrencia de " + parametroUm + " e " + parametroDois + " é de " + contagem);
    }
}

   