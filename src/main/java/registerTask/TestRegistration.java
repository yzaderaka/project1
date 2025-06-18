package registerTask;

public class TestRegistration {
    public static void main(String[] args) {

        Registeration registeration=new Registeration();
        //Invalid values
        System.out.println("******** Invalid values ********");
        registeration.setEmail("yzaderaka@gmail.com");
        registeration.setUserName("");
        registeration.setUserName("John");
        registeration.setPassword("");
        registeration.setPassword("John");
        registeration.setPassword("test12");

        //Valid values
        System.out.println();
        System.out.println("******** Valid values ********");
        registeration.setEmail("yzaderaka@yahoo.com");
        registeration.setUserName("yzaderaka");
        registeration.setPassword("qwerty123456");
        System.out.println(registeration.getEmail());
        System.out.println(registeration.getUserName());
        System.out.println(registeration.getPassword());
    }
}
