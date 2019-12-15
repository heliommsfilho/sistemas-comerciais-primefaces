package com.github.heliommsfilho.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaClientesBean {

	private List<Cliente> clientesFiltrados = new ArrayList<>();
	
	public PesquisaClientesBean() {
		clientesFiltrados.add(new Cliente("Supermercado João", "Jurídica", "02.654.586/1000-45"));
		clientesFiltrados.add(new Cliente("Hélio Filho", "Física", "367.457.356-32"));
		clientesFiltrados.add(new Cliente("Farmácia José", "Jurídica", "10.456.333/0001-99"));
	}

	public List<Cliente> getClientesFiltrados() {
		return clientesFiltrados;
	}

	public class Cliente {
		
		private String nome;
		private String tipo;
		private String cpfOuCnpj;
		
		public Cliente(String nome, String tipo, String cpfOuCnpj) {
			super();
			this.nome = nome;
			this.tipo = tipo;
			this.cpfOuCnpj = cpfOuCnpj;
		}

		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getTipo() {
			return tipo;
		}
		
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		public String getCpfOuCnpj() {
			return cpfOuCnpj;
		}
		
		public void setCpfOuCnpj(String cpfOuCnpj) {
			this.cpfOuCnpj = cpfOuCnpj;
		}
	}
}
