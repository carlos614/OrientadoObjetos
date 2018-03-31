package com.unicesumar.exercicios1;

import java.util.ArrayList;

public class ControlarAlunos {
	
	public static void main(String[] args) {
		
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		
		//Listar Alunos
		Aluno aluno = new  Aluno(132212212, "Carlos", "1232", "aaa@email.com", "88888", "ativo", "11/11/2011");
		
		Aluno aluno1 = new  Aluno(123456789, "Bernadete", "1237", "bebe@email.com", "88888", "desativado", "11/11/2013");
		
		Aluno aluno2 = new  Aluno(443256780, "Dona fina", "12362", "ddd@email.com", "88888", "ativo", "11/11/2017");
		
		Aluno aluno3 = new  Aluno(297859349, "Bernado", "1235", "bbb@email.com", "88888", "desativado", "11/11/2012");
		
		
		
	
		alunos.add(aluno);
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		
		for(Aluno a : alunos) {
			
		System.out.println(a.toString());
			
		
		
		}
		
		//void remover um objeto da lista......
		
		alunos.remove(aluno3);
		
		
		
		//void pesquisar alunos atraves do cpf....."posições"..
		
		System.out.println(alunos.get(2));
	}
	
	
	
	
	

}
