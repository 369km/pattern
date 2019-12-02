package com.foo.pattern.struct.combination;

public class Client {
    public static void main(String[] args) {
        Branch ceo = combinateCompany();
        System.out.println(ceo.getInfo());
        getBranchInfo(ceo);
    }

    private static Branch combinateCompany() {
        Branch huangdi = new Branch(new Employee("始皇帝", 35, "男"));
        Branch chengxiang = new Branch(new Employee("李斯", 32, "男"));
        Leaf mengtian = new Leaf(new Employee("蒙恬", 25, "男"));
        Branch zhaogao = new Branch(new Employee("赵高", 37, "太监"));
        huangdi.addSubordinate(chengxiang);
        chengxiang.addSubordinate(mengtian);
        huangdi.addSubordinate(zhaogao);
        return huangdi;
    }

    private static void getBranchInfo(Branch branch) {
        branch.getSubbordinate().forEach(corp -> {
            System.out.println(corp.getInfo());
            if (corp instanceof Branch) {
                getBranchInfo((Branch) corp);
            }
        });
    }


}
