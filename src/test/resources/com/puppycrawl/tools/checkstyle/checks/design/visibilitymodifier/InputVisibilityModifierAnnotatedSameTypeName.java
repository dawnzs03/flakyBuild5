/*
VisibilityModifier
packageAllowed = (default)false
protectedAllowed = (default)false
publicMemberPattern = (default)^serialVersionUID$
allowPublicFinalFields = (default)false
allowPublicImmutableFields = (default)false
immutableClassCanonicalNames = (default)java.io.File, java.lang.Boolean, java.lang.Byte, \
                               java.lang.Character, java.lang.Double, java.lang.Float, \
                               java.lang.Integer, java.lang.Long, java.lang.Short, \
                               java.lang.StackTraceElement, java.lang.String, \
                               java.math.BigDecimal, java.math.BigInteger, \
                               java.net.Inet4Address, java.net.Inet6Address, \
                               java.net.InetSocketAddress, java.net.URI, java.net.URL, \
                               java.util.Locale, java.util.UUID
ignoreAnnotationCanonicalNames = com.google.common.annotations.VisibleForTesting, \
                                 com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier \
                                 .InputVisibilityModifierLocalAnnotations.ClassRule


*/

package com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;


public class InputVisibilityModifierAnnotatedSameTypeName
{
    @Rule
    public TemporaryFolder publicJUnitRule = new TemporaryFolder(); // violation

    @ClassRule
    public TemporaryFolder publicJUnitClassRule = new TemporaryFolder(); // violation
}
