package com.example.software.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum Perfil {

	ADMIN(1,"ADMIN"),
	CLIENTE(1,"CLIENTE"),
	TECNICO(2,"TECNICO");
	
	private Integer codigo;
	
	private String descricao;
	
	
	public static Perfil toEnum(Integer cod) {
		if(cod != null) {
			for(Perfil x : Perfil.values()) {
				if(cod.equals(x.getCodigo())) {
					return x;
				}
				return null;
			}
		}
		throw new IllegalArgumentException("Perfil Invalido!");
	}
}
