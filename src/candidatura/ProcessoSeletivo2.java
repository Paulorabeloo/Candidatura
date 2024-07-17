package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 
{
    public static void main(String[] args) 
    {
        selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados()
    {
        String [] candidatos = {"FELIPE","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i=0; i<candidatos.length; i++) // for para imprimir o indice do candidato, percorre todos elementos do array
        {
            System.out.println("O candidato de n° " + (i+1) + " é " + candidatos[i]);
        }

        System.out.println("Forma abreviada de interação com for each");

        for(String candidato: candidatos) //vai interagir sobre todos elementos do array de forma abreviada -> não vai mostrar o indice do candidato
        {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos()
    {
        //Array com lista de candidatos
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido)
            {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }


    static void analisarCandidato(double salarioPretendido)
    {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) 
        {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido) 
        {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else
        {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}