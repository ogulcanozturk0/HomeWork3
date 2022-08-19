
public class WebMain {
    public static void main(String[] args) {


        try{
            String[] arguments = {"start-maximized"};



            LoginPageTest loginPageTest = new LoginPageTest();
            loginPageTest.checkOpenWebV2();
            loginPageTest.checkOpenLogin();



        }catch(IllegalStateException e){
            System.out.println("hasan hoca driver ı yükle lütfen"+ e.getMessage());
        }





    }

}