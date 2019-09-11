/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 9/11/19, 7:15 PM
 * Copyright (c) 2019. All rights reserved.
 */

package io.github.tanu31195.HelloWorld;

import org.springframework.stereotype.Component;

@Component
public interface TextWriter {

    public String WriteText(String s);
}
