public class Register extends Account {
    public Register(){
        this.id=0;
        this.balance=0;
        this.dateCreated= new java.util.Date();
    }
    //Registration
    public Register(String Registration_name , String Registration_password , int balance){
        super.name=Registration_name;
        super.dateCreated= new java.util.Date();
        super.balance=balance;
        super.id=count;
        count++;
        while(true){
            this.password=Registration_password;
            if(Registration_password.length()>=minimum_passwordlenght){
                System.out.println("Successful Registration\n ");
                System.out.println(toString());
                break;
            }
            else{
                System.out.println("your password is weak !");
                Registration_password=sc.next();
                if(Registration_password.length()>=minimum_passwordlenght){
                    this.password=Registration_password;
                    System.out.println("Successful Registration\n ");
                    System.out.println(toString());
                    break;
                }
            }
        }
    }
// Login
    String try_again_flag;
    public void login1(String Login_name , String Login_password , Register obj){
        while (!obj.try_again_flag.equals("-1")){
            if((Login_name.equals(this.name) || Login_name.equals(String.valueOf(this.id))) && Login_password.equals(this.password)){
                System.out.println("Successful login\n");
                System.out.println(toString());
                break;
            }
            else if((!Login_name.equals(this.name) || !Login_name.equals(String.valueOf(this.id))) && Login_password.equals(this.password)){
                System.out.println("Wrong Name\nPress 1 to Try-again or -1 to Cancel or Press 0 to Exit ");
                obj.try_again_flag=sc.next();
                if(obj.try_again_flag.equals("1")){
                    Login_name=sc.next();
                    if(Login_name.equals(this.name) || Login_name.equals(String.valueOf(this.id))){
                        System.out.println("Successful login\n");
                        System.out.println(toString());
                        break;
                    }
                }
                else if(obj.try_again_flag.equals("-1")){
                }
                else if (obj.try_again_flag.equals("0")){
                    System.exit(0);
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
            else if((Login_name.equals(this.name) || Login_name.equals(String.valueOf(this.id))) && !Login_password.equals(this.password)){
                System.out.println("Wrong password\nPress 1 to Try-again or -1 to Cancel or Press 0 to Exit ");
                obj.try_again_flag=sc.next();
                if(obj.try_again_flag.equals("1")){
                    Login_password=sc.next();
                    if(Login_password.equals(this.password)){
                        System.out.println("Successful login\n");
                        System.out.println(toString());
                        break;
                    }
                }
                else if(obj.try_again_flag.equals("-1")){
                }
                else if (obj.try_again_flag.equals("0")){
                    System.exit(0);
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
            else{
                System.out.println("Wrong Name or Password\nPress 1 to Try-again or -1 to Cancel or Press 0 to Exit ");
                obj.try_again_flag=sc.next();
                if (obj.try_again_flag.equals("1")){
                    Login_name=sc.next();
                    Login_password=sc.next();
                    if((Login_name.equals(this.name) || Login_name.equals(String.valueOf(this.id))) && Login_password.equals(this.password)){
                        System.out.println("Successful login\n");
                        System.out.println(toString());
                        break;
                    }
                }
                else if(obj.try_again_flag.equals("-1")){

                }
                else if (obj.try_again_flag.equals("0")){
                    System.exit(0);
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}
