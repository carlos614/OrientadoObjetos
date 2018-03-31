package com.yourcode.www;

public class Cliente {
	private int cpf;
    private final String nomeCompleto;
    private int idade;
    private float salario;
	private String nome;

    //construtor da classe
    public Cliente(int cpf,String nome,int idade,float salario){
    	
        this.cpf = cpf;
        this.nomeCompleto = nome;
        this.idade = idade;
        this.salario = salario;
    }
        public int getCPF() {
           	return cpf;
        }
        	public void setCPF(int id) {
        		this.cpf = id;
        	}
        
        
        public String getNome() {
        	return nomeCompleto;
        }
        public void setnome(String n) {
    		this.nome = n;
    	}
        
        public int getIdade()  {
        	return idade;
        	
        }
        public void setIdade(int i) {
    		this.idade = i;
    	}
        public float getSalario() {
        	return salario;
        }
        public void setSalario(int s) {
    		this.salario = s;
    	}
		public float getSalario1() {
			// TODO Auto-generated method stub
			return 0;
		}
       
        
   }


    
    
