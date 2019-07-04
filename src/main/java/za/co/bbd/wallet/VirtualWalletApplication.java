package za.co.bbd.wallet;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirtualWalletApplication {

	private static Logger dbLogger = LoggerFactory.getLogger("DB");
	private static Logger logger = LoggerFactory.getLogger(VirtualWalletApplication.class);

	public static void main(String[] args) {
		
		logger.error("Hello");
		SpringApplication.run(VirtualWalletApplication.class, args);
	}

}
