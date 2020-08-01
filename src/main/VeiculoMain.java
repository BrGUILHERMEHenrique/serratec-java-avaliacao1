package main;

import br.com.avaliacaop2.Ipva;
import javax.swing.JOptionPane;

public class VeiculoMain {
    public static void main(String[] args) {
    Ipva sandero = new Ipva("Sandero", "lvc-5430", "gás", 55000, 125);
    Ipva fiesta = new Ipva("Fiesta", "Mvc-1212", "flex", 40000, 140);
    //fazendo os calculos
    sandero.calculaIpva();
    fiesta.calculaIpva();

    //imprimindo resultado
    System.out.println(sandero + " " + "O valor do IPVA: " + sandero.getValorIpva());
    System.out.println("---------------------------------------------------------");
    System.out.println(fiesta + " " + "O valor do IPVA: " + fiesta.getValorIpva());
    }
}

