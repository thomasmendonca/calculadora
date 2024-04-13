import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @ParameterizedTest
    @CsvSource({"2,3,5", "-2,3,1", "0,0,0", "-5,-5,-10"})
//  @CsvFileSource
    @DisplayName("Teste soma que dá certo")
    public void testeSomar(int a, int b, int resultadoEsperado){

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(a,b);

        assertEquals(resultadoEsperado,resultado);

    }
    @RepeatedTest(2)
    @DisplayName("Teste de Soma que dá errado")
    public void testeSomar2(){

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(2,2);

        assertEquals(4,resultado);

    }
    @ParameterizedTest
    @CsvSource({"2,3,5", "-2,3,1", "0,0,0", "-5,-5,-10"})
//  @CsvFileSource
    @DisplayName("Teste multiplicar")
    public void testeMulplicar(int a, int b, int resultadoEsperado){

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(a,b);

        assertEquals(resultadoEsperado,resultado);

    }
    @ParameterizedTest
    @CsvSource({"2.0,3.0,5.0", "-2.0,3.0,1.0", "0.0,0.0,0.0", "-5.0,-5.0,-10.0"})
//  @CsvFileSource
    @DisplayName("Teste dividir")
    public void testeDividir(int a, int b, int resultadoEsperado){

        Calculadora calculadora = new Calculadora();

        int resultado = (int) calculadora.dividir(a,b);

        assertEquals(resultadoEsperado,resultado);

    }
}
