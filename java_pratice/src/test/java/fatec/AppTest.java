package fatec;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import fatec.introdutorio.ex2.InvoiceTest;
import fatec.introdutorio.ex3.EmpregadoTest;
import fatec.introdutorio.ex4.ComplexTest;
import fatec.introdutorio.ex5.DataTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    InvoiceTest.class,
    EmpregadoTest.class,
    ComplexTest.class,
    DataTest.class
})
public class AppTest {
}
