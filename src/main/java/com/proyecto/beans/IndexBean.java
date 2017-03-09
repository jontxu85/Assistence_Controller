package com.proyecto.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelos.Empleado;
import service.EmpleadoService;

@ManagedBean
@RequestScoped
public class IndexBean implements Serializable {

	private static final long serialVersionUID = -4901741514584007341L;
	private EmpleadoService actorService = new EmpleadoService();
	private String username;
	private String password;
	
	

	@PostConstruct
	public void init() {
		username = "";
		password = "";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}