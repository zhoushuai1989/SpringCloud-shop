/**
 * 科技公司源代码，版权归科技公司所有。
 * 项目名称 : 工厂设计模式-邮件类
 * 创建日期 :  2019/5/27
 * 修改历史 :
 * 1. [ 2019/5/27]创建文件 by Administrator
 */
package com.wangcai.api.service.impl;

/**
 *TODO 添加类/接口功能描述
 *@author:Administrator
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is SmsSender!");
    }
}