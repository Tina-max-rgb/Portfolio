package c.t.p.b;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"c.t.p.b", "com.tinhinane.portfolio"})
public class PortfolioBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
	}
}
