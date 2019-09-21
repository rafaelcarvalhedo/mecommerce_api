package br.com.mecommerce.mockup;

import br.com.mecommerce.model.Produto;
import br.com.mecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ApplicationStartup 
implements ApplicationListener<ApplicationReadyEvent> {

  @Autowired
  private ProdutoRepository produtoRepository;


  /**
   * Popula o banco com dados inicais
   * @param event
   */
  @Override
  public void onApplicationEvent(final ApplicationReadyEvent event) {

    produtoRepository.save(new Produto(1,"Macbook de 12 Polegadas, 512 GB",new BigDecimal(5.12)));
    produtoRepository.save(new Produto(2,"Smartphone Motorola Moto G7 Play",new BigDecimal(250)));
    produtoRepository.save(new Produto(3,"Ar Condicionado Split 9000 Btu/s Samsung Digial Inverter",new BigDecimal(150)));
    produtoRepository.save(new Produto(4,"Smartphone Motorola Moto G7 Play",new BigDecimal(8.12)));
    produtoRepository.save(new Produto(5,"Macbook de 12 Polegadas, 512 GB",new BigDecimal(123.12)));
    // here your code ...

    return;
  }
}