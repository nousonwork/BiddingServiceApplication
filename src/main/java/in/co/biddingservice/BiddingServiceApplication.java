package in.co.biddingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;



import in.co.biddingservice.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"in.co.biddingservice"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class BiddingServiceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(BiddingServiceApplication.class, args);
    }
}
