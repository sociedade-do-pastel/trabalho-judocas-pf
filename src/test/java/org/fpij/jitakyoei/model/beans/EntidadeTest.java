package org.fpij.jitakyoei.model.beans;

import org.junit.Assert;
import org.junit.Test;

public class EntidadeTest {
    @Test
    public void inserirCnpjValido() {
        Entidade e = new Entidade();
        e.setCnpj("61.023.156/0001-82");
        Assert.assertEquals("61.023.156/0001-82", e.getCnpj());
    }

    @Test(expected = Exception.class)
    public void inserirCnpjInvalido(){
        Entidade e = new Entidade();
        e.setCnpj("11.111.111/ABCD-01");
    }

    @Test(expected = Exception.class)
    public void inserirCnpjNulo(){
        Entidade e = new Entidade();
        e.setCnpj(null);
    }

    @Test(expected = Exception.class)
    public void inserirCnpjVazio(){
        Entidade e = new Entidade();
        e.setCnpj("");
    }

    @Test
    public void inserirTelefone1Valido() {
        Entidade e = new Entidade();
        e.setTelefone1("(086)1234-5432");
        Assert.assertEquals("(086)1234-5432", e.getTelefone1());
    }

    @Test(expected = Exception.class)
    public void inserirTelefone1ComLetras() {
        Entidade e = new Entidade();
        e.setTelefone1("11ABCD12345");
    }

    @Test(expected = Exception.class)
    public void inserirTelefone1Nulo() {
        Entidade e = new Entidade();
        e.setTelefone1(null);
    }

    @Test(expected = Exception.class)
    public void inserirTelefone1Vazio() {
        Entidade e = new Entidade();
        e.setTelefone1(" ");
    }

    @Test
    public void inserirTelefone2Valido() {
        Entidade e = new Entidade();
        e.setTelefone2("(086)1234-5432");
        Assert.assertEquals("(086)1234-5432", e.getTelefone1());
    }

    @Test(expected = Exception.class)
    public void inserirTelefone2ComLetras() {
        Entidade e = new Entidade();
        e.setTelefone2("11ABCD12345");
    }

    @Test(expected = Exception.class)
    public void inserirTelefone2Nulo() {
        Entidade e = new Entidade();
        e.setTelefone2(null);
    }

    @Test(expected = Exception.class)
    public void inserirTelefone2Vazio() {
        Entidade e = new Entidade();
        e.setTelefone2(" ");
    }
}
