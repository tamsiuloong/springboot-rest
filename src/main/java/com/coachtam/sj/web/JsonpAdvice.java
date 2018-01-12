package com.coachtam.sj.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * @author coach tam
 * @date 2018/1/11
 */
@ControllerAdvice(basePackages = "com.coachtam.sj.web")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonpAdvice() {
        super("callback","jsonp");
    }
}