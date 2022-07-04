package com.example.software.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

	private Integer codigo;

	private String descricao;

	public static Status toEnum(Integer cod) {
		if (cod != null) {
			for (Status x : Status.values()) {
				if (cod.equals(x.getCodigo())) {
					return x;
				}
			}
		}
		throw new IllegalArgumentException("Status Invalido!");
	}
}