package pro.kensait.designpattern.lesson05.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PersonAspect {
    @Around("execution (* jp.mufg.it.aspectj..*.*(..))")
    public Object aroundExecution(ProceedingJoinPoint pjp) throws Throwable {
        // 呼び出し先クラス名とメソッド名を取得し、出力する
        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        System.out.println("[ " + className + "#" + methodName + " ]");
        // 引数を取得し、出力する
        Object[] args = pjp.getArgs();
        if (args != null) {
            for (Object arg : args)
                System.out.println("args ---> " + arg);
        }
        // ジョインポイントとなるメソッドを実際に呼び出し、戻り値を受け取る
        Object retVal = pjp.proceed();
        // 戻り値を出力する
        System.out.println("return ---> " + retVal);
        // 戻り値を返す
        return retVal;
    }
}