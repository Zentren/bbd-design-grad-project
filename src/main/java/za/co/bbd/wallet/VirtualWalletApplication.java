package za.co.bbd.wallet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirtualWalletApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(VirtualWalletApplication.class);
		
		logger.error("Hello");
		SpringApplication.run(VirtualWalletApplication.class, args);
	}

}
