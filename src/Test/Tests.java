package Test;

import com.company.Fatorial;
import com.company.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Mateus on 02-06-2015.
 */
public class Tests {

    /**
     * Testes com Fatorial:
     *
     * @throws InterruptedException
     */

    /*-------------------------------------------------------------------------------------------*/

    /**
     * Teste com tempo de inicio e fim para comparação de tempo entre uma iteração recursiva e de forma comum iterando dentro de um FOR
     *
     * @throws InterruptedException
     */

    @Test
    public void testaComValorCinco() throws InterruptedException {

	final long inicio = new Date().getTime();

	Assert.assertEquals(2432902008176640000L, Fatorial.fatorial(20));

	final long fim = new Date().getTime();

	final String tempoExecucao = String.valueOf(fim - inicio);
	System.out.println("Tempo de execucao (ms): " + tempoExecucao);
    }

    /**
     * Teste com tempo de inicio e fim para comparação de tempo entre uma iteração recursiva e de forma comum iterando dentro de um FOR
     *
     * @throws InterruptedException
     */
    @Test
    public void testaComValorCincoRecursivo() throws InterruptedException {

	final long inicio = new Date().getTime();

	Assert.assertEquals(2432902008176640000L, Fatorial.fatorialRecursivo(20));

	final long fim = new Date().getTime();
	final Long tempoExecucao = Long.valueOf(fim - inicio);
	System.out.println("Tempo de execucao: " + tempoExecucao);
    }

    @Test
    public void testaComValorDois() {

	Assert.assertEquals(2, Fatorial.fatorial(2));
    }

    @Test
    public void testaComValorTres() {
	Assert.assertEquals(6, Fatorial.fatorial(3));
    }

    @Test
    public void testaComValorTresRecursivo() {
	Assert.assertEquals(6, Fatorial.fatorialRecursivo(3));

    }

    @Test
    public void testaComValorUm() {

	Assert.assertEquals(1, Fatorial.fatorial(1));
    }

    @Test
    public void testaComValorUmRecursivo() {
	Assert.assertEquals(1, Fatorial.fatorialRecursivo(1));
    }

    @Test
    public void testaComValorZero() {

	Assert.assertEquals(1, Fatorial.fatorial(0));
    }

    @Test
    public void testaComValorZeroRecursivo() {
	Assert.assertEquals(1, Fatorial.fatorialRecursivo(0));

    }
    /*-------------------------------------------------------------------------------------------*/

    /**
     * Fibonacci
     */

    @Test
    public void testaFibonacciComCemMil() {

	final List<Integer> retorno = Fibonacci.fibonacci(100000);
	Assert.assertEquals(100000, retorno.size());

	List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5);
	Assert.assertEquals(expected, retorno.subList(0, 5));
    }

    @Test
    public void testaFibonacciComCinco() {

	List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5);
	Assert.assertEquals(expected, Fibonacci.fibonacci(5));

    }

    @Test
    public void testaFibonacciComDois() {

	List<Integer> expected = Arrays.asList(1, 1);
	Assert.assertEquals(expected, Fibonacci.fibonacci(2));

    }

    @Test
    public void testaFibonacciComNove() {
	List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34);
	Assert.assertEquals(expected, Fibonacci.fibonacci(9));
    }

    @Test
    public void testaFibonacciComUm() {

	List<Integer> expected = Arrays.asList(1);
	Assert.assertEquals(expected, Fibonacci.fibonacci(1));

    }

    @Test
    public void testaFibonacciIterativoComCemMil() {

	final List<Integer> retorno = Fibonacci.fibonacciIterativo(100000);
	Assert.assertEquals(100000, retorno.size());

	List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5);
	Assert.assertEquals(expected, retorno.subList(0, 5));
    }

    @Test
    public void testaFibonacciIterativoComCinco() {

	List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5);
	Assert.assertEquals(expected, Fibonacci.fibonacciIterativo(5));

    }

    @Test
    public void testaFibonacciIterativoComDois() {

	List<Integer> expected = Arrays.asList(1, 1);
	Assert.assertEquals(expected, Fibonacci.fibonacciIterativo(2));

    }

    @Test
    public void testaFibonacciIterativoComNove() {
	List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34);
	Assert.assertEquals(expected, Fibonacci.fibonacciIterativo(9));
    }

    @Test
    public void testaFibonacciIterativoComUm() {

	List<Integer> expected = Arrays.asList(1);
	Assert.assertEquals(expected, Fibonacci.fibonacciIterativo(1));

    }

}
