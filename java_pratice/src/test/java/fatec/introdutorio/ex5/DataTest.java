package fatec.introdutorio.ex5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class DataTest {

    @Test
    public void testDataCreation() {
        Data data = new Data(10, 3, 2025);
        assertEquals(10, data.getDia());
        assertEquals(3, data.getMes());
        assertEquals(2025, data.getAno());
    }

    @Test
    public void testDataAtual() {
        Data dataAtual = new Data();
        assertNotNull(dataAtual);
        assertEquals(java.time.LocalDate.now().getDayOfMonth(), dataAtual.getDia());
    }

    @Test
    public void testAvancarDia() {
        Data data = new Data(10, 3, 2025);
        data.avancarDia();
        assertEquals(11, data.getDia());
    }

    @Test
    public void testDataInvalida() {
        Data dataInvalida = new Data(31, 2, 2025);
        assertEquals("01/01/2000", dataInvalida.toString());
    }

    @Test
    public void testSetDiaInvalido() {
        Data data = new Data(10, 3, 2025);
        data.setDia(32);
        assertEquals(10, data.getDia());
    }

    @Test
    public void testSetMesInvalido() {
        Data data = new Data(10, 3, 2025);
        data.setMes(13);
        assertEquals(3, data.getMes());
    }
}
