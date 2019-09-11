/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 9/11/19, 7:26 PM
 * Copyright (c) 2019. All rights reserved.
 */

package io.github.tanu31195.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    @Qualifier("RegularWriter")
    TextWriter regularWriter;
    @Autowired
    @Qualifier("FancyWriter")
    TextWriter fancyWriter;

//    public Hello(TextWriter textWriter1) {
//        this.textWriter = textWriter1;
//    }

    @RequestMapping("/")
    public String index() {
        return regularWriter.WriteText("Hi!!!! ") + "\n" + fancyWriter.WriteText("Hi!!!! ");
    }
}
