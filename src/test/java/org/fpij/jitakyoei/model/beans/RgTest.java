package org.fpij.jitakyoei.model.beans;

import org.junit.Assert;
import org.junit.Test;

public class RgTest {
    @Test
    public void inserirNumeroValido() {
        Rg r = new Rg();
        r.setNumero("1234567890");
        Assert.assertEquals("1234567890", r.getNumero());

        Rg r2 = new Rg("1234567890", "SSP");
        Assert.assertEquals("1234567890", r2.getNumero());
    }

    @Test(expected = Exception.class)
    public void inserirNumeroInvalidoConstrutor() {
        Rg r = new Rg("abcdefghi", "SSP");
    }

    @Test(expected = Exception.class)
    public void inserirNumeroInvalidoSetter() {
        Rg r = new Rg();
        r.setNumero("abcdefghi");
    }

    @Test(expected = Exception.class)
    public void inserirNumeroVazio() {
        Rg r = new Rg();
        r.setNumero(" ");
    }

    @Test(expected = Exception.class)
    public void inserirNumeroNulo() {
        Rg r = new Rg();
        r.setNumero(null);
    }
}
