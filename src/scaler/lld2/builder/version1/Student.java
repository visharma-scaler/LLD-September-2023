package scaler.lld2.builder.version1;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String email;
    private String phoneNumber;
    private int graduationYear;


    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.graduationYear = builder.getGraduationYear();
        this.psp = builder.getPsp();
        this.phoneNumber = builder.getPhoneNumber();
        this.email = builder.getEmail();
        this.universityName = builder.getUniversityName();

    }


    public static Builder getBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }




    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String email;
        private String phoneNumber;
        private int graduationYear;

        public String getName() {
            return name;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public int getGraduationYear() {
            return graduationYear;
        }

        public Builder setGraduationYear(int graduationYear) {
            this.graduationYear = graduationYear;
            return this;
        }


        public Student build() {
            if  (this.getGraduationYear() > 2023) {
                throw new RuntimeException("Validation failed!");
            }
            return new Student(this);
        }
    }
}
