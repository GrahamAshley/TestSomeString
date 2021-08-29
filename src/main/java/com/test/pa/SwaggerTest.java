package com.test.pa;

import com.test.entity.NameSpace;
import com.test.entity.Resp;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 101217
 * @Date 2021/7/6
 * @Version 1.0
 */
/* 类注解 */
@Api(value = "desc of class")
@RestController
public class SwaggerTest {
    /* 方法注解 */
    @ApiOperation(value = "desc of method", notes = "")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK",response = NameSpace.class),
    })
    @RequestMapping(value="/hello")
    public Resp hello( /* 参数注解 */ @ApiParam(value = "desc of param" , required=true ) @RequestParam String name) {
        NameSpace nameSpace = new NameSpace();
        nameSpace.setPassword("dsa");
        nameSpace.setUserName("ddd");
        return Resp.success().setData(nameSpace);
    }
}
