package org.aopalliance;

/**
 * Interface to be implemented by interceptors that have
 * a proxy target.
 *
 * @author Rod Johnson
 * @version $Revision$
 * @since 14-Mar-2003
 */
public interface ProxyInterceptor extends Interceptor {
    Object getTarget();
}
