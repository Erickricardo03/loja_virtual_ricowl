package lojavirtual.ricowl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "lojavirtual.ricowl.model")
@ComponentScan(basePackages = {"lojavirtual.ricowl"})
@EnableJpaRepositories(basePackages = {"lojavirtual.ricowl.repository"})
@EnableTransactionManagement
public class LojaVirtualRicowlApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualRicowlApplication.class, args);
	}

}
