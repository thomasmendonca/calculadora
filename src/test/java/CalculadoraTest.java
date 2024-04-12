import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculadoraTest {
    private Calculadora calc;
    @BeforeEach
    public void inicializar(){
        this.calc = new Calculadora();
    }

    @ParameterizedTest
    @CsvSource({"1,1,2", "2,2,4", "3,3,6", "4,4,8"})
    @DisplayName("Teste Fiap")
    public void testSomar(int a, int b, int resultadoEsperado) {
        //Calculadora calculadora = new Calculadora();
        int resultado = calc.somar(a, b);
        assertEquals(resultadoEsperado, resultado);
        assertNotEquals(4, resultado);
    }
}
