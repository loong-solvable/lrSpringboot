package com.powernode.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app2.abc")
public class AppBean {
    private String[] names;
    private Address[] addrArray;
    private List<Address> addrList;
    private Map<String,Address> addrs;

    @Override
    public String toString() {
        return "AppBean{" +
                "names=" + Arrays.toString(names) +
                ", addrArray=" + Arrays.toString(addrArray) +
                ", addrList=" + addrList +
                ", addrs=" + addrs +
                '}';
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setAddrArray(Address[] addrArray) {
        this.addrArray = addrArray;
    }

    public void setAddrList(List<Address> addrList) {
        this.addrList = addrList;
    }

    public void setAddrs(Map<String, Address> addrs) {
        this.addrs = addrs;
    }
}
