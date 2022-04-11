public class Pessoa {
    //Definição de Atributos
    protected String name;
    protected double age;
    protected char sex;
    //Definição de métodos
    //Constructor
    public Pessoa(String vName, double vAge, char vSex){ 
        name = vName;
        age = vAge;
        sex = vSex;
    }
    public String getName() {
        return name;
    }
    public void setName(String vName) {
        name = vName;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double vAge) {
        age = vAge;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char vSex) {
        sex = vSex;
    }
    public void gettingOlder() {
        idade += 1;
    }
}