package com.peach.DubboBalance;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;

import java.util.List;

;

public class PeachHashLoadBalance extends AbstractLoadBalance {


    @SuppressWarnings("unchecked")
    @Override
    protected <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        for (Invoker<T> invoker : invokers) {
            if (invoker.getUrl().getHost().endsWith(invocation.getArguments()[0].toString())) {
                return invoker;
            }
        }
        return invokers.get((int) (Math.random() * invokers.size()));
    }

}
