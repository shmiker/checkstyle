package org.checkstyle.suppressionxpathfilter.commentsindentation;

public class InputXpathCommentsIndentationEmptyCase {
    int n;

    public void foo() {
        switch(n) {
            case 1:
// Comment // warn
            default:
        }
    }
}
