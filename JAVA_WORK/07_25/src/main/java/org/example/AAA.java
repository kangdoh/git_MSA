package org.example;

class AAA {
    private String name;

    public AAA(String name) {
        this.name = name;
    }

    public void printThis(Object obj) {
        System.out.println("this = " + this);
        System.out.println("(A)obj = " + ((AAA) obj).name);
    }

    @Override
    public boolean equals(Object o) {
        return this.name.equals(((AAA) o).name);
    }

}
