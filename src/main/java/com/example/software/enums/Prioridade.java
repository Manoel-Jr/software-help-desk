package com.example.software.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Prioridade {

	BAIXA(1, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

	private Integer codigo;

	private String descricao;

	public static Prioridade toEnum(Integer cod) {
		if (cod != null) {
			for (Prioridade x : Prioridade.values()) {
				if (cod.equals(x.getCodigo())) {
					return x;
				}
				return null;
			}
		}
		throw new IllegalArgumentException("Prioridade Invalido!");
	}
}
