package org.example;

public class MemberDto {
    private static String url = "http://kakaoLogin";

    static class MemberReqDto{
        private String name;
        private int age;

        public MemberReqDto(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "MemberReqDto{" +
                    "url=" + url + '\'' +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class MemberResDto{
        private String name;
        private int age;

        public MemberResDto(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "MemberResDto{" +
                    "url=" + url + '\'' +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }








}