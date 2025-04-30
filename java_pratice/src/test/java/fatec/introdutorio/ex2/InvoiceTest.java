package fatec.introdutorio.ex2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InvoiceTest {

    @Test
    public void testInvoiceCreation() {
        Invoice invoice = new Invoice(101, "Teclado Mecânico", 2, 150.00);
        assertEquals(101, invoice.getNumero());
        assertEquals("Teclado Mecânico", invoice.getDescricao());
        assertEquals(2, invoice.getQuantidade());
        assertEquals(150.00, invoice.getPrecoUnitario(), 0.01);
    }

    @Test
    public void testGetInvoiceAmount() {
        Invoice invoice = new Invoice(101, "Teclado Mecânico", 2, 150.00);
        assertEquals(300.00, invoice.getInvoiceAmount(), 0.01);
    }

    @Test
    public void testSettersAndGetters() {
        Invoice invoice = new Invoice(101, "Teclado", 1, 200.00);
        invoice.setNumero(102);
        invoice.setDescricao("Mouse");
        invoice.setQuantidade(3);
        invoice.setPrecoUnitario(100.00);

        assertEquals(102, invoice.getNumero());
        assertEquals("Mouse", invoice.getDescricao());
        assertEquals(3, invoice.getQuantidade());
        assertEquals(100.00, invoice.getPrecoUnitario(), 0.01);
    }
}
