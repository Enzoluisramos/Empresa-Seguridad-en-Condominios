public class admin {
    String administradorUSER;
    String administradorPASSWORD;

    public admin(String administradorUSER, String administradorPASSWORD){
        this.administradorUSER = administradorUSER;
        this.administradorPASSWORD = administradorPASSWORD;
    }

    public String OBTENER_adminUSER(){
        return administradorUSER;
    }

    public String OBTENER_ADMINpassword(){
        return administradorPASSWORD;
    }
}
