package tarefaAdriana;

public class TesteMetodoBike {

	public static void main(String[] args) {

		Corrida corrida = new Corrida();
		corrida.setCidade("S�o Paulo");
		corrida.setData("23 de Abril de 2021");
		corrida.setEdicao(6);

		Ciclista ciclista = new Ciclista();
		ciclista.setNome("Fernando");
		ciclista.setIdade(27);
		ciclista.setCol("Campe�o");
		ciclista.setVitorias(5);

		Bicicleta bicicleta = new Bicicleta();
		bicicleta.setMarca("BMC");
		bicicleta.setModelo("Road Bike");
		bicicleta.setCor("Preta");
		bicicleta.setPeso(10);
		bicicleta.setMarcha(20);

		System.out.println("Esta � a bicicleta da marca " + bicicleta.marca + ", seu modelo � " + bicicleta.modelo + " sua cor � "
				+ bicicleta.cor + ", sua quantidade de marchas � " + bicicleta.marchas + " marchas " + "seu peso � de " + bicicleta.peso + "kg."
				+ " O ciclista que a pedala � o " + ciclista.nome + " de " + ciclista.idade + " anos" + " Campe�o por "
				+ ciclista.vitorias + " vezes com " + ciclista.vitorias + " vitorias consecutivas, " + "competindo na " + corrida.edicao
				+ "� Corrida da cidade de " + corrida.cidade + " no dia " + corrida.data + ".");
	}

}
