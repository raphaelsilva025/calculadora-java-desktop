package br.com.raphael.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado(String novoValor);

}
