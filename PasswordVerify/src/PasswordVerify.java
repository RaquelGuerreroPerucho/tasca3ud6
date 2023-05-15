public class PasswordVerify {
    public static String passwordVerificator(String password) {
        boolean valido = true;
        String error = "";
        int cantDigitos = 0, cantCaracterEspecial = 0, cantidadMayus = 0;

        for (int i=0;i < password.length();i++) {
            if (Character.isDigit(password.charAt(i))) {
                cantDigitos++;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                cantCaracterEspecial++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                cantidadMayus++;
            }
        }

        if (!(password.length()>=8)) {
            error += "\nLa contrasenya ha de tenir almenys 8 caràcters";
            valido = false;
        }
        if (!(cantDigitos>=2)) {
            error += "\nLa contrasenya ha de contenir almenys 2 números";
            valido = false;
        }
        if (!(cantCaracterEspecial>=1)) {
            error += "\nLa contrasenya ha de contenir almenys un caràcter especial";
            valido = false;
        }
        if (!(cantidadMayus>=1)) {
            error += "\nLa contrasenya ha de contenir almenys una lletra majúscula";
            valido = false;
        }
        return new SalidaContrasenya(valido, error).toString();
    }
}
