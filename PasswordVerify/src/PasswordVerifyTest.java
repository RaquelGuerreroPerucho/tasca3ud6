import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @Test
    public void test1() {

        PasswordVerify p1 = new PasswordVerify();

        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys 2 números" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("");

        assertEquals(resultadoEsperado, resultadoReal);
    }

}