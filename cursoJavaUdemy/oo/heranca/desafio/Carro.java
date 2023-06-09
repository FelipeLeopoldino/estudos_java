package oo.heranca.desafio;

public class Carro {

	protected final int VELOCIDADE_MAXIMA;
	protected double velocidadeAtual = 0;
	protected int delta = 5;

	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;

		} else {
			velocidadeAtual += delta;
		}
	}

	public void freiar() {
		if (velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		} else {
			velocidadeAtual = 0;
		}
	}

	@Override
	public String toString() {
		return "[velocidadeAtual=" + velocidadeAtual + "]";
	}

}
