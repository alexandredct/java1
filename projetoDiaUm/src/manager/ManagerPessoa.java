package manager;

import java.util.ArrayList;

import entity.Pessoa;

public class ManagerPessoa {
	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	/* bloco anônimo estático */
	static {
		pessoas.add(new Pessoa("Pessoa 1", "pessoa1@gmail.com", 1));
		pessoas.add(new Pessoa("Pessoa 2", "pessoa2@gmail.com", 2));
		pessoas.add(new Pessoa("Pessoa 3", "pessoa3@gmail.com", 3));
	}
	
	public static void adicionarPessoa (Pessoa p) {
		pessoas.add(p);
	}
	
	public static void print() {
		pessoas.stream().forEach(System.out::println);
	}
	
	
	public static void print2() {
		pessoas.stream().forEach(
				x->System.out.println(x.getNome())
		);
	}
	
	public static void main(String[] args) {
		ManagerPessoa.adicionarPessoa(new Pessoa("Joana","teste@joana.com", 32));
		ManagerPessoa.adicionarPessoa(new Pessoa("Janaina","teste2@janaina.com", 32));
		ManagerPessoa.adicionarPessoa(new Pessoa("Joaquim","teste3@joaquim.com", 32));
		
		
		ManagerPessoa.print();
		System.out.println("=============================");
		ManagerPessoa.print2();
	}

}
