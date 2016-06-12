package com.deingvard.aclass;

/**
 * Created by igor on 12.06.16.
 */
public abstract class AbstractSmileProcessor {

    public void process() {
        final String text = this.readString();
        final String result = text.replace(":)", "=)");
        System.out.println(result);
    }

        protected abstract String readString();

}
