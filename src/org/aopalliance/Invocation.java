package org.aopalliance;

/**
 * This interface represents an invocation in the program.
 *
 * <p>An invocation is a joinpoint and can be intercepted by an
 * interceptor.
 *
 * @author Rod Johnson
 */
public interface Invocation {

    //Object addAttachment(String var1, Object var2);

    //Object getAttachment(String var1);

    Object getInvokedObject();

    Object invokeNext() throws Throwable;

    Invocation detach();

    Invocation cloneInstance();

    AttributeRegistry getAttributeRegistry();

    /**
     * Get the arguments as an array object.
     * It is possible to change element values within this
     * array to change the arguments.
     *
     * @return the argument of the invocation
     */
    Object[] getArguments();

    int getArgumentCount();

    Object getArgument(int var1);

    void setArgument(int var1, Object var2);

}
