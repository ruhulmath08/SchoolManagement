/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.projes.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author J2EE-33
 */
public class AuditFilter implements Filter{
     private FilterConfig filterConfig = null;
     
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws 
            IOException, ServletException {
        long startTime = System.currentTimeMillis();
        String remoteAddress = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        HttpServletRequest myReq = (HttpServletRequest)request;
        String reqUrl = myReq.getRequestURI();
        chain.doFilter(request, response);
        filterConfig.getServletContext().log("User at IP : "+remoteAddress + "("+remoteHost+
                ") accessed resource "+reqUrl + " and used" + (System.currentTimeMillis() - startTime)+" ms");
    } 

    @Override
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }


    @Override
    public void destroy() {
        
    }
}
