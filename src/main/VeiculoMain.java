package main;

import br.com.avaliacaop2.Ipva;


public class VeiculoMain {
    public static void main(String[] args) {
	//instanciando os novos veiculos
	//Por que usar o Ipva ao invés do Veiculo? 
	//Para instaciar um veiculo que contenha a taxa de licenciamento como estes utilizamos a classe filha Ipva para fazer o mesmo, já que a classe mãe Veiculo tem somente os atributos padrões para todos e sendo assim não contém o atributo de taxa de que precisamos, fazendo assim o uso da classe filha Ipva necessário, e outra seria, do que adianta a classe filha Ipva se nunca será usada?
    Ipva sandero = new Ipva("Sandero", "lvc-5430", "GNV", 55000, 125);
    Ipva fiesta = new Ipva("Fiesta", "Mvc-1212", "flex", 40000, 140);
    Ipva civic = new Ipva("Civic", "Lkj-4576", "gasolina", 70000, 300);
    Ipva parati = new Ipva("Parati", "Hty-3189", "gasolina", 20000, 200);
    //fazendo os calculos
    sandero.calculaIpva();
    fiesta.calculaIpva();
    civic.calculaIpva();
    parati.calculaIpva();

    //imprimindo resultado
    System.out.println(sandero + " " + "O valor do IPVA: " + sandero.getValorIpva());
    System.out.println("---------------------------------------------------------");
    System.out.println(fiesta + " " + "O valor do IPVA: " + fiesta.getValorIpva());
    }
}

