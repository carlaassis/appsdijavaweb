package br.edu.infnet.appsdim.aula01;

public class ExemploTeste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setId(1);
		aluno.setNome("Carla");
		aluno.setEmail("carla.chagas@al.infnet.edu.br");
		System.out.println(aluno);
	}
}
