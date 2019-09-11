/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 9/11/19, 7:22 PM
 * Copyright (c) 2019. All rights reserved.
 */

package io.github.tanu31195.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FancyWriter")
public class FancyWriter implements TextWriter {

    public String WriteText(String s) {
        return s + " Fancy Text";
    }
}
