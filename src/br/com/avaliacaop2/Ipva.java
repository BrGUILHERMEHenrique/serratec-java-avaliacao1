package br.com.avaliacaop2;

import br.com.avaliacaop1.Veiculo;

public class Ipva extends Veiculo {
    private double valorIpva;
    private double taxaLicenciamento;

    public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
        super(modelo, placa, combustivel, valorVeiculo);
        this.taxaLicenciamento = taxaLicenciamento;
    }

    public double getValorIpva() {
        return valorIpva;
    }

    public void calculaIpva() {
        if (combustivel.equals("GNV")) {
            valorIpva = (valorVeiculo * 0.01) + taxaLicenciamento;
        } else if (combustivel.equals("flex")) {
            valorIpva = (valorVeiculo * 0.03) + taxaLicenciamento;
        } else{
            valorIpva = valorVeiculo * 0.04;
<<<<<<< HEAD
        }
=======
>>>>>>> dd0969ac8ea0a943ee61187af8b4922e0f63bc03
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +("\nTx. de Licenciamento: " + taxaLicenciamento);
	}





}
