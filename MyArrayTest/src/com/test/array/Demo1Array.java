package com.test.array;

public: class Demo1Array {
    public static void main(String[] args) {
        student[] arr1 = new student[3];
        System.out.println(arr1.length);

//        System.out.println(arr1);
        student stu4 = new student("hello",9999);
        student stu5 = new student("fuxxxxk",12345);
//        System.out.println(stu4.getName()+"...."+stu4.getAge());
        arr1[0] = stu5;
        arr1[1] = stu4;
        System.out.println(arr1[0].getName());
        for (int i = 0; i < arr1.length-1; i++) {

            student temp = arr1[i];
            System.out.println(temp.getName()+"..."+temp.getAge());
        }
        student[] arr = new student[3];
//        student stu1 = new student("zhangshan", 12);
//        student stu2 = new student("lisi", 19);
//        student stu3 = new student("wangwu", 21);
//        System.out.println(stu1.getName() + "..." + stu1.getAge());
//        System.out.println(stu2.getName() + "..." + stu2.getAge());
//        System.out.println(stu3.getName() + "..." + stu3.getAge());
//        ArrayList<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add("123");
//        list.add("helloworld");
//        list.add(2,"11111");
//        list.add(123);
//        list.add(true);
//        System.out.println(list);

//        arr[0] = stu1;
//        arr[1] = stu2;
//        arr[2] = stu3;
//        for (int i = 0; i < arr.length; i++) {
//            student temp = arr[i];
//            System.out.println(temp.getName() + "..." + temp.getAge());
//
//        }

    }

}


