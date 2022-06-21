package com.marketplace.marketplace;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "API Docs - Swagger",
        version = "1.0",
        description = "marketplaceRestAPI"
))

/*Access to SWAGGER DOCK API - http://localhost:8080/swagger-ui/index.html#/ */

public class MarketplaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketplaceApplication.class, args);
    }

}
