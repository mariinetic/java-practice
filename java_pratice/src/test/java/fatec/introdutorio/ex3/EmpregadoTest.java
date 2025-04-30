package fatec.introdutorio.ex3;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class EmpregadoTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testEmpregadoCreation() {
        Empregado empregado = new Empregado("Ana", "Silva", 3000);
        
        assertEquals("Ana", empregado.getPrimeiroNome());
        assertEquals("Silva", empregado.getSobrenome());
        assertEquals(3000, empregado.getSalarioMensal(), 0.01);
    }

    @Test
    public void testSalarioAnual() {
        Empregado empregado = new Empregado("Carlos", "Santos", 4000);
        assertEquals(48000, empregado.getSalarioAnual(), 0.01);
    }

    @Test
    public void testAplicarAumento() {
        Empregado empregado = new Empregado("Ana", "Silva", 3000);
        empregado.aplicarAumento(10);
        
        assertEquals(3300, empregado.getSalarioMensal(), 0.01);
        assertEquals(39600, empregado.getSalarioAnual(), 0.01);
    }
}
