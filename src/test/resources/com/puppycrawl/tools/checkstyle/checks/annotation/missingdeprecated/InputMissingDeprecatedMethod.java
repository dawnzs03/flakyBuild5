/*
MissingDeprecated
violateExecutionOnNonTightHtml = (default)false


*/

package com.puppycrawl.tools.checkstyle.checks.annotation.missingdeprecated;

public class InputMissingDeprecatedMethod {


    /**
     * @deprecated
     *
     * @param comment
     */
    public void method(){ // violation '.*@java.lang.Deprecated annotation.*@deprecated.*'
    }

}
