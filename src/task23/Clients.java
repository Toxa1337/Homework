package task23;

public class Clients {
    private int year = 0;
    private String login = "";
    public Clients(int year, String login){
        this.year = year;
        this.login = login;
    }
    public int hashCode() {
        int result = login == null ? 0 : login.hashCode();
        result = 11 * result + year;
        return result;
    }

    public static void main(String[] args){
        Clients smart1 = new Clients(2014, "Toxa1337");
        Clients smart2 = new Clients(2015, "Opa$n'ii'_tapok");
        Clients smart3 = new Clients(2013, "Chelik");
        Clients smart4 = new Clients(2014, "Gigabozz");
        Clients smart5 = new Clients(2012, "Televizzor");


        if(smart1.hashCode()==smart1.hashCode()) {
            System.out.println("This user: " + smart1.login + " same as " + smart5.login);
        }
        else System.out.println("This user: " + smart1.login + " not same as  " + smart5.login);
        System.out.println("Hash of this user " + smart1.login +  ": " + smart1.hashCode());
        System.out.println("Hash of this user " + smart5.login + ": " + smart5.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart2.hashCode()) {
            System.out.println("User " + smart1.login + " same as " + smart2.login);
        }
        else System.out.println("User " + smart1.login + " not same as " + smart2.login);
        System.out.println("User hash " + smart1.login + ": " + smart1.hashCode());
        System.out.println("User hash " + smart2.login +  ": " + smart2.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart3.hashCode()) {
            System.out.println("User " + smart1.login + " same as " + smart3.login);
        }
        else System.out.println("User " + smart1.login + " not same as " + smart3.login);
        System.out.println("User hash " + smart1.login + ": " + smart1.hashCode());
        System.out.println("User hash " + smart3.login + ": " + smart3.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart4.hashCode()) {
            System.out.println("User " + smart1.login + " same as " + smart4.login);
        }
        else System.out.println("User " + smart1.login +  " not same as " + smart4.login);
        System.out.println("User hash " + smart1.login + ": " + smart1.hashCode());
        System.out.println("User hash " + smart5.login + ": " + smart4.hashCode());


    }
}