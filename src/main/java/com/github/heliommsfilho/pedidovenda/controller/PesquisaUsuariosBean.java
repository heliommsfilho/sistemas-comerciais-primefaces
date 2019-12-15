package com.github.heliommsfilho.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaUsuariosBean {

	private List<Usuario> usuariosFiltrados = new ArrayList<>();
	
	public PesquisaUsuariosBean() {
		usuariosFiltrados.add(new Usuario("José Fernandes", "jose_fernandes@outlook.com"));
		usuariosFiltrados.add(new Usuario("Maria Santos", "maria.santos@gmail.com"));
		usuariosFiltrados.add(new Usuario("Oswaldo Montenegro", "oswaldo.montenegro@hotmail.com"));
	}

	public List<Usuario> getUsuariosFiltrados() {
		return usuariosFiltrados;
	}

	public class Usuario {
		
		private String nome;
		private String email;
		
		public Usuario(String nome, String email) {
			this.nome = nome;
			this.email = email;
		}

		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
	}
}
