#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.sample.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController TODO
 * date time: 2021/9/28 15:34
 * Copyright 2021 github.com/vencent-lu/giants-gateway-archetype Inc. All rights reserved.
 *
 * @author vencent-lu
 * @since 1.0
 */
@Api(tags = "示例")
@RestController
@RequestMapping(value = "sample")
public class SampleController {

    @ApiOperation(value = "Hello World")
    @GetMapping(value = "hello-world")
    public String helloWorld() {
        return "Hello World!!!";
    }

}
