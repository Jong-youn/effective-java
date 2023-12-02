package com.example.effectivejava.chapter2;

import java.util.Objects;

public class NyPizza1 extends Pizza1 {

    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza1.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public Pizza1 build() {
            return new NyPizza1(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza1(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}
