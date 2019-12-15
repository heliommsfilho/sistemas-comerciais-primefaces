package com.github.heliommsfilho.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroUsuarios {

	private List<String> listaGrupos = new ArrayList<>();

	public CadastroUsuarios() {
		this.listaGrupos.add("Auxiliares");
		this.listaGrupos.add("Vendedores");
	}

	public List<String> getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(List<String> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}
}
