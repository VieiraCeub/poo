package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {

    @Test
    public void testSomar() {
        // Arrange (preparação)
        Calculadora calculadora = new Calculadora();
        int a = 5;
        int b = 3;

        // Act (ação)
        int resultado = calculadora.somar(a, b);

        // Assert (verificação)
        int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, resultado);
    }
}
