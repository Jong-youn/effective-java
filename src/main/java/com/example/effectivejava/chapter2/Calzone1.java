package com.example.effectivejava.chapter2;

public class Calzone1 extends Pizza1 {
    private final boolean sauceInside;

    @Override
    public String toString() {
        return "Calzone1{" +
                "toppings=" + toppings +
                '}';
    }

    public static class Builder extends Pizza1.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside(Boolean sauceInside) {
            this.sauceInside = sauceInside;
            return this;
        }

        @Override
        public Calzone1 build() {
            return new Calzone1(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone1(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
