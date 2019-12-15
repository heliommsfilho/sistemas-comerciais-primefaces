package com.github.heliommsfilho.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroClientesBean {

	private List<Endereco> listaEnderecos = new ArrayList<>();
	
	public CadastroClientesBean() {
		this.listaEnderecos.add(new Endereco("Rua do Bairro Novo", "635", "Anexo A", "2785-579", "Cascais"));
		this.listaEnderecos.add(new Endereco("Rua Fausto Cardoso", "136", "Casa", "48950-000", "Uauá"));
	}

	public List<Endereco> getListaEnderecos() {
		return listaEnderecos;
	}

	public class Endereco {
		
		private String rua;
		private String numero;
		private String complemento;
		private String cep;
		private String cidade;
		
		public Endereco(String rua, String numero, String complemento, String cep, String cidade) {
			this.rua = rua;
			this.numero = numero;
			this.complemento = complemento;
			this.cep = cep;
			this.cidade = cidade;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
	}
}
