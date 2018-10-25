package br.com.novaroma.utils;

import br.com.novaroma.entidades.Paciente;

public class ValidacoesAten {
	public static boolean validaCpfCliente(Paciente paciente) {
		return paciente.getCpf().length()-1 != 11;
	}
	
	
}
