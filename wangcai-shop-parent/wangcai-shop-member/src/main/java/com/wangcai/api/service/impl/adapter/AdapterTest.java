/**
 * 科技公司源代码，版权归科技公司所有。
 * 项目名称 : 适配器模式-测试类
 * 创建日期 :  2019/5/27
 * 修改历史 :
 * 1. [ 2019/5/27]创建文件 by Administrator
 */
package com.wangcai.api.service.impl.adapter;

/**
 *TODO 添加类/接口功能描述
 *@author:Administrator
 */
public class AdapterTest {
    public static void main(String[] args) {
        //方法适配器
        /*Targetable target = new Adapter();
        target.method1();
        target.method2();*/
        //对象适配器
        /*Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();*/
        //接口适配器
        Targetable source1 = new SourceSub1();
        Targetable source2 = new SourceSub2();

        source1.method1();
        //source1.method2();
        //source2.method1();
        source2.method2();
    }
}