package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.CandleStickFactory;
import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactory {
	 public static void main(String[] args) {
	     Calendar hoje = Calendar.getInstance();
	 
	     Negociacao negocio1 = new Negociacao(40.5, 100, hoje);
	     Negociacao negocio2 = new Negociacao(45.0, 100, hoje);
	     Negociacao negocio3 = new Negociacao(39.8, 100, hoje);
	     Negociacao negocio4 = new Negociacao(42.3, 100, hoje);
	 
	     List<Negociacao> negocios = Arrays.asList(negocio1, negocio2,
	                negocio3, negocio4);
	 
	     CandleStickFactory fabrica = new CandleStickFactory();
	     Candlestick candle = fabrica.constroiCandlestickParaData(
	                         hoje, negocios);
	 
	     System.out.println(candle.getAbertura());
	     System.out.println(candle.getFechamento());
	     System.out.println(candle.getMinimo());
	     System.out.println(candle.getMaximo());
	     System.out.println(candle.getVolume());
	     System.out.println(candle.toString());
	   }
}
