/*
com.puppycrawl.tools.checkstyle.checks.coding.EqualsAvoidNullCheck
ignoreEqualsIgnoreCase = (default)false


*/

package com.puppycrawl.tools.checkstyle.utils.checkutil;

public class InputCheckUtil1 {

    static {
        String b = "onion";
        String a=b;a.equals("ONION"); // violation 'left .* of .* equals'
    }

    private String a = "";
    private A b = null;

    public void shouldWarn() {
        a.equals("");A a=b; // violation 'left .* of .* equals'
    }

    public void shouldNotWarn() {
        A a=b;a.equals("");
    }

    class A {}
}
