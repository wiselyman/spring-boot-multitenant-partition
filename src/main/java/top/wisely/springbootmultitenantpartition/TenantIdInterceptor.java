package top.wisely.springbootmultitenantpartition;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class TenantIdInterceptor implements HandlerInterceptor {
    private final WiselyTenantIdResolver tenantIdResolver;

    public TenantIdInterceptor(WiselyTenantIdResolver tenantIdResolver) {
        this.tenantIdResolver = tenantIdResolver;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        tenantIdResolver.setCurrentTenant(request.getHeader("x-tenant-id"));
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
