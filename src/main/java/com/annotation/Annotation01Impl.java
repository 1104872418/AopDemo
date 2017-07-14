package com.annotation;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 实现
* @ClassName: Annotation01Impl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Mr.Dong
* @date 2017年7月14日 下午5:25:51
 */
@Aspect
@Component
public class Annotation01Impl {

	@Around("@annotation(at)")
	public Object validateAccessToken(ProceedingJoinPoint pjp, Annotation01 at) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		System.out.println("进入切面");
		 return pjp.proceed();
	}
}
