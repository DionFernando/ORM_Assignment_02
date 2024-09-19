package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Boy {
    @Id
    private int bId;
    private String name;
    private String address;

    @OneToMany(mappedBy = "child",fetch = FetchType.LAZY)

    private List<Watch> watchList;

    public Boy() {
    }

    public Boy(int bId, String name, String address, List<Watch> watchList) {
        this.bId = bId;
        this.name = name;
        this.address = address;
        this.watchList = watchList;
    }

    public int getsId() {
        return bId;
    }

    public void setsId(int sId) {
        this.bId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Watch> getWatchList() {
        return watchList;
    }

    public void setWatchList(List<Watch> watchList) {
        this.watchList = watchList;
    }
}
