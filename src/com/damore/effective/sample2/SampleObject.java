package com.damore.effective.sample2;

public class SampleObject {

    private SampleObject(Builder builder) { 
    	this.mandatory1 = builder.mandatory1;
    	this.mandatory2 = builder.mandatory2;
        this.optional1 = builder.optional1;
        this.optional2 = builder.optional2;
        this.optional3 = builder.optional3;
    }

    // Mandatory Parameters
    private final int mandatory1;
    private final int mandatory2;
    
    // Optional Parameters
    private final int optional1;
    private final String optional2;
    private final double optional3;

    public static class Builder { 

        public Builder(int mandatory1, int mandatory2) {
        	this.mandatory1 = mandatory1;
        	this.mandatory2 = mandatory2;
        }

        // Mandatory Parameters
        private final int mandatory1;
        private final int mandatory2;

        // Optional Parameters
        private int optional1;
        private String optional2;
        private double optional3;

        public Builder setValue1(int optional1) {
            this.optional1 = optional1;
            return this;
        }

        public Builder setValue2(String optional2) {
            this.optional2 = optional2;
            return this;
        }

        public Builder setValue3(double optional3) {
            this.optional3 = optional3;
            return this;
        }

        public SampleObject build() {
            return new SampleObject(this);
        }
    }

    public String toString() {
        return "[" + this.mandatory1 + ", " + this.mandatory2 + ", " + this.optional1 + ", " + this.optional2 + ", " + this.optional3 + "]";
    }

    public static void main(String[] args) {

    	SampleObject.Builder sampleObjectBuilder1 = new SampleObject.Builder(5, 6);
        
        SampleObject sampleObject1 = sampleObjectBuilder1.setValue1(10)
        		.setValue2("Ciao").setValue3(1.0).build();
        System.out.println(sampleObject1);

        SampleObject sampleObject2 = new SampleObject.Builder(7, 8).build();
        System.out.println(sampleObject2);
    }

}
