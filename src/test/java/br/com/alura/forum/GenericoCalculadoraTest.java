package br.com.alura.forum;

import org.jboss.jandex.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.ibm.tudodebom.controller.GenericoCalculadora;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenericoCalculadoraTest {
 
	@SuppressWarnings("deprecation")
	@Test
public void testar() {
	GenericoCalculadora calc = new GenericoCalculadora();
	double preco = calc.calcular(100.00);
	
Assert.assertEquals(80.00,preco, 0);	
}
}
