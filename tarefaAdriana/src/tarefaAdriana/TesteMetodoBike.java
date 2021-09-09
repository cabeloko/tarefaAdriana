package tarefaAdriana;

public class TesteMetodoBike {

	public static void main(String[] args) {

		Corrida corrida = new Corrida();
		corrida.setCidade("São Paulo");
		corrida.setData("23 de Abril de 2021");
		corrida.setEdicao(6);

		Ciclista ciclista = new Ciclista();
		ciclista.setNome("Fernando");
		ciclista.setIdade(27);
		ciclista.setCol("Campeão");
		ciclista.setVitorias(5);

		Bicicleta bicicleta = new Bicicleta();
		bicicleta.setMarca("BMC");
		bicicleta.setModelo("Road Bike");
		bicicleta.setCor("Preta");
		bicicleta.setPeso(10);
		bicicleta.setMarcha(20);

		System.out.println("Esta é a bicicleta da marca " + bicicleta.marca + ", seu modelo é " + bicicleta.modelo + " sua cor é "
				+ bicicleta.cor + ", sua quantidade de marchas é " + bicicleta.marchas + " marchas " + "seu peso é de " + bicicleta.peso + "kg."
				+ " O ciclista que a pedala é o " + ciclista.nome + " de " + ciclista.idade + " anos" + " Campeão por "
				+ ciclista.vitorias + " vezes com " + ciclista.vitorias + " vitorias consecutivas, " + "competindo na " + corrida.edicao
				+ "º Corrida da cidade de " + corrida.cidade + " no dia " + corrida.data + ".");
	}

}
