package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmn on 02-06-2015.
 */
public class Fibonacci {

    public static List<Integer> fibonacci(int N) {

	List<Integer> listaRetorno = new ArrayList<Integer>();
	int valor = 0;
	int anterior = 0;

	for (int i = 1; i <= N; i++) {

	    if (i == 1) {

		valor = 1;
		anterior = 0;

	    } else {

		valor = valor + anterior;
		anterior = valor - anterior;

	    }

	    listaRetorno.add(valor);
	}

	return listaRetorno;
    }

    public static List<Integer> fibonacciIterativo(int N) {

	if (N < 1) {
	    throw new IllegalArgumentException("O numero deve ser positivo");
	}

	ArrayList<Integer> retorno = new ArrayList<Integer>();
	retorno.add(1);
	retorno.add(1);

	if (N == 1) {
	    return retorno.subList(0, 1);
	}
	if (N == 2) {
	    return retorno;
	}

	int i = 1;

	while (i < N - 1) {
	    final int elem = retorno.get(i) + retorno.get(i - 1);
	    retorno.add(elem);
	    i++;
	}

	return retorno;
    }
}
