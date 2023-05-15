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
            error += "La contraseña debe tener mínimo 8 caracteres.";
            valido = false;
        }
        if (!(cantDigitos>=2)) {
            error += "La contraseña debe tener mínimo 2 números.";
            valido = false;
        }
        if (!(cantCaracterEspecial>=1)) {
            error += "La contraseña debe tener mínimo 1 caracter especial.";
            valido = false;
        }
        if (!(cantidadMayus>=1)) {
            error += "La contraseña debe tener mínimo 1 letra mayúscula.";
            valido = false;
        }
        return new SalidaContrasenya(valido, error).toString();
    }
}
