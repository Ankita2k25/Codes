package day11;

class Sample {
    private String age;
    private String address;

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
