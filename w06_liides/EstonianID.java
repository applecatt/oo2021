public class EstonianID implements PersonalCodeBehaviour{
    public String code;

    public EstonianID(String code) {
        this.code = code;
    }
    @Override
    public String getGender() {
        String gender = "";
        if (Integer.parseInt(code.substring(0,1))%2==0){
            gender = "N";
        } else {
            gender = "M";
        }
        return gender;
    }

    @Override
    public int getFullYear() {
        int year = 1800 + ((Integer.parseInt(code.substring(0,1))+1)/2-1)*100+(Integer.parseInt(code.substring(1,3)));
        return year;
    }

    @Override
    public String getDOB() {
        String dob = code.substring(5, 7)+"."+code.substring(3, 5)+"."+ Integer.toString(getFullYear());
        return dob;
    }
    @Override
    public int getAge() {
        int age = 2021-getFullYear();
        return age;
    }
    
}
