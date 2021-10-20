public class DelimiterMatch {
    private String mExpression;

    // constructors
    public DelimiterMatch(String s) {
        mExpression = s;
    }

    // accessors
    public String getString() {
        return mExpression;
    }

    // mutators
    public void setString(String s) {
        mExpression = s;
    }

    // doMatch method returns true if there
    // is a match and false if not
    public boolean doMatch() {
        CharStack myStack = new CharStack(100);
        for (int i = 0; i < mExpression.length(); i++) {
            if (mExpression.charAt(i) == '[' || mExpression.charAt(i) == '(' || mExpression.charAt(i) == '{') {
                myStack.Push(mExpression.charAt(i));
            } else if (mExpression.charAt(i) == ']' || mExpression.charAt(i) == ')' || mExpression.charAt(i) == '}') {
                if (myStack.isEmpty()) // an open should be in the stack
                    return false;
                char temp = myStack.Pop();
                if (temp == '(' && mExpression.charAt(i) != ')') {
                    // the character in the string should be ')'
                    // if not then delimiter mismatch
                    return false;
                } else if (temp == '[' && mExpression.charAt(i) != ']') {
                    // the character in the string should be ')'
                    // if not then delimiter mismatch
                    return false;
                } else if (temp == '{' && mExpression.charAt(i) != '}') {
                    // the character in the string should be ')'
                    // if not then delimiter mismatch
                    return false;
                } // no need for an else, mean there is a match
            }
        }
        if (myStack.isEmpty())
            return true;
        return false;
    }

}