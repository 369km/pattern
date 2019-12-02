package com.foo.pattern.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {
    private List<IProject> projectList = new ArrayList<>();
    private String name;
    private int num;
    private int cost;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        return new StringBuilder("项目名称:").append(this.name)
                .append("项目人数:").append(this.num)
                .append("项目经费:").append(this.cost)
                .toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
