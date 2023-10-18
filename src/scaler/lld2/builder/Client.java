package scaler.lld2.builder;

import scaler.lld2.builder.version1.Student;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Vishal");
//        builder.setAge(25);
//        builder.setEmail("afsfs@sdfsdaf.com");
//        builder.setPsp(80.0);
//        builder.setPhoneNumber("9876541233");
//        builder.setGraduationYear(2024);
//        builder.setUniversityName("Hello");
//
//
//        Student student = builder.build();


        Student student = Student.getBuilder()
                .name("Vishal")
                .age(25)
                .setEmail("afsfs@sdfsdaf.com")
                .setPsp(80.0)
                .setPhoneNumber("9876541233")
                .setGraduationYear(2023)
                .setUniversityName("Hello")
                .build();

        System.out.println("DEBUG");



        String s = new String("Vishal");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi")
                .append("Vishal")
                .append("and")
                .append("Akhil");


        System.out.println(stringBuilder.toString());
    }
}
