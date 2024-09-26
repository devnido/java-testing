package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar(){
        // given
        int numeroA = 3;
        int numeroB = 5;

        // when
        int result = example.sumar(numeroA,numeroB);

        // then
        assertEquals(8,result);
    }

    @Test
    public void testCheckPositivo(){
        // given
        int numero = 7;

        //  when
        boolean result = example.checkPositivo(numero);

        // then
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError(){
        // given
        int numero = -7;

        // when - then
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(numero));
    }

    @Test
    public void testContarLetrasA() {
        // given
        String cadena = "hola mundo!";

        // when
        int result = example.contarLetrasA(cadena);

        // then
        assertEquals(1, result);
    }

    @Test
    public void testContieneElemento(){
        // given
        List<String> countries=  List.of("Colombia","Mexico","Peru");
        String country = "Colombia";

        // when
        boolean result = this.example.contieneElemento(countries,country);

        // then
        assertTrue(result);
    }

    @Test
    public void testRevertirCadena(){
        // given
        String cadena = "carro";

        // when
        String result = this.example.revertirCadena(cadena);

        // then
        assertEquals("orrac",result);
    }

    @Test
    public void testFactorial(){
        // given
        int number = 6;

        // when
        long result = this.example.factorial(number);

        // then
        assertEquals(720, result);
    }

    @Test
    public void testFactorialError(){
        // given
        int number = -4;

        // when - then
        assertThrows(IllegalArgumentException.class, () -> this.example.factorial(number));
    }

    @Test
    public void testEsPrimo(){
        // given
        int number = 3;

        // when
        boolean result = this.example.esPrimo(number);

        // then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMayorA4(){
        // given
        int number = 7;

        // when
        boolean result = this.example.esPrimo(number);

        // then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoLessThanOne(){
        // given
        int number = 0;

        // when
        boolean result = this.example.esPrimo(number);

        // then
        assertFalse(result);
    }

    @Test
    public void testEsPrimoFalse(){
        // given
        int number = 9;

        // when
        boolean result = this.example.esPrimo(number);

        // then
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        // given

        // when
        String result = this.example.mensajeConRetraso();

        // then
        assertEquals("Listo después de retraso", result);

    }

    @Test
    public void testConvertirAString(){
        // given
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // when
        List<String> result = this.example.convertirAString(numbers);

        // then
        assertEquals(List.of("1","2","3","4","5","6","7","8","9","10"), result);

    }

    @Test
    public void testCalcularMedia(){
        // given
        List<Integer> numbers = List.of(1,2,3);

        // when
        double result = this.example.calcularMedia(numbers);

        // then
        assertEquals(2,result);

    }

    @Test
    public void testCalcularMediaNull(){
        // given
        List<Integer> numbers = null;

        // when
        assertThrows(IllegalArgumentException.class,()->{
            this.example.calcularMedia(numbers);
        });

    }

    @Test
    public void testCalcularMediaEmpty(){
        // given
        List<Integer> numbers = List.of();

        // when
        assertThrows(IllegalArgumentException.class,()->{
            this.example.calcularMedia(numbers);
        });

    }

    @Test
    public void testConvertirListaAString(){
        // given
        List<String> letras = List.of("H","O","L","A");

        // when
        String result = this.example.convertirListaAString(letras);

        // then
        assertEquals("H,O,L,A",result);


    }


}
