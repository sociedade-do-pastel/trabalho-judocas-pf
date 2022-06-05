package org.fpij.jitakyoei.model.beans;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class FiliadoTest {
    @Test
    public void inserirDataDeNascimentoValida() {
        Filiado f = new Filiado();
        Calendar d = Calendar.getInstance();
        d.set(1999, Calendar.JANUARY, 1);
        f.setDataNascimento(d.getTime());
        Assert.assertEquals(d.getTime(), f.getDataNascimento());
    }

    @Test(expected = Exception.class)
    public void inserirDataDeNascimentoFutura() {
        Filiado f = new Filiado();
        Date d = new Date();
        d.setYear(d.getYear() + 1);
        f.setDataNascimento(d);
    }

    @Test
    public void inserirDataDeCadastroValida() {
        Filiado f = new Filiado();
        Date d = new Date();
        f.setDataCadastro(d);
        Assert.assertEquals(d, f.getDataCadastro());
    }

    @Test(expected = Exception.class)
    public void inserirDataDeCadastroFutura() {
        Filiado f = new Filiado();
        Date d = new Date();
        d.setYear(d.getYear() + 1);
        f.setDataCadastro(d);
    }

    @Test
    public void inserirTelefone1Valido() {
        Filiado f = new Filiado();
        f.setTelefone1("(086)1234-5432");
        Assert.assertEquals("(086)1234-5432", f.getTelefone1());
    }

    @Test(expected = Exception.class)
    public void inserirTelefone1ComLetras() {
        Filiado f = new Filiado();
        f.setTelefone1("11ABCD12345");
    }

    @Test(expected = Exception.class)
    public void inserirTelefone1Nulo() {
        Filiado f = new Filiado();
        f.setTelefone1(null);
    }

    @Test(expected = Exception.class)
    public void inserirTelefone1Vazio() {
        Filiado f = new Filiado();
        f.setTelefone1(" ");
    }

    @Test
    public void inserirTelefone2Valido() {
        Filiado f = new Filiado();
        f.setTelefone2("(086)1234-5432");
        Assert.assertEquals("(086)1234-5432", f.getTelefone1());
    }

    @Test(expected = Exception.class)
    public void inserirTelefone2ComLetras() {
        Filiado f = new Filiado();
        f.setTelefone2("11ABCD12345");
    }

    @Test(expected = Exception.class)
    public void inserirTelefone2Nulo() {
        Filiado f = new Filiado();
        f.setTelefone2(null);
    }

    @Test(expected = Exception.class)
    public void inserirTelefone2Vazio() {
        Filiado f = new Filiado();
        f.setTelefone2(" ");
    }

    @Test
    public void inserirEmailValido() {
        Filiado f = new Filiado();
        f.setEmail("teste@gmail.com");
        Assert.assertEquals("teste@gmail.com", f.getEmail());
    }

    @Test(expected = Exception.class)
    public void inserirEmailInvalido() {
        Filiado f = new Filiado();
        f.setEmail("email.com");
    }

    @Test(expected = Exception.class)
    public void inserirEmailNulo() {
        Filiado f = new Filiado();
        f.setEmail(null);
    }

    @Test(expected = Exception.class)
    public void inserirEmailVazio() {
        Filiado f = new Filiado();
        f.setEmail(" ");
    }

    @Test
    public void inserirCpfValido() {
        Filiado f = new Filiado();
        f.setCpf("12345678911");
        Assert.assertEquals("12345678911", f.getCpf());
    }

    @Test(expected = Exception.class)
    public void inserirCpfInvalido() {
        Filiado f = new Filiado();
        f.setCpf("0");
    }

    @Test(expected = Exception.class)
    public void inserirCpfNulo() {
        Filiado f = new Filiado();
        f.setCpf(null);
    }

    @Test(expected = Exception.class)
    public void inserirCpfVazio() {
        Filiado f = new Filiado();
        f.setCpf(" ");
    }
}