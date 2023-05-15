import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    PasswordVerify p1 = new PasswordVerify();
    @Test
    public void test1() {

        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys 2 números" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2() {

        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys 2 números" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("hola");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys 2 números" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("holacaracola");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("hola12");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys 2 números"+
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial";


        String resultadoReal = PasswordVerify.passwordVerificator("holA");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test6() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys 2 números"+
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";


        String resultadoReal = PasswordVerify.passwordVerificator("hola!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test7() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys 2 números";

        String resultadoReal = PasswordVerify.passwordVerificator("holA!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test8() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("hola12!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test9() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial";

        String resultadoReal = PasswordVerify.passwordVerificator("hola12A");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test10() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("holacaracola12");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test11() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys 2 números"+
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("holacaracola!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test12() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys 2 números"+
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";

        String resultadoReal = PasswordVerify.passwordVerificator("holacaracola!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test13() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys 2 números"+
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = PasswordVerify.passwordVerificator("holacaracolA");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test14() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de tenir almenys 8 caràcters";
        String resultadoReal = PasswordVerify.passwordVerificator("hol12A!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test15() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys 2 números";
        String resultadoReal = PasswordVerify.passwordVerificator("holacaracolaA!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test16() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys una lletra majúscula";
        String resultadoReal = PasswordVerify.passwordVerificator("holacaracola12!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test17() {
        String resultadoEsperado = "false" +
                "\n" + "La contrasenya ha de contenir almenys un caràcter especial";
        String resultadoReal = PasswordVerify.passwordVerificator("holacaracola12A");

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test18() {
        String resultadoEsperado = "true" + "";
        String resultadoReal = PasswordVerify.passwordVerificator("holacaracola12A!");

        assertEquals(resultadoEsperado, resultadoReal);
    }

}
