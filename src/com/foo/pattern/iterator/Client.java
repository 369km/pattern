package com.foo.pattern.iterator;

public class Client {
    public static void main(String[] args) {
        IProject project=new Project();
        project.add("a",20,1000000);
        project.add("b",20,1000000);
        project.add("c",20,1000000);
        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()){
            IProject next = (IProject) iterator.next();
            System.out.println(next.getProjectInfo());
        }
    }
}
