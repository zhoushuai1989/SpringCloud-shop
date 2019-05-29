/**
 * 科技公司源代码，版权归科技公司所有。
 * 项目名称 : 适配器模式-对象
 * 创建日期 :  2019/5/27
 * 修改历史 :
 * 1. [ 2019/5/27]创建文件 by Administrator
 */
package com.wangcai.api.service.impl.adapter;

/**
 *TODO 添加类/接口功能描述
 *@author:Administrator
 */
public class Wrapper  implements Targetable{
    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}