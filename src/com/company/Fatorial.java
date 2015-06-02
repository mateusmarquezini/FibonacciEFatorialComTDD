package com.company;

public class Fatorial {

    /**
     * Fatorial iterando dentro de um FOR
     *
     * @param N
     * @return
     */

    public static long fatorial(long N) {

	long fatorial = 1;

	for (int i = 1; i <= N; i++) {

	    fatorial = fatorial * i;
	}

	return fatorial;

    }

    /**
     * Fatorial recursivo
     *
     * @param N
     * @return
     */

    public static long fatorialRecursivo(long N) {

	if (N == 0) {

	    return 1;

	} else {

	    return (N * (fatorialRecursivo(N - 1)));
	}
    }
}
