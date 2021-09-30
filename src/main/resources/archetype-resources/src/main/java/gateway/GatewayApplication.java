#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * GiantsGatewayApplication TODO
 * date time: 2021/9/28 14:59
 * Copyright 2021 github.com/vencent-lu/giants-gateway-archetype Inc. All rights reserved.
 *
 * @author vencent-lu
 * @since 1.0
 */
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
