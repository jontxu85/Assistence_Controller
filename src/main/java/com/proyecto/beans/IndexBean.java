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
	private EmpleadoService es = new EmpleadoService();
	private String dni;
	private String password;
	
	

	@PostConstruct
	public void init() {
		dni = "";
		password = "";
	}
	
	public String login(){
		System.out.println("entra");
		String logueado=es.hacerLogin(dni, password);
		System.out.println("sale");
		return logueado;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String dni) {
		this.dni = dni;
	}
	
	public String getPassword() {
		return dni;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}