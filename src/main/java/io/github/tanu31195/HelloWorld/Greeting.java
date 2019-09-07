/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 9/7/19, 2:48 PM
 * Copyright (c) 2019. All rights reserved.
 */

package io.github.tanu31195.HelloWorld;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
