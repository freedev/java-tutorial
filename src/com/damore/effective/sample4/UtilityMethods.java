package com.damore.effective.sample4;

// Noninstantiabile class utility
public class UtilityMethods {
	
	// Default constructor suppressed for noninstantiability
    private UtilityMethods() {
        throw new AssertionError();
    }
    
    public static void utilityMethod1() {}

    public static void utilityMethod2() {}

    public static void utilityMethod3() {}
}
